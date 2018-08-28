package com.example.newfbtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(getApplicationContext());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String url = extras.getString("url");
            String value = extras.getString("title");
            Log.d(TAG, url + " " + value);
            myWebView.loadUrl(url);
        } else {
            myWebView.loadUrl("https://www.ufokusu.rs");
        }
        setContentView(myWebView);
    }
}
