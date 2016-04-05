package com.bibliasagrada;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.bibliasagrada.adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    public Toolbar toolbar;
    public TabLayout tabLayout;
    public ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        tabLayout.setupWithViewPager(viewPager);

    }

    public void init() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        updateFragments();

    }

    private void updateFragments() {
        try {
            viewPager.setAdapter(new PagerAdapter(this, getSupportFragmentManager()));
        } catch (IllegalStateException e) {
        }
    }
}