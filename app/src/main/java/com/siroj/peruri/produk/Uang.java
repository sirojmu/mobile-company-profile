package com.siroj.peruri.produk;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import android.widget.Toolbar;

import com.siroj.peruri.R;
import com.siroj.peruri.mainpage.Profil;

import org.apache.http.params.HttpParams;

public class Uang extends AppCompatActivity {
    Toolbar toolbar;
    TextView seribu, duapuluh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation();
        setContentView(R.layout.activity_uang);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Uang");
        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        seribu = (TextView) findViewById(R.id.txt_seribuan);
        duapuluh = (TextView) findViewById(R.id.txt_duapuluhan);

        seribu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Uang.this, Seribu.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Uang.this);
                    startActivity(i, options.toBundle());
                }else {
                    startActivity(i);
                }
            }
        });

        duapuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Uang.this, Duapuluh.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Uang.this);
                    startActivity(i, options.toBundle());
                }else {
                    startActivity(i);
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
