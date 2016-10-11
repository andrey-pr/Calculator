package com.example.artem.calculator.ui;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.artem.calculator.Config;
import com.example.artem.calculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Config.bnd = new Bundle();
        Config.bnd.putDouble("a", 0);
        Config.bnd.putDouble("b", 0);
        Config.bnd.putChar("op", '+');
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OutputFragment fragment = new OutputFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.text_container, fragment);
        fragmentTransaction.commit();
        ButtonFragment fragment1 = new ButtonFragment();
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.add(R.id.button_container, fragment1);
        fragmentTransaction1.commit();
    }
}
