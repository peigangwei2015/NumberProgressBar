package com.pgw.numberprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.daimajia.numberprogressbar.NumberProgressBar;

public class MainActivity extends Activity implements OnClickListener {
	private NumberProgressBar mNBar;
	private Button bt_start, bt_stop;
	private int postion = 0;
	private boolean isStart = false;

	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {

			mNBar.setProgress(postion);
			postion++;

		};
	};

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start:
			startProgress();
			break;
		case R.id.stop:
			stopProgress();
			break;

		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mNBar = (NumberProgressBar) findViewById(R.id.number_progress_bar);
		bt_start = (Button) findViewById(R.id.start);
		bt_stop = (Button) findViewById(R.id.stop);
		bt_start.setOnClickListener(this);
		bt_stop.setOnClickListener(this);
	}

	private void startProgress() {
		isStart = true;
		new Thread() {
			public void run() {
				while (isStart && postion != mNBar.getMax()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					handler.obtainMessage().sendToTarget();
				}
			}

		}.start();
	}

	private void stopProgress() {
		isStart = false;
	}

}
