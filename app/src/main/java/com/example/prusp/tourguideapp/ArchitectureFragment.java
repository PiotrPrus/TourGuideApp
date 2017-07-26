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
        archPlaces.add(new Entry("Oliwa Cathedral", "5 Nowickiego Street, Gdansk", R.drawable.cathedral));
        archPlaces.add(new Entry("Uphagen's House", "12 Dluga Street, Gdansk", R.drawable.uphagen_house));
        archPlaces.add(new Entry("Crooked House", "53 Monte Cassino Street, Sopot", R.drawable.crooked_house));
        archPlaces.add(new Entry("Gdansk Main railway station", "1 Podwale Grodzkie Street, Gdansk", R.drawable.railway_station));
        archPlaces.add(new Entry("Gdansk Old Crane", "67 Szeroka Street, Gdansk", R.drawable.old_crane));
        return archPlaces;
    }

}
