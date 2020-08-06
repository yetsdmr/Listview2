package com.example.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class mesajAdapter extends BaseAdapter {

    List<mesajModel> list;
    Context context;

    public mesajAdapter(List<mesajModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View layout = LayoutInflater.from(context).inflate(R.layout.layout,viewGroup,false);
        ImageView img = layout.findViewById(R.id.kisiResmi);
        TextView kIsmı= layout.findViewById(R.id.kisiIsmı);
        TextView kMesaj = layout.findViewById(R.id.kisimesaj);
        img.setImageResource(list.get(i).getResimId());
        kIsmı.setText(list.get(i).getKisi());
        kMesaj.setText(list.get(i).getMesajIcerik());
        return layout;
    }
}
