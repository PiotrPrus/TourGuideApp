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
        culturalPlaces.add(new Entry("ECS", "Solidarnosci Square 1, Gdansk", getString(R.string.ecs_description)));
        culturalPlaces.add(new Entry("Baltic Philharmonic", "Olowianka Street 1 Gdansk", getString(R.string.baltic_philharmonic_description)));
        culturalPlaces.add(new Entry("Baltic Opera", "Zwyciestwa Avenue 15, Gdańsk", getString(R.string.baltic_opera_description)));
        culturalPlaces.add(new Entry("Gdynia musical theater", "Grunwaldzki Square 1, Gdynia", getString(R.string.music_theater_description)));
        culturalPlaces.add(new Entry("The Forest Opera", "Moniuszki Street 12, Sopot", getString(R.string.forest_opera_description)));
    return culturalPlaces;
    }

}
