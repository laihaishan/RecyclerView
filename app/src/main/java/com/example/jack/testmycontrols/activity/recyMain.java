package com.example.jack.testmycontrols.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jack.testmycontrols.R;
import com.example.jack.testmycontrols.data.data;
import com.example.jack.testmycontrols.adapter.recyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/1/11.
 */

public class recyMain extends AppCompatActivity {

    private RecyclerView recy;
    private  List<data> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        setContentView(R.layout.recycleview);
        recy= (RecyclerView) findViewById(R.id.reyview);
        initData();
        initView();
    }
    private void initData(){
        data datas=null;
        for (int i=0;i<=100;i++){
            datas=new data();
            datas.setId(i);
            list.add(datas);
        }
    }

    private void initView(){
        recy.setLayoutManager(new LinearLayoutManager(this));   // 设置 recyclerview 布局方式为线性布局
        recyAdapter rec= new recyAdapter(list);
        recy.setAdapter(rec);   //对recyclerview 数据赋值
    }
}
