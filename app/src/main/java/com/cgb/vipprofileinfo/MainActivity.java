package com.cgb.vipprofileinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends BaseActivity {

    private android.widget.ImageView img1;
    private android.widget.ImageView img2;
    private android.widget.Button signup;
    private android.widget.Button login;

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

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.login = (Button) findViewById(R.id.login);
        this.signup = (Button) findViewById(R.id.signup);
        this.img2 = (ImageView) findViewById(R.id.img2);
        this.img1 = (ImageView) findViewById(R.id.img1);

    }
}
