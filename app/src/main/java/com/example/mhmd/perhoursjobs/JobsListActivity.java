package com.example.mhmd.perhoursjobs;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class JobsListActivity extends Activity{

    List<jobsitem> jobsitemList;
    RecyclerView rv;

    jobsListAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        ImageButton mapes = findViewById(R.id.location);
        mapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JobsListActivity.this , Locations_Maps.class);
                startActivity(intent);
            }
        });

        rv = findViewById(R.id.rv);

        rv.setHasFixedSize(true);

        LinearLayoutManager manger = new LinearLayoutManager(this);
        rv.setLayoutManager(manger);

        intializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {
        adapter = new jobsListAdapter(jobsitemList);
        rv.setAdapter(adapter);
    }

    private void intializeData() {
        jobsitemList = new ArrayList<>();

        jobsitemList.add(new jobsitem("image","Data Entiry","IKEA","110 KM","120 SAR","20 View","Job"));
        jobsitemList.add(new jobsitem("image","Data Entiry","IKEA","110 KM","120 SAR","20 View","Job"));
        jobsitemList.add(new jobsitem("image","Data Entiry","IKEA","110 KM","120 SAR","20 View","Job"));
        jobsitemList.add(new jobsitem("image","Data Entiry","IKEA","110 KM","120 SAR","20 View","Job"));
        jobsitemList.add(new jobsitem("image","Data Entiry","IKEA","110 KM","120 SAR","20 View","Job"));
        jobsitemList.add(new jobsitem("image","Data Entiry","IKEA","110 KM","120 SAR","20 View","Job"));
    }
}
