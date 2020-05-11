package com.example.dougfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView battery;
    Button minus, plus;
    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        battery = findViewById(R.id.image1);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (count){
                    case 0:
                        battery.setImageLevel(0);
                        count++;
                        break;
                    case 1:
                        battery.setImageLevel(1);
                        count++;
                        break;
                    case 2:
                        battery.setImageLevel(2);
                        count++;
                        break;
                    case 3:
                        battery.setImageLevel(3);
                        count++;
                        break;
                    case 4:
                        battery.setImageLevel(4);
                        count++;
                        break;
                    case 5:
                        battery.setImageLevel(5);
                        count++;
                        break;
                    case 6:
                        battery.setImageLevel(6);
                        break;
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (count){
                    case 0:
                        battery.setImageLevel(0);
                        break;
                    case 1:
                        battery.setImageLevel(1);
                        count--;
                        break;
                    case 2:
                        battery.setImageLevel(2);
                        count--;
                        break;
                    case 3:
                        battery.setImageLevel(3);
                        count--;
                        break;
                    case 4:
                        battery.setImageLevel(4);
                        count--;
                        break;
                    case 5:
                        battery.setImageLevel(5);
                        count--;
                        break;
                    case 6:
                        battery.setImageLevel(6);
                        count--;
                        break;
                }
            }
        });

    }

}
