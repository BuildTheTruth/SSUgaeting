package com.project.network.ssugaeting.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.databinding.ActivityFindIdBinding;

public class FindIdActivity extends AppCompatActivity {

    ActivityFindIdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_find_id);
    }
}
