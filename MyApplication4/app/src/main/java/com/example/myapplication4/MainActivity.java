package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Asegúrate de que el layout correcto esté aquí

        Button loginButton = findViewById(R.id.loginButton);
        Button resetPasswordButton = findViewById(R.id.resetPasswordButton);

        // Manejar el clic del botón de inicio de sesión
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para ir a CategorySelectionActivity
                Intent intent = new Intent(MainActivity.this, CategorySelectionActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Manejar el clic del botón de reinicio de contraseña
        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar ResetPasswordActivity
                Intent intent = new Intent(MainActivity.this, ResetPasswordActivity.class);
                startActivity(intent);
            }


        });
    }
}
