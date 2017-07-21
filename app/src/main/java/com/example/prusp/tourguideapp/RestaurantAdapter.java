package com.example.prusp.tourguideapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by prusp on 21.07.2017.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    private List<Restaurant> restaurants;
    public RestaurantAdapter(@NonNull Context context, List<Restaurant> restaurantList) {
        super(context, 0);
        this.restaurants = restaurantList;
    }

    @Override
    public int getCount() {
        return restaurants.size();
    }

    @Nullable
    @Override
    public Restaurant getItem(int position) {
        return restaurants.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.restaurant_custom_row, null);
        }

        Restaurant currentRestaurant = getItem(position);

        TextView restaurantName = (TextView) convertView.findViewById(R.id.restaurant_name_text_view);
        restaurantName.setText(currentRestaurant.getRestaurantName());

        TextView restaurantAddress = (TextView) convertView.findViewById(R.id.restaurant_address_text_view);
        restaurantAddress.setText(currentRestaurant.getAddressOfRestaurant());

        TextView typeOfKitchen = (TextView) convertView.findViewById(R.id.restaurant_type_text_view);
        typeOfKitchen.setText(currentRestaurant.getTypeOfKitchen());

        TextView restaurantPrice = (TextView) convertView.findViewById(R.id.restaurant_price_range_text_view);
        restaurantPrice.setText(currentRestaurant.getPriceRange());
        return convertView;
    }
}
