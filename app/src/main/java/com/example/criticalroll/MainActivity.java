package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView TextViewDice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        TextViewDice = findViewById(R.id.textView);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.nat1);
                TextViewDice.setText("Critical Miss!");
                MediaPlayer miss = MediaPlayer.create(MainActivity.this,R.raw.doh);
                miss.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.num2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.num3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.num4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.num5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.num6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.num7);
                TextViewDice.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.num8);
                TextViewDice.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.num9);
                TextViewDice.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.num10);
                TextViewDice.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.num11);
                TextViewDice.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.num12);
                TextViewDice.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.num13);
                TextViewDice.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.num14);
                TextViewDice.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.num15);
                TextViewDice.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.num16);
                TextViewDice.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.num17);
                TextViewDice.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.num18);
                TextViewDice.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.num19);
                TextViewDice.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.nat20);
                TextViewDice.setText("Critical Hit!");
                MediaPlayer crit = MediaPlayer.create(MainActivity.this,R.raw.saiyan);
                crit.start();
                break;
        }
    }
}
