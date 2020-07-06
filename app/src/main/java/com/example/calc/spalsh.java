package com.example.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class spalsh extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh);
        Timer time=new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent in=new Intent(spalsh.this,MainActivity.class);
                startActivity(in);
                finish();
            }
        },2000);

    }
}
