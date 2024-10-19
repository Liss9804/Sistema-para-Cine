package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method); // Asegúrate de usar el layout correcto

        // Botones de opciones de pago
        Button transferButton = findViewById(R.id.transferButton);  // Para transferencia bancaria
        Button cardPaymentButton = findViewById(R.id.cardPaymentButton); // Para pago con tarjeta de crédito

        // Listener para el botón de Transferencia Bancaria
        transferButton.setOnClickListener(v -> {
            // Crear un Intent para redirigir a la interfaz de Transferencia Bancaria
            Intent intent = new Intent(PaymentMethodActivity.this, BankTransferActivity.class);
            startActivity(intent); // Navegar a la pantalla de Transferencia Bancaria
        });

        // Listener para el botón de Pago con Tarjeta
        cardPaymentButton.setOnClickListener(v -> {
            // Crear un Intent para redirigir a la interfaz de Pago con Tarjeta
            Intent intent = new Intent(PaymentMethodActivity.this, CreditCardActivity.class);
            startActivity(intent); // Navegar a la pantalla de Pago con Tarjeta
        });
    }
}
