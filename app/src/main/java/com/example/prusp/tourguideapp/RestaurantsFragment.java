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
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getContext(), listOfRestaurants());
        View rootView = inflater.inflate(R.layout.restaurants_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.restaurants_list);
        listView.setAdapter(restaurantAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

    private List<Restaurant> listOfRestaurants() {
        final List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Malika", "30-60", "Maghreb", "Swietojanska 69b, Gdynia"));
        restaurants.add(new Restaurant("Sopocki Mlyn", "20-40", "Dumplings and pasta", "Gora zamkowa 2, Sopot"));
        restaurants.add(new Restaurant("Bollywood", "20-40", "Indian", "Jana Pawla II 9, Gdynia"));
        restaurants.add(new Restaurant("Piwna 47", "40-70", "Modern european", "Piwna 47, Gdansk"));
        restaurants.add(new Restaurant("Pobite Gary", "20-40", "Modern", "Bitwy Oliwskiej 34, Gdansk"));
        restaurants.add(new Restaurant("Sempre", "25-35", "Italian", "Grunwaldzka 11, Sopot"));
        return restaurants;
    }


}
