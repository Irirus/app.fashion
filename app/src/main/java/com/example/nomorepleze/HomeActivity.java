package com.example.nomorepleze;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class HomeActivity extends AppCompatActivity {


    private static final String LOG_TAG = HomeActivity.class.getSimpleName();

    private static final String TAG = "HomeActivity";

    //private ArrayList<String> mNames = new ArrayList<>();
    //private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started.");

    }


    
    public void launchSearchActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentsearch = new Intent(this, SearchActivity.class);
        startActivity(intentsearch);
    }

    public void launchCreateActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentcreate = new Intent (this, CreateActivity.class);
        startActivity(intentcreate);
    }

    public void launchSaveActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentsave = new Intent (this, SaveActivity.class);
        startActivity(intentsave);
    }

    public void launchAccountActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentaccount = new Intent (this, LoginActivity.class);
        startActivity(intentaccount);
    }

    public void launchWebView1(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentrecycle = new Intent(this, WebView1.class);
        startActivity(intentrecycle);
    }

    public void launchWebView2(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentrecycle = new Intent(this, WebView2.class);
        startActivity(intentrecycle);
    }

    public void launchWebView3(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentrecycle = new Intent(this, WebView3.class);
        startActivity(intentrecycle);
    }

    public void launchWebView4(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentrecycle = new Intent(this, WebView4.class);
        startActivity(intentrecycle);
    }

    public void launchWebView5(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentrecycle = new Intent(this, WebView5.class);
        startActivity(intentrecycle);
    }

    public void launchWebView6(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentrecycle = new Intent(this, WebView6.class);
        startActivity(intentrecycle);
    }
}
