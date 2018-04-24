package io.github.alexlondon07.fragments.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.alexlondon07.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {


    public DataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_data, container, false);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data, container, false);
    }

}
