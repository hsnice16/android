package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ConvertMilesToKm = findViewById(R.id.buttonMilesToKm);
        Button ConvertKmToMiles = findViewById(R.id.buttonKmToMiles);

        ConvertMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText milesText = findViewById(R.id.editTextMiles);
                EditText kmText = findViewById(R.id.editTextKm);
                double miles = Double.parseDouble(milesText.getText().toString());
                double km = miles/0.62137;
                DecimalFormat dfm = new DecimalFormat("##.##");
                kmText.setText(dfm.format(km));
            }
        });

        ConvertKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText milesText = findViewById(R.id.editTextMiles);
                EditText kmText = findViewById(R.id.editTextKm);
                double km = Double.parseDouble(kmText.getText().toString());
                double miles = km * 0.62137;
                DecimalFormat dfm = new DecimalFormat("##.##");
                milesText.setText(dfm.format(miles));
            }
        });
    }
}