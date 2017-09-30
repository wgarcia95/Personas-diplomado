package com.example.android.personas;

import java.util.ArrayList;

/**
 * Created by Android on 30/09/2017.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList();

    public static void guardarPersona(Persona P){
        personas.add(P);
    }

    public static ArrayList<Persona> getPersonas(){
        return personas;
    }

}
