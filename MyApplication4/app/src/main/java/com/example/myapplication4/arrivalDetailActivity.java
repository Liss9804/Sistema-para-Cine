package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class arrivalDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrival_detail);

        // Botón de Comprar Boleto
        Button buyTicketButton = findViewById(R.id.buyTicketButton);
        buyTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a SeatSelectionActivity
                Intent intent = new Intent(arrivalDetailActivity.this, SeatSelectionActivity.class);
                startActivity(intent);
            }
        });

        // Botón de Reservar Boleto
        Button reserveTicketButton = findViewById(R.id.reserveTicketButton);
        reserveTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a SeatSelectionActivity
                Intent intent = new Intent(arrivalDetailActivity.this, SeatSelectionActivity.class);
                startActivity(intent);
            }
        });
    }
}
