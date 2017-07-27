package com.example.prusp.tourguideapp;

import android.content.Context;
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

public class RestaurantListAdapter extends ArrayAdapter<Entry> {

    private List<Entry> entryList;

    public RestaurantListAdapter(@NonNull Context context, List<Entry> entryList) {
        super(context, 0);
        this.entryList = entryList;
    }

    @Override
    public int getCount() {
        return entryList.size();
    }

    @Nullable
    @Override
    public Entry getItem(int position) {
        return entryList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.restaurant_custom_row, null);
        }

        Entry currentRestaurant = getItem(position);

        if (currentRestaurant != null) {
            TextView restaurantName = (TextView) convertView.findViewById(R.id.restaurant_name_text_view);
            restaurantName.setText(currentRestaurant.getEntryName());

            TextView restaurantAddress = (TextView) convertView.findViewById(R.id.restaurant_address_text_view);
            restaurantAddress.setText(currentRestaurant.getEntryAddress());

            TextView typeOfKitchen = (TextView) convertView.findViewById(R.id.restaurant_type_text_view);
            typeOfKitchen.setText(currentRestaurant.getTypeOfKitchen());

            TextView restaurantPrice = (TextView) convertView.findViewById(R.id.restaurant_price_range_text_view);
            restaurantPrice.setText(currentRestaurant.getPriceRange());
        }
        return convertView;
    }
}
