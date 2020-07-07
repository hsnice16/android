package com.example.strobelight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = (ConstraintLayout)findViewById(R.id.main_activity);
        bgElement.setBackgroundColor(Color.RED);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod(){
        final Button button = (Button)findViewById(R.id.button);
        button.setText("Change to Blue!");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstraintLayout bgElement = (ConstraintLayout)findViewById(R.id.main_activity);
                int color = ((ColorDrawable)bgElement.getBackground()).getColor();
                if(color == Color.RED){
                    button.setText("Change to Red!");
                    bgElement.setBackgroundColor(Color.BLUE);
                }else{
                    button.setText("Change to Blue!");
                    bgElement.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}