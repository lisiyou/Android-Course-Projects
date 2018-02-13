package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lisiy on 2017/11/9.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private  int colorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        View text_container = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        text_container.setBackgroundColor(color);

        ImageView image = (ImageView) listItemView.findViewById(R.id.miwok_image_view);
        // if int state is not initialized, its default value is 0
        if (currentWord.getImageResourceId() != 0) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        return listItemView;
    }
}
