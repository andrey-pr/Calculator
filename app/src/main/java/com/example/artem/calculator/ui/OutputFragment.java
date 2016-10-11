package com.example.artem.calculator.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.artem.calculator.Config;
import com.example.artem.calculator.R;

/**
 * Created by Artem on 04.10.2016.
 */
public class OutputFragment extends Fragment{
    Bundle bnd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.outputfragment, null);
        this.bnd = Config.bnd;
        Config.tv = (TextView) v.findViewById(R.id.textView);
        return v;
    }
}
