package com.example.navigation;
import android.app.Activity;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MyCompanyFragment extends Fragment {

    /**
     * Returns a new instance of this fragment for the given section number.
     */
    public static MyCompanyFragment newInstance() {
        MyCompanyFragment fragment = new MyCompanyFragment();
        return fragment;
    }

    public MyCompanyFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_company, container,
                false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(3);
    }



}


