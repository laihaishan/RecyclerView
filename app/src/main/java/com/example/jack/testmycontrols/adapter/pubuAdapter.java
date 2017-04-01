package com.example.jack.testmycontrols.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jack.testmycontrols.R;
import com.example.jack.testmycontrols.data.data;

import java.util.List;

/**
 * Created by jack on 2017/1/12.
 */

public class pubuAdapter extends RecyclerView.Adapter<pubuAdapter.ViewHodler> {

    private List<data> lists;

    public pubuAdapter(List<data> list){
        this.lists=list;
    }

    public class ViewHodler extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView img;

        public ViewHodler(View itemView) {
            super(itemView);
            img= (ImageView) itemView.findViewById(R.id.pubuimag);
            textView= (TextView) itemView.findViewById(R.id.pubuText);
        }
    }

    @Override
    public ViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHodler(LayoutInflater.from(parent.getContext()).inflate(R.layout.pubua_ctivity,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHodler holder, int position) {
        holder.textView.setText(lists.get(position).getName());
        holder.img.setImageResource(lists.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

}
