package com.individual.kehao.listviewwithconstraintlayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/*
 * Project Name: ListViewWithConstraintLayout
 * Package Name: com.individual.kehao.listviewwithconstraintlayout
 * File    Name: simpleAdapter
 * Create  By:   Ke Hao
 * Create  Time: 2018/9/20
 * Description :
 */
public class sampleAdapter extends BaseAdapter {

    private List<ProfileListItem> mData;
    private Context context;
    private LayoutInflater inflater;

    public sampleAdapter(List<ProfileListItem> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        TextView tv_title = view.findViewById(R.id.title);
        TextView tv_content = view.findViewById(R.id.content);

        tv_title.setText(mData.get(i).getpTitle());
        tv_content.setText(mData.get(i).getpContent());

        return view;
    }
}
