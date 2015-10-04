package com.example.panta.somsak.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //หน่วงไว้ 8 วิ
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //กำหนดการทำงานให้จาก หน้าปัจจุบัน ไปหน้า MainActivity
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                
                //ไม่ให้ปุ่ม Back หน้า MainActivity กลับมาหน้า Splash  ได้
                finish();
            }
        }, 8000);

        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_tata);
        introMediaPlayer.start();



    }//On Create
} //Main Class

