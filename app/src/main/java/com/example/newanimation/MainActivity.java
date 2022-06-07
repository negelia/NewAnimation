package com.example.newanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    android.view.animation.Animation Animation;
    ImageView img;
    Button moveBtn, rotateBtn, scaleBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView);
        moveBtn = (Button) findViewById(R.id.moveBtn);
        rotateBtn = (Button) findViewById(R.id.rotateBtn);
        scaleBtn = (Button) findViewById(R.id.scaleBtn);

        moveBtn.setOnClickListener(view -> {
            Animation = AnimationUtils.loadAnimation(this, R.anim.move);
            img.startAnimation(Animation);
        });

        rotateBtn.setOnClickListener(view -> {
            Animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            img.startAnimation(Animation);
        });

        scaleBtn.setOnClickListener(view -> {
            Animation = AnimationUtils.loadAnimation(this, R.anim.scale);
            img.startAnimation(Animation);
        });
    }
}