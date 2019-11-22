package com.example.nomorepleze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class HatActivity extends AppCompatActivity {

    private ArrayList<HatItem> mHatList;

    private RecyclerView mRecyclerView;
    private HatAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hat);

        createHatList();
        buildRecyclerView();

    }

    public void createHatList(){
        mHatList = new ArrayList<>();

        mHatList.add(new HatItem(R.drawable.hatba, "Line 1", "Line 2" ));
        mHatList.add(new HatItem(R.drawable.hatbay, "Line 3", "Line 4" ));
        mHatList.add(new HatItem(R.drawable.hatbon, "Line 5", "Line 6" ));
        mHatList.add(new HatItem(R.drawable.hatchin, "Line 5", "Line 6" ));
        mHatList.add(new HatItem(R.drawable.hatmot, "Line 5", "Line 6" ));
        mHatList.add(new HatItem(R.drawable.hatmuoi, "Line 5", "Line 6" ));
        mHatList.add(new HatItem(R.drawable.hatnam, "Line 5", "Line 6" ));
        mHatList.add(new HatItem(R.drawable.hatsau, "Line 5", "Line 6" ));
        mHatList.add(new HatItem(R.drawable.hattam, "Line 5", "Line 6" ));
        mHatList.add(new HatItem(R.drawable.hathai, "Line 5", "Line 6" ));
    }



    public void buildRecyclerView(){
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new HatAdapter(mHatList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new HatAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(int position){
                Intent intent = new Intent();
                intent.putExtra("keyHat", mHatList.get(position));

                setResult(RESULT_OK, intent);

                finish();
            }
        });


    }
}
