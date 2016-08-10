package com.example.freatnor.actors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.freatnor.actors.models.Actor;
import com.example.freatnor.actors.presenters.ActorArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ActorArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

    }

    @Override
    protected void onResume() {
        super.onResume();
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Liono", "November 11, 1974", 1));
        actors.add(new Actor("Matt Damon", "October 8, 1970", 1));
        actors.add(new Actor("Jennifer Lawrence", "August 15, 1990", 1));

        mAdapter = new ActorArrayAdapter(actors, this);
        mListView.setAdapter(mAdapter);

    }
}
