package com.example.freatnor.actors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.freatnor.actors.presenters.ActorArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ActorArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ToDo get the list view by id
        mListView = findViewById(R.id.)
    }
}
