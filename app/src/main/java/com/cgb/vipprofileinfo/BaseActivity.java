package com.cgb.vipprofileinfo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ziO on 2017-12-21.
 */

public abstract class BaseActivity extends AppCompatActivity {

    Context mContext = this;

    public abstract void setupEvents();

    public abstract void setValues();

    public abstract void bindViews();
}
