package com.project.network.ssugaeting.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.fragment.ChatFragment;
import com.project.network.ssugaeting.fragment.ProfileFragment;
import com.project.network.ssugaeting.fragment.SettingFragment;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private FloatingActionButton fab;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.addOnPageChangeListener(this);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setSelectedTabIndicatorColor(Color.BLACK);
        mTabLayout.getTabAt(0).setIcon(R.drawable.ic_person_black_24dp);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_grey_24dp);
        mTabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_grey_24dp);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return ProfileFragment.newInstance();
                case 1:
                    return ChatFragment.newInstance();
                case 2:
                    return SettingFragment.newInstance();
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
                mTabLayout.getTabAt(0).setIcon(R.drawable.ic_person_black_24dp);
                mTabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_grey_24dp);
                mTabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_grey_24dp);
                fab.setVisibility(View.VISIBLE);
                break;
            case 1:
                mTabLayout.getTabAt(0).setIcon(R.drawable.ic_person_grey_24dp);
                mTabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_black_24dp);
                mTabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_grey_24dp);
                fab.setVisibility(View.INVISIBLE);
                break;
            case 2:
                mTabLayout.getTabAt(0).setIcon(R.drawable.ic_person_grey_24dp);
                mTabLayout.getTabAt(1).setIcon(R.drawable.ic_chat_bubble_grey_24dp);
                mTabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_black_24dp);
                fab.setVisibility(View.INVISIBLE);
                break;
            default:
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }
}
