package com.siroj.peruri.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.siroj.peruri.R;
import com.siroj.peruri.produk.*;

public class Produk extends AppCompatActivity {
    LinearLayout linearLayoutUang, linearLayoutgamonang,
            linearLayouttasganu, linearLayoutdigital;


    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation();
        setContentView(R.layout.activity_produk);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Produk Peruri");

        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        linearLayoutUang = (LinearLayout)findViewById(R.id.uang);
        linearLayouttasganu = (LinearLayout)findViewById(R.id.tasganu);
        linearLayoutgamonang = (LinearLayout)findViewById(R.id.gamonang);
        linearLayoutdigital = (LinearLayout)findViewById(R.id.digital);

        linearLayoutUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Uang = new Intent(Produk.this, Uang.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Produk.this);
                    startActivity(Uang, options.toBundle());
                }else {
                    startActivity(Uang);
                }
            }
        });

        linearLayouttasganu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Tasganu = new Intent(Produk.this, Tasganu.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Produk.this);
                    startActivity(Tasganu, options.toBundle());
                }else{
                    startActivity(Tasganu);
                }
            }
        });

        linearLayoutgamonang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gamonang = new Intent(Produk.this, Gamonang.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Produk.this);
                    startActivity(Gamonang, options.toBundle());
                }else{
                    startActivity(Gamonang);
                }
            }
        });

        linearLayoutdigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Digital = new Intent(Produk.this, Digital.class);
                if(Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Produk.this);
                    startActivity(Digital, options.toBundle());
                }else{
                    startActivity(Digital);
                }
            }
        });

    }

    private void setAnimation() {
        if(Build.VERSION.SDK_INT>20) {
            Slide slide = new Slide();
            slide.setSlideEdge(Gravity.RIGHT);
            slide.setDuration(350);
            slide.setInterpolator(new DecelerateInterpolator());
            getWindow().setExitTransition(slide);
            getWindow().setEnterTransition(slide);
        }
    }
}
