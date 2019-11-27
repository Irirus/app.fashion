package com.example.nomorepleze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class HatActivity extends AppCompatActivity {

    private ArrayList<ListItem> mHatList;

    private RecyclerView mRecyclerView;
    private Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_activity);

        createHatList();
        buildRecyclerView();

    }

    public void createHatList(){
        mHatList = new ArrayList<>();

        mHatList.add(new ListItem(R.drawable.hatba, "Line 1", "Line 2" ));
        mHatList.add(new ListItem(R.drawable.hatbay, "Line 3", "Line 4" ));
        mHatList.add(new ListItem(R.drawable.hatbon, "Line 5", "Line 6" ));
        mHatList.add(new ListItem(R.drawable.hatchin, "Line 5", "Line 6" ));
        mHatList.add(new ListItem(R.drawable.hatmot, "Line 5", "Line 6" ));
        mHatList.add(new ListItem(R.drawable.hatmuoi, "Line 5", "Line 6" ));
        mHatList.add(new ListItem(R.drawable.hatnam, "Line 5", "Line 6" ));
        mHatList.add(new ListItem(R.drawable.hatsau, "Line 5", "Line 6" ));
        mHatList.add(new ListItem(R.drawable.hattam, "Line 5", "Line 6" ));
        mHatList.add(new ListItem(R.drawable.hathai, "Line 5", "Line 6" ));
    }



    public void buildRecyclerView(){
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(mHatList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new Adapter.OnItemClickListener(){
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
