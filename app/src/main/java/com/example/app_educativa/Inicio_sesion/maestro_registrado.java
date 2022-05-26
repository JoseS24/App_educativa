package com.example.app_educativa.Inicio_sesion;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app_educativa.R;
import com.example.app_educativa.actividades.menu_niveles;


public class maestro_registrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maestro_registrado);
    }
    public void regreso_menu (View view){
        Intent regreso = new Intent(this,crear_cuenta.class);
        startActivity(regreso);
    }
}