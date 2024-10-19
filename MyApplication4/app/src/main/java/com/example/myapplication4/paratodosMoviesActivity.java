package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class paratodosMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paratodos_movie);

        // Inicializar la imagen "No se aceptan devoluciones"
        ImageView noseaceptaImage = findViewById(R.id.noseaceptaImage);
        noseaceptaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(paratodosMoviesActivity.this, noseaceptaDetailActivity.class);
                startActivity(intent);
            }
        });

        // Inicializar la imagen "Extraordinario"
        ImageView extraordinarioImage = findViewById(R.id.extraordinarioImage);
        extraordinarioImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(paratodosMoviesActivity.this, extraordinarioDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}

