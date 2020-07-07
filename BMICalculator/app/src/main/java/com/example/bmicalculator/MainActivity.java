package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod(){
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText heightText = (EditText)findViewById(R.id.heightInput);
                double height = Double.parseDouble(heightText.getText().toString());
                EditText weightText = (EditText)findViewById(R.id.weightInput);
                double weight = Double.parseDouble(weightText.getText().toString());
                double BMI = (weight)/(height * height);
                DecimalFormat df = new DecimalFormat("#.#");
                double BMI_Trim = Double.parseDouble(df.format(BMI));
                EditText bmiText = (EditText)findViewById(R.id.BMIResult);
                bmiText.setText(Double.toString(BMI_Trim));
                String BMI_Cat;
                if (BMI < 15)
                    BMI_Cat = "Very severely underweight";
                else if (BMI < 16)
                    BMI_Cat = "Severely underweight";
                else if (BMI < 18.5)
                    BMI_Cat = "Underweight";
                else if (BMI < 25)
                    BMI_Cat = "Normal";
                else if (BMI < 30)
                    BMI_Cat = "Overweight";
                else if (BMI < 35)
                    BMI_Cat = "Obese Class 1 - Moderately Obese";
                else if (BMI < 40)
                    BMI_Cat = "Obese Class 2 - Severely Obese";
                else
                    BMI_Cat = "Obese Class 3 - Very Severely Obese";

                TextView bmiCat = (TextView)findViewById(R.id.BMICategory);
                bmiCat.setText(BMI_Cat);
            }
        });
    }
}