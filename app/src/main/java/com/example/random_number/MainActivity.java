package com.example.random_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    TextView resultsTextView;
    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.roll_button);
        resultsTextView = findViewById(R.id.result_textview);
        seekBar = findViewById(R.id.seekBar);

        rollButton.setOnClickListener(v -> {
         resultsTextView.setText( (new Random().nextInt(seekBar.getProgress())));
        });
    }
}