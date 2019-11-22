package com.example.nomorepleze;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CreateActivity extends AppCompatActivity {

    private static final int HAT_ACTIVITY_REQUEST_CODE = 0;

    private static final String LOG_TAG = CreateActivity.class.getSimpleName();

    ImageView imageHat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        imageHat = findViewById(R.id.hat);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == HAT_ACTIVITY_REQUEST_CODE)
            if (resultCode == RESULT_OK)
            {
                HatItem hatItem = data.getParcelableExtra("keyHat");

                int imgRes = hatItem.getmImageResource();
                imageHat.setImageResource(imgRes);

            }
    }

    public void launchHatActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, HatActivity.class);
        startActivityForResult(intent, HAT_ACTIVITY_REQUEST_CODE);

    }
}