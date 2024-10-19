package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class codigoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_detail);

        Button buyTicketButton = findViewById(R.id.buyTicketButton);
        Button reserveTicketButton = findViewById(R.id.reserveTicketButton);

        buyTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(codigoDetailActivity.this, SeatSelectionActivity.class);
                startActivity(intent);
            }
        });

        reserveTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(codigoDetailActivity.this, SeatSelectionActivity.class);
                startActivity(intent);
            }
        });
    }
}
