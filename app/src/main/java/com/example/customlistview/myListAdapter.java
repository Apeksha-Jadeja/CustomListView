package com.example.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class myListAdapter extends ArrayAdapter<String> {
    private  final Activity context;
    private  final String[] mainTitle;
    private  final String[] des;
    private  final Integer[] img;

    public myListAdapter(@NonNull  Activity context1, String[] mainTitle, String[] des, Integer[] img) {
       super(context1,R.layout.custom_layout,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.des = des;
        this.img = img;
    }

    public View getView(int position, View view, ViewGroup parent){


        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_layout,null,true);

        TextView titleText=rowView.findViewById(R.id.title);
        TextView sub=rowView.findViewById(R.id.subtitle);
        ImageView imageView=rowView.findViewById(R.id.icon);

        titleText.setText(mainTitle[position]);
        sub.setText(des[position]);
        imageView.setImageResource(img[position]);




        return rowView;
    }
}
