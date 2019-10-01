package com.example.criticalroll;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class StatsActivity extends MainActivity{

    private TextView d1;
    private TextView d2;
    private TextView d3;
    private TextView d4;
    private TextView d5;
    private TextView d6;
    private TextView d7;
    private TextView d8;
    private TextView d9;
    private TextView d10;
    private TextView d11;
    private TextView d12;
    private TextView d13;
    private TextView d14;
    private TextView d15;
    private TextView d16;
    private TextView d17;
    private TextView d18;
    private TextView d19;
    private TextView d20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);
        d10 = findViewById(R.id.d10);
        d11 = findViewById(R.id.d11);
        d12 = findViewById(R.id.d12);
        d13 = findViewById(R.id.d13);
        d14 = findViewById(R.id.d14);
        d15 = findViewById(R.id.d15);
        d16 = findViewById(R.id.d16);
        d17 = findViewById(R.id.d17);
        d18 = findViewById(R.id.d18);
        d19 = findViewById(R.id.d19);
        d20 = findViewById(R.id.d20);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        int defaultValue =getResources().getInteger(R.integer.saved_times_pressed_default_key);
        int rd1 = sharedPref.getInt(getString(R.string.saved_dice_roll_1), defaultValue);
        int rd2 = sharedPref.getInt(getString(R.string.saved_dice_roll_2), defaultValue);
        int rd3 = sharedPref.getInt(getString(R.string.saved_dice_roll_3), defaultValue);
        int rd4 = sharedPref.getInt(getString(R.string.saved_dice_roll_4), defaultValue);
        int rd5 = sharedPref.getInt(getString(R.string.saved_dice_roll_5), defaultValue);
        int rd6 = sharedPref.getInt(getString(R.string.saved_dice_roll_6), defaultValue);
        int rd7 = sharedPref.getInt(getString(R.string.saved_dice_roll_7), defaultValue);
        int rd8 = sharedPref.getInt(getString(R.string.saved_dice_roll_8), defaultValue);
        int rd9 = sharedPref.getInt(getString(R.string.saved_dice_roll_9), defaultValue);
        int rd10 = sharedPref.getInt(getString(R.string.saved_dice_roll_10), defaultValue);
        int rd11 = sharedPref.getInt(getString(R.string.saved_dice_roll_11), defaultValue);
        int rd12 = sharedPref.getInt(getString(R.string.saved_dice_roll_12), defaultValue);
        int rd13 = sharedPref.getInt(getString(R.string.saved_dice_roll_13), defaultValue);
        int rd14 = sharedPref.getInt(getString(R.string.saved_dice_roll_14), defaultValue);
        int rd15 = sharedPref.getInt(getString(R.string.saved_dice_roll_15), defaultValue);
        int rd16 = sharedPref.getInt(getString(R.string.saved_dice_roll_16), defaultValue);
        int rd17 = sharedPref.getInt(getString(R.string.saved_dice_roll_17), defaultValue);
        int rd18 = sharedPref.getInt(getString(R.string.saved_dice_roll_18), defaultValue);
        int rd19 = sharedPref.getInt(getString(R.string.saved_dice_roll_19), defaultValue);
        int rd20 = sharedPref.getInt(getString(R.string.saved_dice_roll_20), defaultValue);


        d1.setText("You have rolled a nat 1 " + Integer.toString(rd1) + " times. Unlucky!");
        d2.setText("You have rolled a 2 " + Integer.toString(rd2) + " times.");
        d3.setText("You have rolled a 3 " + Integer.toString(rd3) + " times.");
        d4.setText("You have rolled a 4 " + Integer.toString(rd4) + " times.");
        d5.setText("You have rolled a 5 " + Integer.toString(rd5) + " times.");
        d6.setText("You have rolled a 6 " + Integer.toString(rd6) + " times.");
        d7.setText("You have rolled a 7 " + Integer.toString(rd7) + " times.");
        d8.setText("You have rolled a 8 " + Integer.toString(rd8) + " times.");
        d9.setText("You have rolled a 9 " + Integer.toString(rd9) + " times.");
        d10.setText("You have rolled a 10 " + Integer.toString(rd10) + " times.");
        d11.setText("You have rolled a 11 " + Integer.toString(rd11) + " times.");
        d12.setText("You have rolled a 12 " + Integer.toString(rd12) + " times.");
        d13.setText("You have rolled a 13 " + Integer.toString(rd13) + " times.");
        d14.setText("You have rolled a 14 " + Integer.toString(rd14) + " times.");
        d15.setText("You have rolled a 15 " + Integer.toString(rd15) + " times.");
        d16.setText("You have rolled a 16 " + Integer.toString(rd16) + " times.");
        d17.setText("You have rolled a 17 " + Integer.toString(rd17) + " times.");
        d18.setText("You have rolled a 18 " + Integer.toString(rd18) + " times.");
        d19.setText("You have rolled a 19 " + Integer.toString(rd19) + " times.");
        d20.setText("You have rolled a nat 20 " + Integer.toString(rd20) + " times. Nice!");
    }

}
