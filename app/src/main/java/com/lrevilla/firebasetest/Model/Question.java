package com.lrevilla.firebasetest.Model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by LuisRevilla on 11/12/2017.
 */

@IgnoreExtraProperties
class Question {

    public String statement;
    public String answer;

    public Question() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Question(String statement, String answer) {
        this.statement = statement;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "statement: " + this.statement + " | answer:" + this.answer;
    }
}
