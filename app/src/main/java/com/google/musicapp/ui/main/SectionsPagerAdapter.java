package com.google.musicapp.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.musicapp.R;
import com.google.musicapp.ui.SecondScreen;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch(position){
            case 0:
                Overview t1=new Overview();
                return t1;
            case 1:
                SecondScreen t2=new SecondScreen();
                return t2;
            case 2:
                ThirdScreen t3=new ThirdScreen();
                return t3;

        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                Overview t1=new Overview();
                return "Overview";
            case 1:
                SecondScreen t2=new SecondScreen();
                return "Genres And Moods";
            case 2:
                ThirdScreen t3=new ThirdScreen();
                return "Podcasts";

        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}