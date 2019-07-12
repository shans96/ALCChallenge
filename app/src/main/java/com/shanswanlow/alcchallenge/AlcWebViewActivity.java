package com.shanswanlow.alcchallenge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AlcWebViewActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_webview);
        WebView alcWebView = findViewById(R.id.alc_webview);
        alcWebView.setWebViewClient(new WebViewClient());
        alcWebView.loadUrl(getString(R.string.alc_url));
    }
}
