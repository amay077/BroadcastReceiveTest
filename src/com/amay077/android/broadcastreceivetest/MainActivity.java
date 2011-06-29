package com.amay077.android.broadcastreceivetest;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
	protected static final String TAG = "MainActivity";
	public static String ACTION = "test_action";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        BroadcastReceiver receiver = new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context context, Intent intent) {
				Log.d(TAG, "onReceive() called.");
			}
		};
		
		registerReceiver(receiver, new IntentFilter(ACTION));
    }
    
    public void onButtonClick(View view) {
    	Intent intent = new Intent(ACTION);
    	Context context = getApplicationContext();
    	
    	context.sendBroadcast(intent);
    }
}