package com.example.artem.calculator.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.artem.calculator.Config;
import com.example.artem.calculator.R;

/**
 * Created by Artem on 04.10.2016.
 */
public class ButtonFragment extends Fragment implements View.OnClickListener {
Bundle bnd;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.bnd = Config.bnd;
        View v = inflater.inflate(R.layout.buttonfragment, null);
        v.findViewById(R.id.button_one).setOnClickListener(this);
        v.findViewById(R.id.button_two).setOnClickListener(this);
        v.findViewById(R.id.button_three).setOnClickListener(this);
        v.findViewById(R.id.button_four).setOnClickListener(this);
        v.findViewById(R.id.button_five).setOnClickListener(this);
        v.findViewById(R.id.button_six).setOnClickListener(this);
        v.findViewById(R.id.button_seven).setOnClickListener(this);
        v.findViewById(R.id.button_eight).setOnClickListener(this);
        v.findViewById(R.id.button_nine).setOnClickListener(this);
        v.findViewById(R.id.button_zero).setOnClickListener(this);
        v.findViewById(R.id.button_plus).setOnClickListener(this);
        v.findViewById(R.id.button_minus).setOnClickListener(this);
        v.findViewById(R.id.button_ymn).setOnClickListener(this);
        v.findViewById(R.id.button_del).setOnClickListener(this);
        v.findViewById(R.id.button_C).setOnClickListener(this);
        v.findViewById(R.id.button_point).setOnClickListener(this);
        v.findViewById(R.id.button_result).setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_one: Log.d("click", "1"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 1); break;
            case R.id.button_two: Log.d("click", "2"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 2); break;
            case R.id.button_three: Log.d("click", "3"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 3); break;
            case R.id.button_four: Log.d("click", "4"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 4); break;
            case R.id.button_five: Log.d("click", "5"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 5); break;
            case R.id.button_six: Log.d("click", "6"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 6); break;
            case R.id.button_seven: Log.d("click", "7"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 7); break;
            case R.id.button_eight: Log.d("click", "8"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 8); break;
            case R.id.button_nine: Log.d("click", "9"); bnd.putDouble("a", bnd.getDouble("a") * 10 + 9); break;
            case R.id.button_zero: Log.d("click", "0"); bnd.putDouble("a", bnd.getDouble("a") * 10); break;
            case R.id.button_plus: Log.d("click", "+"); bnd.putChar("op", '+'); bnd.putDouble("b", bnd.getDouble("a")); bnd.putDouble("a", 0); break;
            case R.id.button_minus: Log.d("click", "-"); bnd.putChar("op", '-'); bnd.putDouble("b", bnd.getDouble("a")); bnd.putDouble("a", 0); break;
            case R.id.button_ymn: Log.d("click", "*"); bnd.putChar("op", '*'); bnd.putDouble("b", bnd.getDouble("a")); bnd.putDouble("a", 0); break;
            case R.id.button_del: Log.d("click", "/"); bnd.putChar("op", '/'); bnd.putDouble("b", bnd.getDouble("a")); bnd.putDouble("a", 0); break;
            case R.id.button_C: Log.d("click", "C"); bnd.putDouble("a", 0); bnd.putDouble("b", 0); break;
            case R.id.button_point: Log.d("click", "."); break;
            case R.id.button_result: Log.d("click", "=");
                switch (bnd.getChar("op"))
            {
                case '+': bnd.putDouble("a", bnd.getDouble("a") + bnd.getDouble("b")); break;
                case '-': bnd.putDouble("a", bnd.getDouble("b") - bnd.getDouble("a")); break;
                case '*': bnd.putDouble("a", bnd.getDouble("b") * bnd.getDouble("a")); break;
                case '/': bnd.putDouble("a", bnd.getDouble("b") / bnd.getDouble("a")); break;
            }break;
            default: throw new NullPointerException();
        }
        Config.tv.setText("" + bnd.getDouble("a"));

    }
}
