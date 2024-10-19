package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class BankTransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_transfer);

        Button confirmTransferButton = findViewById(R.id.confirmTransferButton);

        confirmTransferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar lógica para procesar la transferencia, si es necesario
                Intent intent = new Intent(BankTransferActivity.this, MainActivity.class);
                startActivity(intent); // Regresa a la pantalla de inicio (login)
            }
        });
    }
}
