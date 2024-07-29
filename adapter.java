package com.example.myapplication333;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;

public class adapter extends BaseAdapter {
    private Context context;
    private ArrayList<DanhBa> list  = new ArrayList<>();

    public adapter(Context context, ArrayList<DanhBa> list) {
        this.context = context;
        this.list = list;
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
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        view = inflater.inflate(R.layout.item_lv,viewGroup,false);
        // anh xa
        TextView txtview = view.findViewById(R.id.tenlv);
        // truyen du lieu
        txtview.setText(list.get(i).getTen());
        return view;
    }
    public  void show(int position){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(list.get(position).getTen() + list.get(position).getSDT());
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void remove(int i ){
        list.remove(i);
        notifyDataSetChanged();
    }
}
