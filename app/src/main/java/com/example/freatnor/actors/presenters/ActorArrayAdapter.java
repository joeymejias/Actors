package com.example.freatnor.actors.presenters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.freatnor.actors.models.Actor;

import java.util.ArrayList;

/**
 * Created by Jonathan Taylor on 8/10/16.
 */
public class ActorArrayAdapter extends BaseAdapter {

    private ArrayList<Actor> mActors;
    private Context mContext;

    public ActorArrayAdapter(ArrayList<Actor> actors, Context context) {
        mActors = actors;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mActors.size();
    }

    @Override
    public Object getItem(int i) {
        return mActors.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            //ToDo add the layout resource id
            view = LayoutInflater.from(mContext).inflate(R.layout. , viewGroup, false);
        }
        TextView text1 = view.findViewById(R.id.);
        TextView text2 = view.findViewById(R.id.);
        TextView text3 = view.findViewById(R.id.);

        text1.setText("Name: " + mActors.get(i).getName());
        text2.setText("DOB: " + mActors.get(i).getDateOfBirth());
        text3.setText("Oscars won: " + mActors.get(i).getOscarsWon());

        return view;
    }
}
