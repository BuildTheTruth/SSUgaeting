package com.project.network.ssugaeting.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
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
import com.project.network.ssugaeting.databinding.FragmentMyprofileBinding;
import com.project.network.ssugaeting.item.Profile;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyProfileFragment extends Fragment {

    FragmentMyprofileBinding binding;

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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_myprofile, container, false);

        Profile mProfile = SaveSharedPreference.getProfile(getContext());

        // Set Profile Layout
        binding.ivMyPhoto.setImageResource(R.mipmap.ic_person_base); // Need Modify
        binding.tvMyName.setText(mProfile.getName());
        binding.tvMySex.setText(mProfile.getSex());
        binding.tvMyStateMsg.setText(mProfile.getStateMsg());
        binding.tvMyAge.setText(mProfile.getAge());
        binding.tvMyHeight.setText(mProfile.getHeight());
        binding.tvMyAddress.setText(mProfile.getAddress());
        binding.tvMyMajor.setText(mProfile.getMajor());
        binding.tvMyReligion.setText(mProfile.getReligion());
        binding.tvMyHobby.setText(mProfile.getHobby());
        binding.tvMyCollege.setText(mProfile.getCollege());
        binding.tvMyCircle.setText(mProfile.getCircle());
        binding.tvMyAbroadExperience.setText(mProfile.getAbroadExperience());
        binding.tvMyMilitaryStatus.setText(mProfile.getMilitaryStatus());

        binding.btnProfileModify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProfileModifyActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        View view = binding.getRoot();
        return view;
    }

}

