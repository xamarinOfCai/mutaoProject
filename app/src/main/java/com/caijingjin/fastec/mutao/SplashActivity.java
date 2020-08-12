package com.caijingjin.fastec.mutao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * 闪屏页面
 */
public class SplashActivity extends AppCompatActivity {

    protected Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        },2000);
    }
}