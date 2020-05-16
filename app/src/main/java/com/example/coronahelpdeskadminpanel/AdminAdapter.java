package com.example.coronahelpdeskadminpanel;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdminAdapter extends ArrayAdapter<ModelUser> {

    Activity activity;
    List<ModelUser> list;


    public AdminAdapter(Activity activity, List<ModelUser> list) {
        super(activity, R.layout.custom_layout, list);
        this.activity = activity;
        this.list = list;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        convertView = layoutInflater.inflate(R.layout.custom_layout, null,true);

        TextView name = convertView.findViewById(R.id.t_name);
        TextView phone = convertView.findViewById(R.id.t_phone);
        TextView address = convertView.findViewById(R.id.t_address);
        TextView list2 = convertView.findViewById(R.id.t_list);

        ModelUser model = list.get(position);

        name.setText(model.getName());
        phone.setText(model.getPhone());
        address.setText(model.getAddress());
        list2.setText(model.getList());



        return convertView;
    }
}
