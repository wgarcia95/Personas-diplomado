package com.example.android.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Space;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        tabla = (TableLayout)findViewById(R.id.tbl_listado);
        personas = Datos.getPersonas();

        for (int i = 0; i < personas.size(); i++) {
            TableRow fila = new TableRow(this);
            Space c0 = new Space(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            Persona per = personas.get(i);
            c1.setText(""+(i+1));
            c2.setText(per.getCedula());
            c3.setText(per.getNombre());
            c4.setText(per.getApellido());

            fila.addView(c0);
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            tabla.addView(fila);
        }
    }
}
