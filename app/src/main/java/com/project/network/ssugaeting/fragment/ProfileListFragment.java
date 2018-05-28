package com.project.network.ssugaeting.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
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
import com.project.network.ssugaeting.databinding.FragmentProfileListBinding;
import com.project.network.ssugaeting.item.Profile;

public class ProfileListFragment extends Fragment {

    private ProfileAdapter profileAdapter;

    FragmentProfileListBinding binding;

    public ProfileListFragment() {}

    public static ProfileListFragment newInstance() {
        return new ProfileListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_profile_list, container, false);
        profileAdapter = new ProfileAdapter(getContext());

        // sample
        profileAdapter.addItem(new Profile("admin", "123", "admin@soongsil.ac.kr", "관리자","남성"));
        profileAdapter.addItem(new Profile("id", "password", "email@soongsil.ac.kr", "김용현", "남성",
                "좋은 사람 만나고 싶어요","23","180","서울시 상도동","사진",
                "IT대학","컴퓨터학부","url","무교","친목",
                "경험없음","미필"));

        binding.lvProfileList.setAdapter(profileAdapter);

        binding.lvProfileList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                Profile mProfile = (Profile) profileAdapter.getItem(position);
                intent.putExtra("SELECTED_PROFILE", mProfile);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        View view=binding.getRoot();
        return view;
    }

}
