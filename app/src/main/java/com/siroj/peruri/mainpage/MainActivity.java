package com.siroj.peruri.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.siroj.peruri.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {
    LinearLayout profil, produk, laporan, csr,
            kontak, karir, afiliasi, whistleBlower, eProc;
    CarouselView carouselView;
    int[] sampleImages = {
            R.drawable.perum_peruri, R.drawable.peruri_lama, R.drawable.peruri,
            R.drawable.peruri_1, R.drawable.peruri_3, R.drawable.peruri_2
    };

    private static final int TIME_INTERVAL = 2000;
    private long backPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        profil          = (LinearLayout) findViewById(R.id.profil);
        produk          = (LinearLayout) findViewById(R.id.produk);
        laporan         = (LinearLayout) findViewById(R.id.laporan);
        csr             = (LinearLayout) findViewById(R.id.csr);
        kontak          = (LinearLayout) findViewById(R.id.kontak);
        karir           = (LinearLayout) findViewById(R.id.karir);
        afiliasi        = (LinearLayout) findViewById(R.id.afiliasi);
        whistleBlower   = (LinearLayout) findViewById(R.id.whistleBlower);
        eProc           = (LinearLayout) findViewById(R.id.eProc);


        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profil = new Intent(MainActivity.this, Profil.class);
                if(Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(profil,options.toBundle());
                }else {
                    startActivity(profil);
                }
            }
        });

        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent produk = new Intent(MainActivity.this, Produk.class);
                if(Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(produk,options.toBundle());
                }else {
                    startActivity(produk);
                }
            }
        });

        laporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent laporan = new Intent(MainActivity.this, Laporan.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(laporan, options.toBundle());
                }else {
                    startActivity(laporan);
                }
            }
        });

        csr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csr = new Intent(MainActivity.this, Csr.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(csr, options.toBundle());
                }else {
                    startActivity(csr);
                }
            }
        });

        kontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kontak = new Intent(MainActivity.this, Kontak.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(kontak, options.toBundle());
                }else {
                    startActivity(kontak);
                }
            }
        });

        karir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karir = new Intent(MainActivity.this, Karir.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(karir, options.toBundle());
                }else {
                    startActivity(karir);
                }
            }
        });

        afiliasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent afiliasi = new Intent(MainActivity.this, Afiliasi.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(afiliasi, options.toBundle());
                }else {
                    startActivity(afiliasi);
                }
            }
        });

        whistleBlower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.peruri.co.id/whistle-blower"));
                startActivity(i);
            }
        });

        eProc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://eproc.peruri.co.id/"));
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed(){
        if (backPressed + TIME_INTERVAL>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }
        else {
            Toast.makeText(getBaseContext(), "Tekan sekali lagi untuk keluar",
                    Toast.LENGTH_SHORT).show();
        }
        backPressed = System.currentTimeMillis();
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}
