package com.example.android.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 18-02-2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentBook = getItem(position);

        TextView snoTextView = (TextView) listItemView.findViewById(R.id.sno_text_view);
        snoTextView.setText(currentBook.getmSno());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentBook.getmTitle());

        TextView sectionNameTextView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionNameTextView.setText(currentBook.getmSectionName());

        return listItemView;
    }
}
