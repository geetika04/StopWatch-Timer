package com.example.keim.stop_watch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatchAct extends AppCompatActivity {

    Button btn2, btn3;
    Animation roundchor;
    ImageView chor;
    Chronometer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btn2=findViewById(R.id.btnstart);
        btn3=findViewById(R.id.btnstop);
        chor=findViewById(R.id.circle_cord);
        timer=findViewById(R.id.timer);


        //create optional animation
        btn3.setAlpha(0);

        //for animation
        roundchor= AnimationUtils.loadAnimation(this,R.anim.roundchor);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //passing animation
                chor.startAnimation(roundchor);
                btn3.animate().alpha(1).translationY(-80).setDuration(300).start();
                btn2.animate().alpha(0).setDuration(300).start();

                //start time
                timer.setBase(SystemClock.elapsedRealtime());
                timer.start();

            }
        });
    }
}
