package com.lrevilla.firebasetest.Model;

/**
 * Created by LuisRevilla on 11/12/2017.
 */

class Pregunta {

    public String enunciado;
    public String respuesta;

    public Pregunta() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Pregunta(String enunciado, String respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }
}
