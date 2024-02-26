package com.example.practicafigma;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MenuPagerAdapter extends FragmentPagerAdapter {
    public MenuPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            case 3:
                return new TabFragment4();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // Títulos de las pestañas
        switch (position) {
            case 0:
                return "Food";
            case 1:
                return "Drinks";
            case 2:
                return "Snacks";
            case 3:
                return "Dessert";
            default:
                return null;
        }
    }
}
