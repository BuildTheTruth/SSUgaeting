package com.project.network.ssugaeting.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.item.Profile;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final CircleImageView proPhotoImage=(CircleImageView)findViewById(R.id.iv_profilePhoto);
        final TextView proNameText=(TextView)findViewById(R.id.tv_profileName);
        final TextView proSexText=(TextView)findViewById(R.id.tv_profileSex);
        final TextView proStateMsgText=(TextView)findViewById(R.id.tv_profileStateMsg);
        final TextView proAgeText=(TextView)findViewById(R.id.tv_profileAge);
        final TextView proHeightText=(TextView)findViewById(R.id.tv_profileHeight);
        final TextView proAddressText=(TextView)findViewById(R.id.tv_profileAddress);
        final TextView proHobbyText=(TextView)findViewById(R.id.tv_profileHobby);
        final TextView proUniversityText=(TextView)findViewById(R.id.tv_profileUniversity);
        final TextView proMajorText=(TextView)findViewById(R.id.tv_profileMajor);

        final Button connReqButton=(Button)findViewById(R.id.btn_connectRequest);
        final Button cancelButton=(Button)findViewById(R.id.btn_profileCancel);

        // From ProfileFragment
        final Intent intent=ProfileActivity.this.getIntent();
        final Profile mProfile=intent.getParcelableExtra("SELECTED_PROFILE");

        // Set Profile Layout
        proPhotoImage.setImageResource(R.drawable.yonghyeon); // Need Revision
        proNameText.setText(mProfile.getName());
        proSexText.setText(mProfile.getSex());
        proStateMsgText.setText(mProfile.getStateMsg());
        proAgeText.setText(mProfile.getAge());
        proHeightText.setText(mProfile.getHeight());
        proAddressText.setText(mProfile.getAddress());
        proHobbyText.setText(mProfile.getHobby());
        proUniversityText.setText(mProfile.getUniversity());
        proMajorText.setText(mProfile.getMajor());

        connReqButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
