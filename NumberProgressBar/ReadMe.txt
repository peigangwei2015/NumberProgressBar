���뵽��Ŀ��
��һ������NumberProgressBar.jar��ӵ���ĿlibsĿ¼��
�ڶ�������attrs.xml�ļ���ӵ�/res/values/Ŀ¼��
���������ڲ�����������£�
  <com.daimajia.numberprogressbar.NumberProgressBar
        android:id="@+id/number_progress_bar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
         />
         
���Ĳ�����JAVA������ʹ�ã�
		NumberProgressBar mNBar = (NumberProgressBar) findViewById(R.id.number_progress_bar);
		//���ý���
		mNBar.setProgress(50);
		//�������ֵ
			mNBar.setMax(100);
