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
 * Created by Piotr Prus on 26.07.2017.
 */

public class CulturalListAdapter extends ArrayAdapter<Entry> {
    private final List<Entry> entryList;

    public CulturalListAdapter(@NonNull Context context, List<Entry> entryList) {
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
            convertView = inflater.inflate(R.layout.cultural_custom_row, null);
        }

        Entry currentCulturalPlace = getItem(position);

        if (currentCulturalPlace != null) {
            TextView culturalPlaceName = (TextView) convertView.findViewById(R.id.cultural_place_text_view);
            culturalPlaceName.setText(currentCulturalPlace.getEntryName());

            TextView culturalPlaceAddress = (TextView) convertView.findViewById(R.id.cultural_place_adress_text_view);
            culturalPlaceAddress.setText(currentCulturalPlace.getEntryAddress());

            TextView culturalPlaceDescription = (TextView) convertView.findViewById(R.id.cultural_description_text_view);
            culturalPlaceDescription.setText(currentCulturalPlace.getEntryDescription());
        }

        return convertView;
    }
}
