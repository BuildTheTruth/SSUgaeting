package com.project.network.ssugaeting.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.activity.ProfileActivity;
import com.project.network.ssugaeting.adapters.ProfileAdapter;
import com.project.network.ssugaeting.item.Profile;

public class ProfileFragment extends Fragment {

    private ProfileAdapter profileAdapter;
    private ListView profileList;

    public ProfileFragment() {
    }

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_list, container, false);
        profileList = (ListView) view.findViewById(R.id.rv_profileList);
        profileAdapter = new ProfileAdapter(getContext());
        profileAdapter.addItem(new Profile("김용현", "俺はこの世界を支配する男だぜ"));
        profileAdapter.addItem(new Profile("id", "password", "email", "용현", "남성", "나는 남자다.", "23", "180", "서울시", "사진", "대학생", "숭실대", "url"));
        profileList.setAdapter(profileAdapter);

        profileList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                Profile mProfile = (Profile) profileAdapter.getItem(position);
                intent.putExtra("SELECTED_PROFILE", mProfile);
                startActivity(intent);
            }
        });

        return view;
    }

}
