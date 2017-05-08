package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private RelativeLayout activity_main;
    private String[] name = {"矩形", "圆形", "三角形", "扇形", "椭圆", "曲线","文字和图片"};
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        listview = (ListView) findViewById(R.id.listview);
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (id==0){
//                    矩形
                            Intent intent=new Intent(MainActivity.this,Rect_Activity.class);
                                    startActivity(intent);
                }else if (id==1){
//                    圆形
                    Intent intent=new Intent(MainActivity.this,CircleActivity.class);
                    startActivity(intent);
                }else if (id==2){
//                    三角形\
                    Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(intent);

                }else if (id==3){
//                    扇形
                }else if (id==4){
//                    椭圆
                }else if (id==5){
//                    曲线
                }else if (id==6){
//                    文字和图片
                }
            }
        });
    }



}
