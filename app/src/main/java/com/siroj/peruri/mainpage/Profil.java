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
import com.siroj.peruri.profil.AboutUs;
import com.siroj.peruri.profil.Dewas;
import com.siroj.peruri.profil.Direksi;
import com.siroj.peruri.profil.Kunjungan;
import com.siroj.peruri.profil.MaknaLogo;
import com.siroj.peruri.profil.Sejarah;
import com.siroj.peruri.profil.Sertifikasi;
import com.siroj.peruri.profil.Tatanilai;
import com.siroj.peruri.profil.Visimisi;

public class Profil extends AppCompatActivity {

    Toolbar toolbar;
    LinearLayout sejarah, about_us, logo, direksi,
            dewas, visimisi, tatanilai, sertifikasi, kunjungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation();
        setContentView(R.layout.activity_profil);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Profil Peruri");

        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        sejarah     = (LinearLayout) findViewById(R.id.sejarah);
        about_us    = (LinearLayout) findViewById(R.id.about_us);
        logo        = (LinearLayout) findViewById(R.id.logo);
        direksi     = (LinearLayout) findViewById(R.id.direksi);
        dewas       = (LinearLayout) findViewById(R.id.dewas);
        visimisi    = (LinearLayout) findViewById(R.id.visimisi);
        tatanilai   = (LinearLayout) findViewById(R.id.tatanilai);
        sertifikasi = (LinearLayout) findViewById(R.id.sertifikasi);
        kunjungan   = (LinearLayout) findViewById(R.id.kunjungan);

        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sejarah = new Intent(Profil.this, Sejarah.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(sejarah, options.toBundle());
                }else {
                    startActivity(sejarah);
                }
            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about_us = new Intent(Profil.this, AboutUs.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(about_us, options.toBundle());
                }else {
                    startActivity(about_us);
                }
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logo = new Intent(Profil.this, MaknaLogo.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(logo, options.toBundle());
                }else {
                    startActivity(logo);
                }
            }
        });

        direksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent direksi = new Intent(Profil.this, Direksi.class);
                if(Build.VERSION.SDK_INT>20) {
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(direksi, options.toBundle());
                }else {
                    startActivity(direksi);
                }
            }
        });

        dewas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dewas = new Intent(Profil.this, Dewas.class);
                if(Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(dewas, options.toBundle());
                }else {
                    startActivity(dewas);
                }
            }
        });

        visimisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visimisi = new Intent(Profil.this, Visimisi.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(visimisi, options.toBundle());
                }else {
                    startActivity(visimisi);
                }
            }
        });

        tatanilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tatanilai = new Intent(Profil.this, Tatanilai.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(tatanilai, options.toBundle());
                }else {
                    startActivity(tatanilai);
                }
            }
        });

        sertifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sertifikasi = new Intent(Profil.this, Sertifikasi.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(sertifikasi, options.toBundle());
                }else {
                    startActivity(sertifikasi);
                }
            }
        });

        kunjungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kunjungan = new Intent (Profil.this, Kunjungan.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Profil.this);
                    startActivity(kunjungan, options.toBundle());
                }else {
                    startActivity(kunjungan);
                }
            }
        });
    }


    public void setAnimation(){
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

