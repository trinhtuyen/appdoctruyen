package com.example.da1_appdoctruyen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.da1_appdoctruyen.R;

import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class HomeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<truyen> truyenList;

    public HomeAdapter(Context context, int layout, list<truyen> truyenlist) {
        this.context = context;
        this.layout = layout;
        this.truyenlist = truyenlist;
    }

    @Override
    public int getCount() {
        return truyenList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        ImageView imgAnh = (ImageView) convertView.findViewById(R.id.imgAnh);
        TextView tvTenTruyen = (TextView) convertView.findViewById(R.id.tvTenTruyen);

        return null;
    }
}
