package com.shanswanlow.alcchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadAlc(View view)
    {
        Intent webviewIntent = new Intent(this, AlcWebViewActivity.class);
        startActivity(webviewIntent);
    }

    public void loadProfile(View view)
    {
        Intent profileIntent = new Intent(this, ViewProfileActivity.class);
        startActivity(profileIntent);
    }
}
