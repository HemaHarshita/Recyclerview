package com.example.acer.recycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdepter extends RecyclerView.Adapter<MyAdepter.MyViewHolder> {
    Context context;
    String[] name;
    int[] image;
    public MyAdepter(MainActivity mainActivity, String[] name, int[] image) {
        this.context=mainActivity;
        this.name=name;
        this.image=image;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from (context).inflate (R.layout.design,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText (name[position]);
        holder.imageView.setImageResource (image[position]);
    }


    @Override
    public int getItemCount() {

      return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MyViewHolder(View itemView) {
            super (itemView);
            imageView=itemView.findViewById (R.id.imageview);
            textView=itemView.findViewById (R.id.textview);
        }
    }
}
