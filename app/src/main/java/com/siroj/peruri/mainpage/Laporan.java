package com.siroj.peruri.mainpage;

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

import androidx.appcompat.app.AppCompatActivity;

import com.siroj.peruri.R;

public class Laporan extends AppCompatActivity {
    LinearLayout linearLayoutLaporanTahunan, linearLayoutLaporanKeuangan,
            linearLayoutgcg, linearLayoutBerita;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation();
        setContentView(R.layout.activity_laporan);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Laporan");
        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        linearLayoutLaporanTahunan = (LinearLayout)findViewById(R.id.laporantahunan);
        linearLayoutLaporanKeuangan = (LinearLayout)findViewById(R.id.laporankeuangan);
        linearLayoutgcg = (LinearLayout)findViewById(R.id.gcg);
        linearLayoutBerita = (LinearLayout)findViewById(R.id.berita);

        linearLayoutLaporanTahunan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.peruri.co.id/annual-report"));
                startActivity(i);
            }
        });

        linearLayoutLaporanKeuangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.peruri.co.id/financial-statement"));
                startActivity(i);
            }
        });

        linearLayoutgcg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.peruri.co.id/corporate-governance"));
                startActivity(i);
            }
        });

        linearLayoutBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.peruri.co.id/news"));
                startActivity(i);
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
