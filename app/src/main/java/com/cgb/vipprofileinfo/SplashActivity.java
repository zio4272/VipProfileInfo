package com.cgb.vipprofileinfo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashActivity extends BaseActivity {

    private android.widget.ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bindViews();
        setupEvents();
        setValues();


    }

    @Override
    public void setupEvents() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myIntent = new Intent(mContext, LoginActivity.class);
                startActivity(myIntent);
                finish();
            }
        }, 3000);


    }

    @Override
    public void setValues() {

        Glide.with(mContext).load(R.drawable.sp1).into(img);

    }

    @Override
    public void bindViews() {
        this.img = (ImageView) findViewById(R.id.img);

    }
}
