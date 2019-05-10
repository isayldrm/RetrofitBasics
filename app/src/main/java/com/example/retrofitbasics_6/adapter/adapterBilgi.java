package com.example.retrofitbasics_6.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.retrofitbasics_6.R;
import com.example.retrofitbasics_6.model.Bilgi;

import java.util.List;

public class adapterBilgi extends BaseAdapter {

    List<Bilgi> list;
    Context context;

    public adapterBilgi(List<Bilgi> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        TextView userid = (TextView) convertView.findViewById(R.id.UserId);
        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView body = (TextView) convertView.findViewById(R.id.body);

        userid.setText("" + list.get(position).getName());
        id.setText("" + list.get(position).getId());
        title.setText("" + list.get(position).getEmail());
        body.setText("" + list.get(position).getBody());
        return convertView;
    }
}
