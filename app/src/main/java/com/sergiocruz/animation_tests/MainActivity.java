package com.sergiocruz.animation_tests;

/**
 * Created by Sergio on 25/12/2017.
 */

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView_animation = findViewById(R.id.text_view_animation);
        Drawable drawable = imageView_animation.getDrawable();
        Animatable animatable = ((Animatable) drawable);

        animatable.start();

        imageView_animation.setOnClickListener(v -> {
            animatable.stop();
            animatable.start();
        });

    }



}
