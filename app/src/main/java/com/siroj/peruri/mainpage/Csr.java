package com.siroj.peruri.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.siroj.peruri.R;
import com.siroj.peruri.csr.Binalingkungan;
import com.siroj.peruri.csr.Kemitraan;

public class Csr extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout beritaCSR, kemitraan, binalingkungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation();
        setContentView(R.layout.activity_csr);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("CSR Peruri");
        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        beritaCSR = (LinearLayout) findViewById(R.id.berita_csr);
        kemitraan = (LinearLayout) findViewById(R.id.kemitraan);
        binalingkungan = (LinearLayout) findViewById(R.id.binalingkungan);

        beritaCSR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.peruri.co.id/pkbl"));
                startActivity(i);
            }
        });

        binalingkungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csr.this, Binalingkungan.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Csr.this);
                    startActivity(intent, options.toBundle());
                }else{
                    startActivity(intent);
                }
            }
        });

        kemitraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csr.this, Kemitraan.class);
                if (Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(Csr.this);
                    startActivity(intent, options.toBundle());
                }else{
                    startActivity(intent);
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
