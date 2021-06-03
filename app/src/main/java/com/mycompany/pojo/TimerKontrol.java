package com.mycompany.pojo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.mycompany.util.MainActivity;
import com.mycompany.util.NotlarActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Casper on 2.02.2018.
 */

public class TimerKontrol extends Activity {
    private final Context context;
    Timer myTimer;
    TimerTask gorev;

    public TimerKontrol(Context context) {
        this.context = context;
    }


    public void myTimerStart() {
        myTimer = new Timer();
        gorev = new TimerTask() {
            @Override
            public void run() {
                System.exit(0);
             /*   Intent i = new Intent(context,
                        MainActivity.class);
                startActivity(i);
               finish();*/
            }
        };

        myTimer.schedule(gorev, 10000);//3 dk aralıklarla çalışıyor
    }


    public void myTimerStop() {
        myTimer.cancel();
    }
}
