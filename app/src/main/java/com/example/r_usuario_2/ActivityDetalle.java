package com.example.r_usuario_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.r_usuario_2.databinding.ActivityDetalleBinding;

public class ActivityDetalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDetalleBinding binding1 = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding1.getRoot());


       // Bundle extras =getIntent().getExtras();
        //String nombre = extras.getString("nombre");

        //binding1.txtNombre.setText(nombre);





    }
}