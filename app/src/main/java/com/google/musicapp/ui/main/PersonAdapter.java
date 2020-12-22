package com.google.musicapp.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.musicapp.R;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter {


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return 3;
    }
    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tv;
        private ImageView img;
        public ListViewHolder(View item)
        {
            super(item);
            tv=(TextView)item.findViewById(R.id.itemText);
            img=(ImageView)item.findViewById(R.id.itemImage);
        }
        public void bindView(int pos)
        {
            tv.setText(Person.title[pos]);
            img.setImageResource(Person.picturePath[pos]);
        }
        public void onClick(View view)
        {

        }
    }
}
