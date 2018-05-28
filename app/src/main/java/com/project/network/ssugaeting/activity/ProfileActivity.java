package com.project.network.ssugaeting.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.databinding.ActivityProfileBinding;
import com.project.network.ssugaeting.item.Profile;


public class ProfileActivity extends AppCompatActivity {

    ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_profile);


        // From ProfileFragment
        final Intent intent=ProfileActivity.this.getIntent();
        final Profile mProfile=intent.getParcelableExtra("SELECTED_PROFILE");

        // Set Profile Layout
        binding.ivProfilePhoto.setImageResource(R.mipmap.ic_person_base); // Need Modify
        binding.tvProfileName.setText(mProfile.getName());
        binding.tvProfileSex.setText(mProfile.getSex());
        binding.tvProfileStateMsg.setText(mProfile.getStateMsg());
        binding.tvProfileAge.setText(mProfile.getAge());
        binding.tvProfileHeight.setText(mProfile.getHeight());
        binding.tvProfileAddress.setText(mProfile.getAddress());
        binding.tvProfileMajor.setText(mProfile.getMajor());
        binding.tvProfileReligion.setText(mProfile.getReligion());
        binding.tvProfileHobby.setText(mProfile.getHobby());
        binding.tvProfileCollege.setText(mProfile.getCollege());
        binding.tvProfileCircle.setText(mProfile.getCircle());
        binding.tvProfileAbroadExperience.setText(mProfile.getAbroadExperience());
        binding.tvProfileMilitaryStatus.setText(mProfile.getMilitaryStatus());

        binding.btnConnectRequest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        binding.btnProfileCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
