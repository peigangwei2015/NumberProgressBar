# NumberProgressBar
这是一个数字进度条使用步骤如下：

第一步：将NumberProgressBar.jar添加到项目libs目录中

第二步：将attrs.xml文件添加到/res/values/目录中

第三步：在布局中添加如下：
  <com.daimajia.numberprogressbar.NumberProgressBar
        android:id="@+id/number_progress_bar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
         />
         
第四部：在JAVA代码中使用：
		NumberProgressBar mNBar = (NumberProgressBar) findViewById(R.id.number_progress_bar);
		//设置进度
		mNBar.setProgress(50);
		//设置最大值
			mNBar.setMax(100);
