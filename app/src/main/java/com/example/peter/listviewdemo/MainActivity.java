package com.example.peter.listviewdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    List<Person> people = new ArrayList<Person>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person kofi = new Person("Kofi", 21, "0200000001");
        Person Ama = new Person("Ama", 22, "0500000001");
        Person Peter = new Person("Peter", 19, "0249800001");
        Person Ronald = new Person("Ronald", 25, "0200063001");
        Person Esi = new Person("Esi", 24, "02384245001");

        people.add(kofi);
        people.add(Ama);
        people.add(Peter);
        people.add(Ronald);
        people.add(Esi);

        ListView listView = (ListView) findViewById(R.id.listView);

        MyListAdapter adapter = new MyListAdapter(this,
                R.id.listView,
                people);

        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
