package com.project.network.ssugaeting.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.item.Profile;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileModifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_modify);

        Profile mProfile=SaveSharedPreference.getProfile(this);

        final CircleImageView proPhotoImage=(CircleImageView)findViewById(R.id.iv_profilePhoto);
        final TextView proNameText=(TextView)findViewById(R.id.et_profileName);
        final TextView proSexText=(TextView)findViewById(R.id.et_profileSex);
        final TextView proStateMsgText=(TextView)findViewById(R.id.et_profileStateMsg);
        final TextView proAgeText=(TextView)findViewById(R.id.et_profileAge);
        final TextView proHeightText=(TextView)findViewById(R.id.et_profileHeight);
        final TextView proAddressText=(TextView)findViewById(R.id.et_profileAddress);
        final TextView proHobbyText=(TextView)findViewById(R.id.et_profileHobby);
        final TextView proUniversityText=(TextView)findViewById(R.id.et_profileUniversity);
        final TextView proMajorText=(TextView)findViewById(R.id.et_profileMajor);

        // Set Profile Layout
        proPhotoImage.setImageResource(R.drawable.yonghyeon); // Need Modify
        proNameText.setText(mProfile.getName());
        proSexText.setText(mProfile.getSex());
        proStateMsgText.setText(mProfile.getStateMsg());
        proAgeText.setText(mProfile.getAge());
        proHeightText.setText(mProfile.getHeight());
        proAddressText.setText(mProfile.getAddress());
        proHobbyText.setText(mProfile.getHobby());
        proUniversityText.setText(mProfile.getUniversity());
        proMajorText.setText(mProfile.getMajor());

        final Button modifyCompleteButton=(Button)findViewById(R.id.btn_modifyComplete);
        modifyCompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // access Server
                finish();
            }
        });
    }
}
