package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CustomerHome extends AppCompatActivity {

    Toolbar toolbar ;

    de.hdodenhof.circleimageview.CircleImageView loginBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        toolbar = findViewById(R.id.customerHomeToolBarId);
        setSupportActionBar(toolbar);

        loginBtnImageView = findViewById(R.id.loginBtnNewHomeId);
        loginBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLoginActivity = new Intent(CustomerHome.this, MainActivity.class);
                startActivity(toLoginActivity);
            }
        });
    }
}
