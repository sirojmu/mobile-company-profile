package com.siroj.peruri.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.transition.Slide;
import android.view.Gravity;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import android.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.siroj.peruri.R;


public class Sejarah extends AppCompatActivity {
    TextView textView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation();
        setContentView(R.layout.activity_sejarah);

        textView = findViewById(R.id.txtSejarah);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Sejarah Peruri");

        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        textView.setText(R.string.sejarah_peruri);

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
