package com.example.bridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Bundle;
import android.util.Log;

public class BridgeService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (intent != null) {
            Bundle b = intent.getExtras();

            if (b != null) {
                String cmd = b.getString("cmd");
                Log.d("TermuxBridge", "CMD=" + cmd);
            }
        }

        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
