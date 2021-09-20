package com.example.designtests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask splashScreen = new TimerTask() {
            @Override
            public void run() {
                Intent splash = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(splash);
                finish();
            }
        };
        Timer time = new Timer();
        time.schedule(splashScreen, 1500);
    }

}