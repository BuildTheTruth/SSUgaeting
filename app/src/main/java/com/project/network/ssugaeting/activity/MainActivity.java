package com.project.network.ssugaeting.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.databinding.ActivityMainBinding;
import com.project.network.ssugaeting.fragment.ChatRoomListFragment;
import com.project.network.ssugaeting.fragment.ProfileListFragment;
import com.project.network.ssugaeting.fragment.MyProfileFragment;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    ActivityMainBinding binding;

    private SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        binding.viewPager.setAdapter(mSectionsPagerAdapter);
        binding.viewPager.addOnPageChangeListener(this);

        binding.tabLayout.setupWithViewPager(binding.viewPager);
        binding.tabLayout.setSelectedTabIndicatorColor(Color.BLACK);
        binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_person_black_24dp);
        binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_grey_24dp);
        binding.tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_grey_24dp);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FilterActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        int position = getIntent().getIntExtra("position", 0);
        binding.viewPager.setCurrentItem(position);

    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return ProfileListFragment.newInstance();
                case 1:
                    return ChatRoomListFragment.newInstance();
                case 2:
                    return MyProfileFragment.newInstance();
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_person_black_24dp);
                binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_grey_24dp);
                binding.tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_grey_24dp);
                binding.fab.setVisibility(View.VISIBLE);
                break;
            case 1:
                binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_person_grey_24dp);
                binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_black_24dp);
                binding.tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_grey_24dp);
                binding.fab.setVisibility(View.INVISIBLE);
                break;
            case 2:
                binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_person_grey_24dp);
                binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_grey_24dp);
                binding.tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_black_24dp);
                binding.fab.setVisibility(View.INVISIBLE);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }
}
