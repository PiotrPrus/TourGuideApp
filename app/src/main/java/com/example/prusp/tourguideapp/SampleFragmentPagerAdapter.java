package com.example.prusp.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by prusp on 19.07.2017.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter{

    private static final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] {"Restaurants", "Nature", "Cultural", "Architecture"};

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new RestaurantsFragment();
            case 1:
                return new NatureFragment();
            case 2:
                return new CulturalFragment();
            case 3:
                return new ArchitectureFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
