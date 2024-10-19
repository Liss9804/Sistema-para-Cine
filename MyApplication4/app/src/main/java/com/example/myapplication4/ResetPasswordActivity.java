package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password); // Asegúrate de que este sea el layout correcto

        Button resetPasswordButton = findViewById(R.id.resetPasswordButton);

        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para regresar a MainActivity (inicio de sesión)
                Intent intent = new Intent(ResetPasswordActivity.this, ResetPasswordActivity.class);
                startActivity(intent);
                finish(); // Finaliza esta actividad para que no se quede en la pila
            }
        });
    }
}
