package com.example.latihan3prauts.fragment;
///16-05-2019/10116329/RakaGunturAlviansyah/IF-8
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihan3prauts.R;

public class OnBoarding1 extends Fragment {
    public OnBoarding1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding1, container, false);
    }
}
