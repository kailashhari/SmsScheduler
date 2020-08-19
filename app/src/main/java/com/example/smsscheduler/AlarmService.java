package com.example.smsscheduler;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.telephony.SmsManager;

public class AlarmService extends Service{

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int onStartCommand(Intent i, int flags, int startId) {
        // TODO Auto-generated method stub
        String SPhone =i.getStringExtra("msgPhone");
        String SSms = i.getStringExtra("msgSmS");

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(SPhone, null, SSms, null, null);

        return START_STICKY;
    }

}