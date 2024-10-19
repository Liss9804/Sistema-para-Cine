package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SeatSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);

        for (int i = 1; i <= 20; i++) {
            String buttonID = "seat" + i;
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            Button seatButton = findViewById(resID);

            seatButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SeatSelectionActivity.this, PaymentMethodActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}

