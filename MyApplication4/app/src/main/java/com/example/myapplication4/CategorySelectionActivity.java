package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CategorySelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);

        // Encontrar los botones por su ID
        Button adultsButton = findViewById(R.id.adultsButton);
        Button childrenButton = findViewById(R.id.childrenButton);
        Button aptForAllButton = findViewById(R.id.allPublicButton);

        // Manejar el clic del botón de Adultos
        adultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para ir a AdultMoviesActivity (corregido con mayúscula)
                Intent intent = new Intent(CategorySelectionActivity.this, adultosMoviesActivity.class);
                startActivity(intent);
            }
        });

        // Manejar el clic del botón de Niños
        childrenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para ir a ChildrenMoviesActivity (corregido con mayúscula)
                Intent intent = new Intent(CategorySelectionActivity.this, childrenMoviesActivity.class);
                startActivity(intent);
            }
        });

        // Manejar el clic del botón de Apto para Todo Público
        aptForAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CategorySelectionActivity.this, paratodosMoviesActivity.class);
                startActivity(intent);
            }
        });
    }
}
