package com.example.marijaradisavljevic.marija_fragments;

/**
 * Created by marija.radisavljevic on 2/5/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, viewGroup, false);
        TextView output= (TextView)view.findViewById(R.id.msg1);
        output.setText("Fragment One hhh");
        ListView listView = (ListView)view.findViewById(R.id.list);
        ArrayList<String> list = new ArrayList<String>();
        list.add("prvi");
        list.add("drugi");
        list.add("treci");


        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item,R.id.ime, list);
        adapter.add(new String("cetvrti"));
        listView.setAdapter(adapter);
        return view;
    }
}