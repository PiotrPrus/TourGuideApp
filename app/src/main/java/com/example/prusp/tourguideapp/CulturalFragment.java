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
public class CulturalFragment extends Fragment {


    public CulturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        CulturalListAdapter culturalListAdapter = new CulturalListAdapter(getContext(), listOfCulturalPlaces());
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(culturalListAdapter);
        return rootView;
    }

    private List<Entry> listOfCulturalPlaces() {
        final  List<Entry> culturalPlaces = new ArrayList<>();
        culturalPlaces.add(new Entry("ECS", "1 Solidarnosci Square, Gdansk", getString(R.string.ecs_description)));
        culturalPlaces.add(new Entry("Baltic Philharmonic", "1 Olowianka Street, Gdansk", getString(R.string.baltic_philharmonic_description)));
        culturalPlaces.add(new Entry("Baltic Opera", "15 Zwyciestwa Avenue, Gdańsk", getString(R.string.baltic_opera_description)));
        culturalPlaces.add(new Entry("Gdynia musical theater", "1 Grunwaldzki Square, Gdynia", getString(R.string.music_theater_description)));
        culturalPlaces.add(new Entry("The Forest Opera", "12 Moniuszki Street, Sopot", getString(R.string.forest_opera_description)));
    return culturalPlaces;
    }

}
