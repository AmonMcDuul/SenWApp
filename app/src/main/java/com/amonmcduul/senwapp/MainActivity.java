package com.amonmcduul.senwapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button bumbaButs;
private Button tButts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bumbaButs = findViewById(R.id.bumbaButton);
        bumbaButs.setOnClickListener(this);
        tButts = findViewById(R.id.tButton);
        tButts.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.bumbaButton:
                setContentView(R.layout.activity_bumbazone);
            break;
            case R.id.tButton:
                setContentView(R.layout.activity_tzone);
        }
    }
}
