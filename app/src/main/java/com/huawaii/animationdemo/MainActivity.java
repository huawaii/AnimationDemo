package com.huawaii.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        ImageView iv = (ImageView) findViewById(R.id.imageView_plane);

        AnimationDrawable drawable = (AnimationDrawable) getResources().getDrawable(R.drawable.play_basketball);
        TransferAnimationDrawable animationDrawable = new TransferAnimationDrawable(drawable);

        iv.setBackground(animationDrawable);

        animationDrawable.start();
    }
}
