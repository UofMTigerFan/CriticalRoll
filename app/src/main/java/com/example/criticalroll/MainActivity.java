package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button btn = (Button)findViewById(R.id.statsbutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StatsActivity.class));
            }
        });
    }


    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        int defaultValue = getResources().getInteger(R.integer.saved_times_pressed_default_key);

        SharedPreferences.Editor editor = sharedPref.edit();
        switch(randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.nat1);
                TextViewDice.setText("Critical Miss!");
                MediaPlayer miss = MediaPlayer.create(MainActivity.this,R.raw.doh);
                miss.start();
                int timesPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_1), defaultValue);

                int newTimesPressed = timesPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_1), newTimesPressed);
                editor.commit();

                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.num2);
                int twoPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_2), defaultValue);

                int newTwoPressed = twoPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_2), newTwoPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.num3);
                int threePressed = sharedPref.getInt(getString(R.string.saved_dice_roll_3), defaultValue);

                int newThreePressed = threePressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_3), newThreePressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.num4);
                int fourPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_4), defaultValue);

                int newFourPressed = fourPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_4), newFourPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.num5);
                int fivePressed = sharedPref.getInt(getString(R.string.saved_dice_roll_5), defaultValue);

                int newFivePressed = fivePressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_5), newFivePressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.num6);
                int sixPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_6), defaultValue);

                int newSixPressed = sixPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_6), newSixPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.num7);
                int sevenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_7), defaultValue);

                int newSevenPressed = sevenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_7), newSevenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.num8);
                int eightPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_8), defaultValue);

                int newEightPressed = eightPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_8), newEightPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.num9);
                int ninePressed = sharedPref.getInt(getString(R.string.saved_dice_roll_9), defaultValue);

                int newNinePressed = ninePressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_9), newNinePressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.num10);
                int tenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_10), defaultValue);

                int newTenPressed = tenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_10), newTenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.num11);
                int elevenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_11), defaultValue);

                int newElevenPressed = elevenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_11), newElevenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.num12);
                int twelvePressed = sharedPref.getInt(getString(R.string.saved_dice_roll_12), defaultValue);

                int newTwelvePressed = twelvePressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_12), newTwelvePressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.num13);
                int thirteenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_13), defaultValue);

                int newThirteenPressed = thirteenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_13), newThirteenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.num14);
                int fourteenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_14), defaultValue);

                int newFourteenPressed = fourteenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_14), newFourteenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.num15);
                int fifteenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_15), defaultValue);

                int newFifteenPressed = fifteenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_15), newFifteenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.num16);
                int sixteenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_16), defaultValue);

                int newSixteenPressed = sixteenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_16), newSixteenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.num17);
                int seventeenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_17), defaultValue);

                int newSeventeenPressed = seventeenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_17), newSeventeenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.num18);
                int eighteenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_18), defaultValue);

                int newEighteenPressed = eighteenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_18), newEighteenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.num19);
                int nineteenPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_19), defaultValue);

                int newNineteenPressed = nineteenPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_19), newNineteenPressed);
                editor.commit();
                TextViewDice.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.nat20);
                int twentyPressed = sharedPref.getInt(getString(R.string.saved_dice_roll_20), defaultValue);

                int newTwentyPressed = twentyPressed + 1;

                editor.putInt(getString(R.string.saved_dice_roll_20), newTwentyPressed);
                editor.commit();
                TextViewDice.setText("Critical Hit!");
                MediaPlayer crit = MediaPlayer.create(MainActivity.this,R.raw.saiyan);
                crit.start();
                break;
        }
    }
}
