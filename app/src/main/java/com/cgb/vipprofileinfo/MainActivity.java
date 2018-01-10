package com.cgb.vipprofileinfo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends BaseActivity {

    private android.widget.ImageView img1;
    private android.widget.ImageView img2;
    private android.widget.Button signup;
    private android.widget.Button login;
    private ImageView mainImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {


        mainImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

        Glide.with(mContext).load(R.drawable.main1).into(mainImg);

    }

    @Override
    public void bindViews() {
        this.mainImg = (ImageView) findViewById(R.id.mainImg);
    }
}
