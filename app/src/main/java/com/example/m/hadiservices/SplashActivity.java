package com.example.m.hadiservices;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent fromSplashToMainLogin = new Intent(SplashActivity.this, CustomerHome.class);
                startActivity(fromSplashToMainLogin);
                finish();

            }
        },SPLASH_TIME_OUT);

    }
}
