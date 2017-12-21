package com.cgb.vipprofileinfo;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoginActivity extends BaseActivity {

    private WebView webview; //웹뷰

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        webview.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
        webview.loadUrl("http://dododo.raonnet.com/g5/bbs/board.php?bo_table=test");
    }


    @Override
    public void bindViews() {
        this.webview = (WebView) findViewById(R.id.webview);
    }
}
