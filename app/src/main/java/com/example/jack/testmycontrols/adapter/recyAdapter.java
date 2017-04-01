package com.example.jack.testmycontrols.adapter;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.jack.testmycontrols.R;
import com.example.jack.testmycontrols.data.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/1/11.
 */

public class recyAdapter extends RecyclerView.Adapter<recyAdapter.Viewholder> {

    private List<data> lists=new ArrayList<>();

    public recyAdapter(List<data> list) {
        this.lists = list;
    }

    //类似baseAdapter中的控件实体类
    static  class Viewholder extends RecyclerView.ViewHolder{
        TextView recyText;
        public Viewholder(View itemView) {
            super(itemView);
            recyText= (TextView) itemView.findViewById(R.id.recyText);
        }
    }

    //把你获取到的布局加载到Viewhodler类中的控件去
    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        Viewholder viewholder=new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recytext,parent,false));
        return viewholder;  //返回获取到的布局
    }

    //对子项的数据进行赋值
    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        Log.d("data","id--"+lists.get(position).getId());
        holder.recyText.setText(""+lists.get(position).getId()); //holder类中的控件进行赋值
    }

    //list 或者 数据的数量 list.size();
    @Override
    public int getItemCount() {
        return lists.size();
    }
}
