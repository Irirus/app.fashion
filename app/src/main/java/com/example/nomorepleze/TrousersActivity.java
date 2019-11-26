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

public class TrousersActivity extends AppCompatActivity {

    private ArrayList<TrousersItem> mTrousersList;

    private RecyclerView mRecyclerView_trousers;
    private TrousersAdapter mAdapter_trousers;
    private RecyclerView.LayoutManager mLayoutManager_trousers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trousers);

        createTrousersList();
        buildRecyclerView();

    }

    public void createTrousersList(){
        mTrousersList = new ArrayList<>();

        mTrousersList.add(new TrousersItem(R.drawable.hatba, "Line 1", "Line 2" ));
        mTrousersList.add(new TrousersItem(R.drawable.hatbay, "Line 3", "Line 4" ));
        mTrousersList.add(new TrousersItem(R.drawable.hatbon, "Line 5", "Line 6" ));
        mTrousersList.add(new TrousersItem(R.drawable.hatchin, "Line 5", "Line 6" ));
        mTrousersList.add(new TrousersItem(R.drawable.hatmot, "Line 5", "Line 6" ));
        mTrousersList.add(new TrousersItem(R.drawable.hatmuoi, "Line 5", "Line 6" ));
        mTrousersList.add(new TrousersItem(R.drawable.hatnam, "Line 5", "Line 6" ));
        mTrousersList.add(new TrousersItem(R.drawable.hatsau, "Line 5", "Line 6" ));
        mTrousersList.add(new TrousersItem(R.drawable.hattam, "Line 5", "Line 6" ));
        mTrousersList.add(new TrousersItem(R.drawable.hathai, "Line 5", "Line 6" ));
    }



    public void buildRecyclerView(){
        mRecyclerView_trousers = findViewById(R.id.recyclerView_trousers);
        mRecyclerView_trousers.setHasFixedSize(true);
        mLayoutManager_trousers = new LinearLayoutManager(this);
        mAdapter_trousers = new TrousersAdapter(mTrousersList);

        mRecyclerView_trousers.setLayoutManager(mLayoutManager_trousers);
        mRecyclerView_trousers.setAdapter(mAdapter_trousers);



        mAdapter_trousers.setOnItemClickListener(new TrousersAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(int position){
                Intent intent = new Intent();
                intent.putExtra("keyTrousers", mTrousersList.get(position));

                setResult(RESULT_OK, intent);

                finish();
            }
        });


    }
}
