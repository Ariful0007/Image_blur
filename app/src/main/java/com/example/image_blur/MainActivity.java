package com.example.image_blur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {
    BlurImageView blurImageView;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blurImageView=findViewById(R.id.imageview);
        seekBar=findViewById(R.id.seekbar);

    }
}