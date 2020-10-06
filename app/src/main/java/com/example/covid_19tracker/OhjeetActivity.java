package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class OhjeetActivity extends AppCompatActivity {

    private int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohjeet);
    }

    public void Luelisaa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thl.fi"));
        startActivity(intent);
    }

    public void MainActivity(View view) {
        SharedPreferences getpref = getSharedPreferences("value", Activity.MODE_PRIVATE);
        int num = getpref.getInt("countryIndex", x);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void LocationActivity(View view) {
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }

}