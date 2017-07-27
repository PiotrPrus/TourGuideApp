package com.example.prusp.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArchitectureFragment extends Fragment {


    public ArchitectureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArchitecturalListAdapter architecturalListAdapter = new ArchitecturalListAdapter(getContext(), listOfArchPlaces());
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(architecturalListAdapter);

        return rootView;
    }

    private List<Entry> listOfArchPlaces() {
        final List<Entry> archPlaces = new ArrayList<>();
        archPlaces.add(new Entry(getString(R.string.cathedral_name), getString(R.string.cathedral_adress), R.drawable.cathedral));
        archPlaces.add(new Entry(getString(R.string.uphagen_name), getString(R.string.uphagen_address), R.drawable.uphagen_house));
        archPlaces.add(new Entry(getString(R.string.crooked_name), getString(R.string.crooked_address), R.drawable.crooked_house));
        archPlaces.add(new Entry(getString(R.string.railway_name), getString(R.string.railway_address), R.drawable.railway_station));
        archPlaces.add(new Entry(getString(R.string.crane_name), getString(R.string.crane_address), R.drawable.old_crane));
        return archPlaces;
    }

}
