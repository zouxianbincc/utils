package com.lib.app;

import android.app.Application;

/**
 * 在 mainfast 文件中注册
 * <application
 *   android:name="com.example.textexception.AppContext"
 *   android:allowBackup="true"
 *   .....
 *   ></application>
 * 
 * @author pei
 */
public class ComContext extends Application{

	private static ComContext instance;

	public static synchronized ComContext getInstance() {
		return instance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
	}


}
