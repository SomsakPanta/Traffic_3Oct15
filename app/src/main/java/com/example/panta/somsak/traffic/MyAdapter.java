package com.example.panta.somsak.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 268771 on 4/10/2558.
 *
 * extends คือการสืบทอดสิทธิ
 * BaseAdapter  ต้อง เป็น Interface ให้ทำ Alt + Enter
 */
public class MyAdapter extends BaseAdapter {

    //Explicit  is declare variable
    private Context objContext;
    private int[] iconAnInt;
    private String[] titleStings;

    public MyAdapter(Context objContext, int[] iconAnInt, String[] titleStings) {
        this.objContext = objContext;
        this.iconAnInt = iconAnInt;
        this.titleStings = titleStings;
    }

    @Override
    public int getCount() {
        return titleStings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //การเปิด listView มาทำงาน
        //Alt Enter คือตัวช่วยในการ Cast
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.traffic_listview, parent, false);


        //Set up Icon ให้กับ ImageView ที่อยู่ใน Layout traffic_listView
        ImageView iconImageView = (ImageView) objView.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconAnInt[position]);

        //Set up String to Title
        TextView titleTextView = (TextView) objView.findViewById(R.id.txtShowTitle);
        titleTextView.setText(titleStings[position]);

        return objView;
    } // getView
} //Main class
