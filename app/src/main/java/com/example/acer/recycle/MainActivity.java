package com.example.acer.recycle;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] name={"Donut","Eclair","Froyo","Gingerbread","HoneyComb","IcreamSandwich","JelleyBeans","KitKat","Lollypop","Marshmellow","Nogut","Oreo","Pi"};
    int[] image={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        recyclerView=findViewById (R.id.recycler);
        recyclerView.setLayoutManager (new LinearLayoutManager (this));

        recyclerView.setAdapter(new MyAdepter(this,name,image));
    }
}
