package com.bignerdranch.android.criminalintent;

import android.app.Fragment;

/**
 * Created by phuston on 1/30/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
