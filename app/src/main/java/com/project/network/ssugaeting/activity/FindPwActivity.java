package com.project.network.ssugaeting.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.databinding.ActivityFindPwBinding;

public class FindPwActivity extends AppCompatActivity {

    ActivityFindPwBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_find_pw);
    }
}
