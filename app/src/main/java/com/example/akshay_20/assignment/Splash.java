package com.example.akshay_20.assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Splash extends Activity {

    ImageView iapplogo, iappname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        iappname = (ImageView)findViewById(R.id.logo);
        iapplogo = (ImageView)findViewById(R.id.logow);
        iapplogo.setImageResource(R.drawable.logo);
        iappname.setImageResource(R.drawable.logow);

        //animation
       // Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        Animation anim2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_left);

        //amking a set two put animation on iappname(fade_in+slide_in_up)
        AnimationSet a = new AnimationSet(false);
        a.addAnimation(anim2);


        //set animation on the applogo image
        iapplogo.setAnimation(anim2);
        iappname.setAnimation(anim2);


        //defines what to be done when animation is complete
        anim2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //start main activity when the animation is finished
                Intent i = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}