package com.concisesoftware.lister.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.concisesoftware.lister.R;

public class ShowcaseFragment extends Fragment {
    public ShowcaseFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_showcase, container, false);
    }

}
