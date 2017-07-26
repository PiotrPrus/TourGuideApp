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
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        NatureListAdapter natureListAdapter = new NatureListAdapter(getContext(), listOfNaturePlaces());
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(natureListAdapter);

        return rootView;
    }

    private List<Entry> listOfNaturePlaces() {
        final List<Entry> naturePlaces = new ArrayList<>();
        naturePlaces.add(new Entry("Gdynia cliffs", 54.485316, 18.568878, R.drawable.cliff));
        naturePlaces.add(new Entry("Oliwa Park", 54.409832, 18.562267, R.drawable.park));
        naturePlaces.add(new Entry("Hel peninsula", 54.608850, 18.800799, R.drawable.hel));
        naturePlaces.add(new Entry("Sobieszewo island", 54.348213, 18.876085, R.drawable.sobieszewo));
        naturePlaces.add(new Entry("Lysa hill", 54.442597, 18.541771, R.drawable.hill));
        return naturePlaces;
    }

}
