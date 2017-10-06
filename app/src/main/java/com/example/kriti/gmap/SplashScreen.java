package com.example.kriti.gmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread splashThread = new Thread(){
            @Override
            public void run() {
                try {
                    ImageView button = (ImageView)findViewById(R.id.button);
                    final Animation myAnim = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.bounce);
                    button.startAnimation(myAnim);
//                    MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                    myAnim.setInterpolator(interpolator);

                    button.startAnimation(myAnim);
                    sleep(4000);
                    Intent intent = new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }
}
