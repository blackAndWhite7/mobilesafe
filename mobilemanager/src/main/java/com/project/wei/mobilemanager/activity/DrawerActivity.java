package com.project.wei.mobilemanager.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.project.wei.mobilemanager.R;

public class DrawerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        getSupportActionBar().hide();
    }
}
