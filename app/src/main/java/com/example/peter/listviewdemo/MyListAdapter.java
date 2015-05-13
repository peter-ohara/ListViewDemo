package com.example.peter.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by peter on 5/12/15.
 */
public class MyListAdapter extends ArrayAdapter<Person> {

    List<Person> people;

    public MyListAdapter(Context context,
                         int listViewId,
                         List<Person> dataItems) {
        super(context, listViewId, dataItems);
        this.people = dataItems;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        Person person = people.get(position);

        View v = inflater.inflate(R.layout.list_item, parent, false);

        TextView name = (TextView) v.findViewById(R.id.name_textView);
        TextView phone = (TextView) v.findViewById(R.id.phoneNumber_textView);
        TextView age = (TextView) v.findViewById(R.id.age_textView);

        name.setText(person.name);
        phone.setText(person.phoneNumber);
//        age.setText(person.age);

        return v;
    }


}
