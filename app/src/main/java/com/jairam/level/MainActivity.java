package com.jairam.level;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setpage();

    }

    public void setpage(){

        myweb = (WebView) findViewById(R.id.myViewId);
        WebSettings mysettings= myweb.getSettings();
        mysettings.setJavaScriptEnabled(true);
        myweb.loadUrl("http://tungabhadraboard.in/tbbrsms/reservoir_info_report.php");
        myweb.setWebViewClient(new WebViewClient());
    }

    public void onBackPressed(){

        if(myweb.canGoBack())
            myweb.goBack();
        else
        super.onBackPressed();

    }
}
