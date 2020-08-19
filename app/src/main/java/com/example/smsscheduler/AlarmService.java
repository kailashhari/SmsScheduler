package com.example.smsscheduler;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.telephony.SmsManager;

import androidx.annotation.Nullable;

public class AlarmService extends Service{



    @Override
    public void onStart(Intent i, int startId) {
        // TODO Auto-generated method stub
        String SPhone =i.getStringExtra("msgPhone");
        String SSms = i.getStringExtra("msgSmS");

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(SPhone, null, SSms, null, null);

    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}