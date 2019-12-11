package com.example.nomorepleze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        mUser = FirebaseAuth.getInstance().getCurrentUser();
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
<<<<<<< HEAD:app/src/main/java/com/example/nomorepleze/HomeActivity.java
        if (mUser != null) {
            Log.d(LOG_TAG, "Button Clicked!");
            Intent intentsave = new Intent(this, SaveActivity.class);
            startActivity(intentsave);
        }
        else
        {
            Toast.makeText(HomeActivity.this, "You have to sign in first!", Toast.LENGTH_SHORT).show();
        }
    }

    public void launchAccountActivity(View view) {

        if (mUser != null) {
            Log.d(LOG_TAG, "Button Clicked!");
            Intent intentaccount = new Intent(this, AccountActivity.class);
            startActivity(intentaccount);
        }
        else {
            Log.d(LOG_TAG, "Button Clicked!");
            Intent intentsignin = new Intent(this, LoginActivity.class);
            startActivity(intentsignin);
        }
=======
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intentsave = new Intent (this, SaveActivity.class);
        startActivity(intentsave);
>>>>>>> parent of 5f6b6a1... Merge branch 'master' of https://github.com/Irirus/app.fashion:app/src/main/java/com/example/nomorepleze/MainActivity.java
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
