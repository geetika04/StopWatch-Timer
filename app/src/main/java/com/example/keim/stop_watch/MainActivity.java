package com.example.keim.stop_watch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv1,tv2;
    ImageView im;
    Animation afg, btg1,btg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btSplash);
        tv1=findViewById(R.id.tvSplash);
        tv2=findViewById(R.id.tvsubSplash);
        im=findViewById(R.id.ivSplash);

        //load animation
        afg= AnimationUtils.loadAnimation(this,R.anim.afg);
        btg1=AnimationUtils.loadAnimation(this,R.anim.btg1);
        btg2=AnimationUtils.loadAnimation(this,R.anim.btg2);

        //asign the animation
        im.startAnimation(afg);
        tv1.startAnimation(btg1);
        tv2.startAnimation(btg1);
        btn.startAnimation(btg2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a =new Intent(MainActivity.this,StopWatchAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
