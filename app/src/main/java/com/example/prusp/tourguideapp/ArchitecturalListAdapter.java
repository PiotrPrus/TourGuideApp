package com.example.prusp.tourguideapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Piotr Prus on 26.07.2017.
 */

public class ArchitecturalListAdapter extends ArrayAdapter{
    private final List<Entry> entryList;
    public ArchitecturalListAdapter(@NonNull Context context, List<Entry> entryList) {
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
            convertView = inflater.inflate(R.layout.architecture_custom_row, null);
        }

        Entry currentArchPlace = getItem(position);

        if (currentArchPlace != null) {
            TextView archName = (TextView) convertView.findViewById(R.id.architecture_name_text_view);
            archName.setText(currentArchPlace.getEntryName());

            TextView archAddress = (TextView) convertView.findViewById(R.id.arch_adress_text_view);
            archAddress.setText(currentArchPlace.getEntryAddress());

            ImageView archImage = (ImageView) convertView.findViewById(R.id.arch_image_view);
            archImage.setImageResource(currentArchPlace.getEntryResourceId());
        }

        return convertView;
    }
}
