package com.pkt.android.tilerepeat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends Activity{
	private static final String TAG = "MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate entry");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.d(TAG, "onCreate exit");
	}
}
