package com.example.jack.testmycontrols.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jack.testmycontrols.R;
import com.example.jack.testmycontrols.adapter.orAdapter;
import com.example.jack.testmycontrols.adapter.recyAdapter;
import com.example.jack.testmycontrols.data.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/1/12.
 */

public class orientationRecyActivity extends AppCompatActivity {

    private RecyclerView recy;
    private List<data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);
        recy = (RecyclerView) findViewById(R.id.reyview);
        getData();
        initData();
    }

    private void getData() {
        data datas = null;
        for (int i = 0; i <= 10; i++) {
            datas = new data();
            datas.setId(i);
            list.add(datas);
        }
    }

    private void initData() {
//         LinearLayoutMannager 是一个布局排列 ， 管理的接口,子类都都需要按照接口的规范来实现。
        LinearLayoutManager ms = new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.HORIZONTAL); // 设置 recyclerview 布局方式为横向布局
//        LinearLayoutManager 种 含有3 种布局样式  第1个就是最常用的 横向 ，2 竖向
        recy.setLayoutManager(ms);

        orAdapter oap = new orAdapter(list);
        recy.setAdapter(oap);   //对recyclerview 添加内容
    }
}
