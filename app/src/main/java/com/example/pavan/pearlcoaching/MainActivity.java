package com.example.pavan.pearlcoaching;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private RecyclerView imagePager;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagePager = findViewById(R.id.imagesPager);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.canScrollHorizontally();
        imagePager.setLayoutManager(layoutManager);
        imagePager.setAdapter(new imagesAdapter(this));

    }
}
