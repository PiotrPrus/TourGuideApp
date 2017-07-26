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
        restaurants.add(new Entry("Malika", "30-60 PLN", "Maghreb", "69B Swietojanska Street, Gdynia"));
        restaurants.add(new Entry("Sopocki Mlyn", "20-40 PLN", "Dumplings", "2 Gora zamkowa Street, Sopot"));
        restaurants.add(new Entry("Bollywood", "20-40 PLN", "Indian", "9 Jana Pawla II Avenue, Gdynia"));
        restaurants.add(new Entry("Piwna 47", "40-70 PLN", "Modern european", "47 Piwna Street, Gdansk"));
        restaurants.add(new Entry("Pobite Gary", "20-40 PLN", "Modern", "34 Bitwy Oliwskiej Street, Gdansk"));
        restaurants.add(new Entry("Sempre", "25-35 PLN", "Italian", "11 Grunwaldzka Street, Sopot"));
        return restaurants;
    }


}
