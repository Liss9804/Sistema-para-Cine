package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class adultosMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adultos_movie);

        // Inicializar la imagen de Arrival
        ImageView arrivalImage = findViewById(R.id.arrivalImage);
        arrivalImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(adultosMoviesActivity.this, arrivalDetailActivity.class);
                startActivity(intent);
            }
        });

        // Ini
        ImageView codigoImage = findViewById(R.id.codigoImage); //
        codigoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(adultosMoviesActivity.this, codigoDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}

