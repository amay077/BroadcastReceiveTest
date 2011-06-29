package com.amay077.android.broadcastreceivetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TestBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("TestBroadcastReceiver", "onReceive() called."); 

	}

}
