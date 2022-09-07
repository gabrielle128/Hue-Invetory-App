package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    private static final int SPLASH = 2000;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        TextView aboutus = findViewById(R.id.aboutus);
        TextView description = findViewById(R.id.description);
        ImageView hueLogo = findViewById(R.id.hueLogo);
        TextView Batralo = findViewById(R.id.Batralo);
        TextView Baylon = findViewById(R.id.Baylon);
        TextView Cabobos = findViewById(R.id.Cabobos);
        TextView Corpuz = findViewById(R.id.Corpuz);
        TextView DelaCruz = findViewById(R.id.DelaCruz);
        TextView Espineda = findViewById(R.id.Espineda);
        TextView Francia = findViewById(R.id.Francia);
        TextView Pontilla = findViewById(R.id.Pontilla);
        aboutus.setAnimation(animation);
        hueLogo.setAnimation(animation);
        Batralo.setAnimation(animation);
        Baylon.setAnimation(animation);
        Cabobos.setAnimation(animation);
        Corpuz.setAnimation(animation);
        DelaCruz.setAnimation(animation);
        Espineda.setAnimation(animation);
        Francia.setAnimation(animation);
        Pontilla.setAnimation(animation);
        description.setAnimation(animation);
    }
}