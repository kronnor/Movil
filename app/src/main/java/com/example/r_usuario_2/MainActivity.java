package com.example.r_usuario_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.r_usuario_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /*EditText txt_Nombre= binding.textNombre;
        EditText txt_clave=binding.textClave;
        EditText txt_r_clave=binding.textRClave;
        TextView txt_resultado=binding.textResultado;
        Button btn_registro=binding.btnRegistro;*/


        binding.btnRegistro.setOnClickListener( v -> {
            String nombre = binding.textClave.getText().toString();
            String clave = binding.textClave.getText().toString();
            String r_clave = binding.textRClave.getText().toString();

            /*if(clave.equals(r_clave)) {
                if (clave.length()<4){
                    Context context = MainActivity.this;
                    CharSequence text = "Minimo 5 caracteres";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else {

                    //binding.textResultado.setText("Usuario Resgistrado");
                    abrirventana(nombre);

                }



            }else{
                Context context = MainActivity.this;
                CharSequence text = "Claves deben coincidir";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }*/
            abrirventana();
        });


    }
    private void abrirventana(){
        Intent intent = new Intent(this, ActivityDetalle.class);
        //intent.putExtra("nombre",nom);
        startActivity(intent);
    }
    /*private void abrirActivityDetalle (String nom){
        Intent intent = new Intent(this, ActivityDetalle.class);
        intent.putExtra("nombre",nom);
        startActivity(intent);
    }*/

}