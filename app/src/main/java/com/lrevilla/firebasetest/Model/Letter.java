package com.lrevilla.firebasetest.Model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.ArrayList;

/**
 * Created by LuisRevilla on 11/12/2017.
 */

@IgnoreExtraProperties
public class Letter {

    public ArrayList<Question> questions;

    public Letter() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Letter(ArrayList<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "questions: " + questions.toString();
    }
}
