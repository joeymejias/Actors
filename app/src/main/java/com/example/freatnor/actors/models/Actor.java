package com.example.freatnor.actors.models;

/**
 * Created by Jonathan Taylor on 8/10/16.
 */
public class Actor {

    private String mName;
    private String mDateOfBirth;
    private int mOscarsWon;

    public Actor(String name, String dateOfBirth, int oscarsWon) {
        mName = name;
        mDateOfBirth = dateOfBirth;
        mOscarsWon = oscarsWon;
    }

    public String getName() {
        return mName;
    }

    public String getDateOfBirth() {
        return mDateOfBirth;
    }

    public int getOscarsWon() {
        return mOscarsWon;
    }
}
