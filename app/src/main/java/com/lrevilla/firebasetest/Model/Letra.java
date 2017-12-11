package com.lrevilla.firebasetest.Model;

/**
 * Created by LuisRevilla on 11/12/2017.
 */

public class Letra {

    public String name;
    public Pregunta [] preguntas;

    public Letra() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Letra(String username, Pregunta[] preguntas) {
        this.name = name;
        this.preguntas = preguntas;
    }
}
