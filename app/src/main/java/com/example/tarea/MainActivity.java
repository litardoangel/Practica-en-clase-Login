package com.example.tarea;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void clickbBotonIngresar(View view){
        TextInputLayout idUsuario = findViewById(R.id.idusuario);
        TextInputEditText usuario = findViewById(R.id.usuario);
        String cedula = usuario.getText().toString();
        if (cedula.equals("") || cedula.length()!=10){
            idUsuario.setError("ingrese una cedula valida");
        }else
            idUsuario.setError("");
    }
    public void clickBotonCancelar(View view) {
        TextInputLayout idclave = findViewById(R.id.idclave);
        TextInputEditText Clave = findViewById(R.id.Clave);
        String cedula = Clave.getText().toString();
        if (cedula.equals("") || cedula.length() != 10) {
            idclave.setError("ingrese una clave valida");
        } else
            idclave.setError("");

    }
}
