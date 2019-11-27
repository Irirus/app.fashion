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
    private static final int SHIRT_ACTIVITY_REQUEST_CODE = 1;
    private static final int TROUSERS_ACTIVITY_REQUEST_CODE = 2;
    private static final int SHOE_ACTIVITY_REQUEST_CODE = 3;
    private static final int BAG_ACTIVITY_REQUEST_CODE = 4;


    private static final String LOG_TAG = CreateActivity.class.getSimpleName();

    ImageView imageHat;
    ImageView imageShirt;
    ImageView imageTrousers;
    ImageView imageShoe;
    ImageView imageBag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        imageHat = findViewById(R.id.hat);
        imageShirt = findViewById(R.id.shirt);
        imageTrousers = findViewById(R.id.trousers);
        imageShoe = findViewById(R.id.shoe);
        imageBag = findViewById(R.id.bag);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

       if (requestCode == HAT_ACTIVITY_REQUEST_CODE)
            if (resultCode == RESULT_OK)
            {
                ListItem hatItem = data.getParcelableExtra("keyHat");

                int imgRes = hatItem.getmImageResource();
                imageHat.setImageResource(imgRes);
            }

       if (requestCode == SHIRT_ACTIVITY_REQUEST_CODE)
           if (resultCode == RESULT_OK)
           {
                ListItem shirtItem = data.getParcelableExtra("keyShirt");

                int imgRes = shirtItem.getmImageResource();
                imageShirt.setImageResource(imgRes);
           }

       if (requestCode == TROUSERS_ACTIVITY_REQUEST_CODE)
           if (resultCode == RESULT_OK)
           {
                ListItem trousersItem = data.getParcelableExtra("keyTrousers");

                int imgRes = trousersItem.getmImageResource();
                imageTrousers.setImageResource(imgRes);
           }

       if (requestCode == SHOE_ACTIVITY_REQUEST_CODE)
            if (resultCode == RESULT_OK)
            {
                ListItem shoeItem = data.getParcelableExtra("keyShoe");

                int imgRes = shoeItem.getmImageResource();
                imageShoe.setImageResource(imgRes);
            }

       if (requestCode == BAG_ACTIVITY_REQUEST_CODE)
           if (resultCode == RESULT_OK)
           {
                ListItem bagItem = data.getParcelableExtra("keyBag");

                int imgRes = bagItem.getmImageResource();
                imageBag.setImageResource(imgRes);
           }
    }


    public void launchHatActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, HatActivity.class);
        startActivityForResult(intent, HAT_ACTIVITY_REQUEST_CODE);
    }

    public void launchShirtActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, ShirtActivity.class);
        startActivityForResult(intent, SHIRT_ACTIVITY_REQUEST_CODE);
    }

    public void launchTrousersActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, TrousersActivity.class);
        startActivityForResult(intent, TROUSERS_ACTIVITY_REQUEST_CODE);
    }

    public void launchShoeActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, ShoeActivity.class);
        startActivityForResult(intent, SHOE_ACTIVITY_REQUEST_CODE);
    }

    public void launchBagActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, BagActivity.class);
        startActivityForResult(intent, BAG_ACTIVITY_REQUEST_CODE);
    }
}
