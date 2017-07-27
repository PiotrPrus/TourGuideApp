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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RestaurantListAdapter restaurantListAdapter = new RestaurantListAdapter(getContext(), listOfRestaurants());
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(restaurantListAdapter);

        return rootView;
    }

    private List<Entry> listOfRestaurants() {
        final List<Entry> restaurants = new ArrayList<>();
        restaurants.add(new Entry(getString(R.string.malika), getString(R.string.malika_price), getString(R.string.malika_type), getString(R.string.malika_address)));
        restaurants.add(new Entry(getString(R.string.mlyn), getString(R.string.mlyn_prize), getString(R.string.mlyn_ype), getString(R.string.mlyn_address)));
        restaurants.add(new Entry(getString(R.string.bollywood), getString(R.string.bollywood_price), getString(R.string.bollywood_type), getString(R.string.bollywood_address)));
        restaurants.add(new Entry(getString(R.string.piwna), getString(R.string.piwna_price), getString(R.string.piwna_type), getString(R.string.piwna_address)));
        restaurants.add(new Entry(getString(R.string.gary), getString(R.string.gary_price), getString(R.string.gary_type), getString(R.string.gary_address)));
        restaurants.add(new Entry(getString(R.string.sempre), getString(R.string.sempre_price), getString(R.string.sempre_type), getString(R.string.sempre_address)));
        return restaurants;
    }


}
