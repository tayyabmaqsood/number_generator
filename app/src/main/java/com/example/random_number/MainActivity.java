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

        rollButton = findViewById(R.id.RollButton);
        resultsTextView = (TextView) findViewById(R.id.ResultText);
        seekBar = findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                resultsTextView.setText( String.valueOf(random.nextInt(seekBar.getProgress())));
            }
        });
    }
}