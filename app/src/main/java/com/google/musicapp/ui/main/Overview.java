package com.google.musicapp.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.musicapp.R;

import java.util.ArrayList;

public class Overview extends Fragment {
    RecyclerView mRecyclerView;
    RecyclerView mRecyclerView1;
    RecyclerView mRecyclerView2;
    RecyclerView mRecyclerView3;
    Button btn;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.LayoutManager mLayoutManager1;
    RecyclerView.LayoutManager mLayoutManager2;
    RecyclerView.LayoutManager mLayoutManager3;
    ArrayList<Person> people;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_first_screen, container, false);
        mRecyclerView = (RecyclerView) root.findViewById(R.id.list);
        mRecyclerView.setHasFixedSize(true);

        PersonAdapter listAdapter = new PersonAdapter();
        mRecyclerView.setAdapter(listAdapter);


        mLayoutManager = new GridLayoutManager(getActivity().getBaseContext(),1 , LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView1 = (RecyclerView) root.findViewById(R.id.list1);
        mRecyclerView1.setHasFixedSize(true);

        PersonAdapter listAdapter1 = new PersonAdapter();
        mRecyclerView1.setAdapter(listAdapter1);


        mLayoutManager1 = new GridLayoutManager(getActivity().getBaseContext(),1 , LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView1.setLayoutManager(mLayoutManager1);

        mRecyclerView2 = (RecyclerView) root.findViewById(R.id.list2);
        mRecyclerView2.setHasFixedSize(true);

        PersonAdapter listAdapter2 = new PersonAdapter();
        mRecyclerView2.setAdapter(listAdapter2);


        mLayoutManager2 = new GridLayoutManager(getActivity().getBaseContext(),1 , LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView2.setLayoutManager(mLayoutManager2);

        mRecyclerView3 = (RecyclerView) root.findViewById(R.id.list3);
        mRecyclerView3.setHasFixedSize(true);

        PersonAdapter listAdapter3= new PersonAdapter();
        mRecyclerView3.setAdapter(listAdapter3);


        mLayoutManager3 = new GridLayoutManager(getActivity().getBaseContext(),1 , LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView3.setLayoutManager(mLayoutManager3);
        return root;
    }


}



