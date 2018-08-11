package com.example.pavan.pearlcoaching;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private RecyclerView imagePager;
    private RecyclerView.LayoutManager layoutManager;

    private ViewPager imageViewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        imagePager = findViewById(R.id.imagesPager);
//        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
//        layoutManager.canScrollHorizontally();
//        imagePager.setLayoutManager(layoutManager);
//        imagePager.setAdapter(new imagesAdapter(this));

        imageViewPager = findViewById(R.id.imageViewPager);
        tabLayout = findViewById(R.id.tabDots);
        tabLayout.setVisibility(View.VISIBLE);
        imageViewPager.setVisibility(View.VISIBLE);
        imageViewPager.setAdapter(new imageViewPagerAdapter(this));
        tabLayout.setupWithViewPager(imageViewPager);
    }
}
