package com.project.network.ssugaeting.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.activity.ProfileActivity;
import com.project.network.ssugaeting.activity.ProfileModifyActivity;
import com.project.network.ssugaeting.activity.SaveSharedPreference;
import com.project.network.ssugaeting.item.Profile;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyProfileFragment extends Fragment {
    public MyProfileFragment() {
    }

    public static MyProfileFragment newInstance() {
        return new MyProfileFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_myprofile, container, false);

        Profile mProfile= SaveSharedPreference.getProfile(getContext());

        final CircleImageView proPhotoImage=(CircleImageView)view.findViewById(R.id.iv_myPhoto);
        final TextView proNameText=(TextView)view.findViewById(R.id.tv_myName);
        final TextView proSexText=(TextView)view.findViewById(R.id.tv_mySex);
        final TextView proStateMsgText=(TextView)view.findViewById(R.id.tv_myStateMsg);
        final TextView proAgeText=(TextView)view.findViewById(R.id.tv_myAge);
        final TextView proHeightText=(TextView)view.findViewById(R.id.tv_myHeight);
        final TextView proAddressText=(TextView)view.findViewById(R.id.tv_myAddress);
        final TextView proHobbyText=(TextView)view.findViewById(R.id.tv_myHobby);
        final TextView proUniversityText=(TextView)view.findViewById(R.id.tv_myUniversity);
        final TextView proMajorText=(TextView)view.findViewById(R.id.tv_myMajor);

        final Button modifyButton=(Button)view.findViewById(R.id.btn_profileModify);

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

        modifyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ProfileModifyActivity.class));
            }
        });

        return view;
    }

}

