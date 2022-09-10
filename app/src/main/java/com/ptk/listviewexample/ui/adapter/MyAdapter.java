package com.ptk.listviewexample.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ptk.listviewexample.R;

public class MyAdapter extends BaseAdapter {
    String[] languages;
    String[] dates;

    public MyAdapter(String[] languages, String[] dates) {
        this.languages = languages;
        this.dates = dates;
    }

    @Override
    public int getCount() {
        return languages.length;
    }

    @Override
    public Object getItem(int i) {
        return languages[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_main, parent, false);
            TextView tvTitle = view.findViewById(R.id.tvTitle);
            TextView tvDate = view.findViewById(R.id.tvDate);

            tvTitle.setText(languages[position]);
            tvDate.setText(dates[position]);
        }
        return view;

    }
}
