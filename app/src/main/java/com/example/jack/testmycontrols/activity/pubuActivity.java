package com.example.jack.testmycontrols.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.jack.testmycontrols.R;
import com.example.jack.testmycontrols.adapter.pubuAdapter;
import com.example.jack.testmycontrols.data.data;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jack on 2017/1/12.
 */

public class pubuActivity extends AppCompatActivity {

    private List<data> lists=new ArrayList<>();
    private RecyclerView recy;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);
        initdata();
        initView();
    }

    private void initView() {
        recy= (RecyclerView) findViewById(R.id.reyview);
        StaggeredGridLayoutManager sta=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        //StaggeredGridLayoutManager.VERTICAL 把布局进行纵横排列
        //类似于girdview中 一行有3个
        recy.setLayoutManager(sta);
        pubuAdapter pbu=new pubuAdapter(lists);
        recy.setAdapter(pbu);
    }

    public void initdata(){
        for (int i=0;i<2;i++){
            data datas1=new data(R.mipmap.timg,getname("Apple"));
            lists.add(datas1);

            data datas2=new data(R.mipmap.timg2,getname("Blue"));
            lists.add(datas2);

            data datas3=new data(R.mipmap.timg2,getname("Orcal"));
            lists.add(datas3);

            data datas4=new data(R.mipmap.ic_launcher,getname("Online"));
            lists.add(datas4);
            
            data datas5=new data(R.mipmap.timg,getname("LOL"));
            lists.add(datas5);
            
            data datas6=new data(R.mipmap.ic_launcher,getname("Beack"));
            lists.add(datas6);
            
            data datas7=new data(R.mipmap.timg,getname("Apple2"));
            lists.add(datas7);
            
        }
    }

    private String getname(String name){
        Random datas=new Random();
        int length=datas.nextInt(20)+1;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<length;i++){
            sb.append(name);
        }
        return sb.toString();
    }

}
