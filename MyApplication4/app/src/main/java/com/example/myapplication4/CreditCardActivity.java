package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CreditCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);

        Button confirmPaymentButton = findViewById(R.id.confirmPaymentButton);

        confirmPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar lógica para procesar el pago con tarjeta, si es necesario
                Intent intent = new Intent(CreditCardActivity.this, MainActivity.class);
                startActivity(intent); // Regresa a la pantalla de inicio (login)
            }
        });
    }
}
