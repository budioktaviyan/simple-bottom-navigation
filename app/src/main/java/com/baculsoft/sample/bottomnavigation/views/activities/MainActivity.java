package com.baculsoft.sample.bottomnavigation.views.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.baculsoft.sample.bottomnavigation.R;

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}