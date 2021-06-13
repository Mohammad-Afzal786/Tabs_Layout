package com.example.tabslayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import org.jetbrains.annotations.NotNull;

public class FragmentPagerAdapter  extends androidx.fragment.app.FragmentPagerAdapter {
    private final int[] tabs_title=new int[]{R.string.tab_1,R.string.tab_2,R.string.tab_3};
    private final Context context;
    public FragmentPagerAdapter(@NonNull @NotNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                MondayFragment mondayFragment=new MondayFragment();
                return mondayFragment;
            case 1:
                TueFragment tueFragment=new TueFragment();
                return tueFragment;
            case 2:
                WedFragment wedFragment=new WedFragment();
                return wedFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(tabs_title[position]);
    }
}
