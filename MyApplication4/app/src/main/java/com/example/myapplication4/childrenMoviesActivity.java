package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class childrenMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children_movies);

        // Inicializar la imagen home
        ImageView homeImage = findViewById(R.id.homeImage);
        homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(childrenMoviesActivity.this, homeDetailActivity.class);
                startActivity(intent);
            }
        });

        // Inicializar la imagen de shrek
        ImageView shrekImage = findViewById(R.id.shrekImage);
        shrekImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(childrenMoviesActivity.this, shrekDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
