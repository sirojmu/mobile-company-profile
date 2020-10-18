package com.siroj.peruri.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.siroj.peruri.R;

import org.w3c.dom.Text;

public class Afiliasi extends AppCompatActivity {

    Toolbar toolbar;
    TextView situspadalarang, situspds,
            situsproperty, situstimur, situscard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation();
        setContentView(R.layout.activity_afiliasi);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Afiliasi");
        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        situspadalarang = (TextView) findViewById(R.id.situspadalarang);
        situspadalarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.kertas-padalarang.co.id/"));
                startActivity(i);
            }
        });

        situspds = (TextView) findViewById(R.id.situspds);
        situspds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.peruridigit.co.id:8080/"));
                startActivity(i);
            }
        });

        situsproperty = (TextView) findViewById(R.id.situsproperty);
        situsproperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://peruriproperty.co.id/"));
                startActivity(i);
            }
        });

        situstimur = (TextView) findViewById(R.id.situstimur);
        situstimur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://peruriwiratimur.co.id/"));
                startActivity(i);
            }
        });

        situscard = (TextView) findViewById(R.id.situscard);
        situscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.cardsindo.com/"));
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
