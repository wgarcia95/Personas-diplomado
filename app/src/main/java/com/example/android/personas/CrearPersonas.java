package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {

    private EditText cajacedula, cajanombre, cajaapellido;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cajacedula = (EditText)findViewById(R.id.txtCedula);
        cajanombre = (EditText)findViewById(R.id.txtNombre);
        cajaapellido =(EditText)findViewById(R.id.txtApellido);
        res = this.getResources();
    }

    public void crear(View v){
        String cedula,nombre,apellido;
        cedula = cajacedula.getText().toString();
        nombre = cajanombre.getText().toString().trim();
        apellido = cajaapellido.getText().toString().trim();

        Persona p = new Persona(cedula, nombre, apellido);
        p.guardar();

        Toast.makeText(this, res.getString(R.string.personaguardada), Toast.LENGTH_SHORT).show();
        limpiar(v);
    }

    public void limpiar(View v){
        limpiar();
    }

    private void limpiar(){
        cajacedula.setText("");;
        cajanombre.setText("");
        cajaapellido.setText("");
        cajacedula.requestFocus();
    }
}
