package com.project.network.ssugaeting.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.adapters.ProfileAdapter;
import com.project.network.ssugaeting.item.Profile;

public class ProfileFragment extends Fragment {

    private ProfileAdapter adapter;
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
        adapter=new ProfileAdapter(getContext());
        adapter.addItem(new Profile("김용현", "俺はこの世界を支配する男だぜ"));
        adapter.addItem(new Profile("김용현", "나는 이 세계를 지배할 남자다."));
        adapter.addItem(new Profile("김용현", "俺はこの世界を支配する男だぜ"));
        adapter.addItem(new Profile("김용현", "나는 이 세계를 지배할 남자다."));
        adapter.addItem(new Profile("김용현", "俺はこの世界を支配する男だぜ"));
        adapter.addItem(new Profile("김용현", "나는 이 세계를 지배할 남자다."));
        adapter.addItem(new Profile("김용현", "俺はこの世界を支配する男だぜ"));
        adapter.addItem(new Profile("김용현", "나는 이 세계를 지배할 남자다."));
        adapter.addItem(new Profile("김용현", "俺はこの世界を支配する男だぜ"));
        adapter.addItem(new Profile("김용현", "나는 이 세계를 지배할 남자다."));
        profileList.setAdapter(adapter);

        return view;
    }

}
