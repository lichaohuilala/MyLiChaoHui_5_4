package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import view.Neifangwaiyuan;

public class Main3Activity extends AppCompatActivity {

    private Neifangwaiyuan activity_main3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();

    }

    private void initView() {
        activity_main3 = (Neifangwaiyuan) findViewById(R.id.activity_main3);
    activity_main3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    });
    }
}
