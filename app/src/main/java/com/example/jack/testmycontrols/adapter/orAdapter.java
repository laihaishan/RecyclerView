package com.example.jack.testmycontrols.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jack.testmycontrols.R;
import com.example.jack.testmycontrols.data.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/1/12.
 */

public class orAdapter extends RecyclerView.Adapter<orAdapter.Viewholder> {

    private List<data> lists;

    public orAdapter(List<data> list) {
        this.lists = list;
    }

//    Viewholder 内部类
    public class Viewholder extends RecyclerView.ViewHolder {
        TextView recyText;
        View fruitView;
        LinearLayout setLinearLayout;

        public Viewholder(View itemView) {
            super(itemView);
            fruitView = itemView;
            recyText = (TextView) itemView.findViewById(R.id.recyOrText);
        }
    }

    /* 获取布局 */
    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        final Viewholder holder = new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_orientation_text, parent, false));
//        给Viewhoder 指定一个布局
        return holder;  //返回获取到的布局
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
//       在 holder  onCreateVieiwHolder 指定一个布局后 对控件进行赋值
        holder.recyText.setText("" + lists.get(position).getId()); //holder类中的控件进行赋值
    }

//    获取布局有多少个item
    @Override
    public int getItemCount() {
        return lists.size();
    }

}
