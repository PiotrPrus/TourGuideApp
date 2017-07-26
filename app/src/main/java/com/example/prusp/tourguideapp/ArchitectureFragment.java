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
        archPlaces.add(new Entry("katedra Oliwska", "gdansk", 0));
        archPlaces.add(new Entry("dom uphagena", "gdansk", 0));
        archPlaces.add(new Entry("Krzywy domek", "sopot", 0));
        archPlaces.add(new Entry("dworzec PKP Gdańsk", "gdańsk", 0));
        archPlaces.add(new Entry("kosciol mariacki", "gdansk", 0));
        return archPlaces;
    }

}
