package com.example.prusp.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by prusp on 25.07.2017.
 */

public class NatureListAdapter extends ArrayAdapter<Entry> {
    private final List<Entry> entryList;

    public NatureListAdapter(@NonNull Context context, List<Entry> entryList) {
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
            convertView = inflater.inflate(R.layout.nature_custom_row, null);
        }

        Entry currentPlace = getItem(position);

        if (currentPlace != null) {
            TextView naturePlaceName = (TextView) convertView.findViewById(R.id.nature_name_text_view);
            naturePlaceName.setText(currentPlace.getEntryName());

            TextView natureLocalization = (TextView) convertView.findViewById(R.id.gps_data_text_view);
            natureLocalization.setText(localizationTextComposed(currentPlace));

            ImageView naturePlaceImage = (ImageView) convertView.findViewById(R.id.nature_image_view);
            naturePlaceImage.setImageResource(currentPlace.getEntryResourceId());
        }
        return convertView;
    }

    private String localizationTextComposed(Entry currentPlace) {
        return String.valueOf(currentPlace.getEntryLocalizationN()) +
                " N, " +
                String.valueOf(currentPlace.getEntryLocalizationE()) +
                " E";
    }

}
