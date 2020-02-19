package com.adjav.game.bored;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class AccuracyGameActivity extends AppCompatActivity {

    ImageView target1, target2, target3, target4, target5, target6, target7, target8, target9;

    TextView tv_left, tv_score;

    Button button;

    Random r;

    int score = 0, fps = 1000, left = 3, templifleft = 0;

    int which = 0;
    int whichsave = 0;

    private AccuracyGameSounds sound;

    AnimationDrawable an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accuracy_game);

        r = new Random();

        button = (Button) findViewById(R.id.button);

        sound = new AccuracyGameSounds(this);

        tv_left = (TextView) findViewById(R.id.tv_left);
        tv_score = (TextView) findViewById(R.id.tv_score);

        target1 = (ImageView) findViewById(R.id.target1);
        target2 = (ImageView) findViewById(R.id.target2);
        target3 = (ImageView) findViewById(R.id.target3);
        target4 = (ImageView) findViewById(R.id.target4);
        target5 = (ImageView) findViewById(R.id.target5);
        target6 = (ImageView) findViewById(R.id.target6);
        target7 = (ImageView) findViewById(R.id.target7);
        target8 = (ImageView) findViewById(R.id.target8);
        target9 = (ImageView) findViewById(R.id.target9);


        target1.setVisibility(View.INVISIBLE);
        target2.setVisibility(View.INVISIBLE);
        target3.setVisibility(View.INVISIBLE);
        target4.setVisibility(View.INVISIBLE);
        target5.setVisibility(View.INVISIBLE);
        target6.setVisibility(View.INVISIBLE);
        target7.setVisibility(View.INVISIBLE);
        target8.setVisibility(View.INVISIBLE);
        target9.setVisibility(View.INVISIBLE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left = 3;
                tv_left.setText("LEFT: " + left);
                score = 0;
                tv_score.setText("SCORE: " + score);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        theGameActions();
                    }
                },1000);
                button.setEnabled(false);
            }
        });

        target1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target1.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target1.setEnabled(false);
                sound.playHitSound();
            }
        });

        target2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target2.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target2.setEnabled(false);
                sound.playHitSound();
            }
        });

        target3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target3.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target3.setEnabled(false);
                sound.playHitSound();
            }
        });
        target4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target4.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target5.setEnabled(false);
                sound.playHitSound();
            }
        });

        target5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target5.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target5.setEnabled(false);
                sound.playHitSound();
            }
        });

        target6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target6.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target6.setEnabled(false);
                sound.playHitSound();
            }
        });
        target7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target7.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target7.setEnabled(false);
                sound.playHitSound();
            }
        });

        target8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target8.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target8.setEnabled(false);
                sound.playHitSound();
            }
        });

        target9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                templifleft = 1;
                target9.setImageResource(R.drawable.targethit);
                score = score + 1;
                tv_score.setText("SCORE: " + score);
                target9.setEnabled(false);
                sound.playHitSound();
            }
        });

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);

    }

    private void theGameActions(){
        if(score < 10 ){
            fps = 950;
        } else if (score >= 10 && score < 15 ){
            fps = 900;
        }
        else if (score >= 15 && score < 20 ){
            fps = 850;
        }
        else if (score >= 20 && score < 25 ){
            fps = 800;
        }
        else if (score >= 25 && score < 30 ){
            fps = 750;
        }
        else if (score >= 30 && score < 35 ){
            fps = 700;
        }
        else if (score >= 35 && score < 40 ){
            fps = 650;
        }
        else if (score >= 40 && score < 45 ){
            fps = 600;
        }
        else if (score >= 45 && score < 50 ){
            fps = 550;
        }
        else if (score >= 50 && score < 55 ){
            fps = 500;
        }
        else if (score >= 55 && score < 60 ){
            fps = 450;
        }
        else if (score >= 60 && score < 65 ){
            fps = 400;
        }
        else if (score >= 65 && score < 70 ){
            fps = 350;
        }
        else if (score >= 70 && score < 75 ){
            fps = 300;
        }
        else if (score >= 75 && score < 80){
            fps = 250;
        }
        else if (score >= 80 && score < 85) {
            fps = 200;
        }

        an = (AnimationDrawable) ContextCompat.getDrawable(this, R.drawable.anim);

        do{
            which = r.nextInt(9) + 1;
        } while (whichsave == which);
        whichsave = which;

        if(which == 1){
            target1.setImageDrawable(an);
            target1.setVisibility(View.VISIBLE);
            target1.setEnabled(true);
        } else if(which == 2){
            target2.setImageDrawable(an);
            target2.setVisibility(View.VISIBLE);
            target2.setEnabled(true);
        } else if(which == 3){
            target3.setImageDrawable(an);
            target3.setVisibility(View.VISIBLE);
            target3.setEnabled(true);
        } else if(which == 4){
            target4.setImageDrawable(an);
            target4.setVisibility(View.VISIBLE);
            target4.setEnabled(true);
        } else if(which == 5){
            target5.setImageDrawable(an);
            target5.setVisibility(View.VISIBLE);
            target5.setEnabled(true);
        } else if(which == 6){
            target6.setImageDrawable(an);
            target6.setVisibility(View.VISIBLE);
            target6.setEnabled(true);
        } else if(which == 7){
            target7.setImageDrawable(an);
            target7.setVisibility(View.VISIBLE);
            target7.setEnabled(true);
        } else if(which == 8){
            target8.setImageDrawable(an);
            target8.setVisibility(View.VISIBLE);
            target8.setEnabled(true);
        } else if(which == 9){
            target9.setImageDrawable(an);
            target9.setVisibility(View.VISIBLE);
            target9.setEnabled(true);
        }

        an.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                target1.setVisibility(View.INVISIBLE);
                target2.setVisibility(View.INVISIBLE);
                target3.setVisibility(View.INVISIBLE);
                target4.setVisibility(View.INVISIBLE);
                target5.setVisibility(View.INVISIBLE);
                target6.setVisibility(View.INVISIBLE);
                target7.setVisibility(View.INVISIBLE);
                target8.setVisibility(View.INVISIBLE);
                target9.setVisibility(View.INVISIBLE);

                target1.setEnabled(false);
                target2.setEnabled(false);
                target3.setEnabled(false);
                target4.setEnabled(false);
                target5.setEnabled(false);
                target6.setEnabled(false);
                target7.setEnabled(false);
                target8.setEnabled(false);
                target9.setEnabled(false);

                if (templifleft == 0){
                    left = left - 1;
                    tv_left.setText("LEFT: " + left);
                } else  if (templifleft == 1){
                    templifleft = 0;
                }
                if(left == 0){
                    Toast.makeText(AccuracyGameActivity.this, "GAME OVER", Toast.LENGTH_SHORT).show();
                    button.setEnabled(true);

                    Intent intent = new Intent(getApplicationContext(), AccuracyResultActivity.class);
                    intent.putExtra("SCORE", score);

                    startActivity(intent);
                } else  if (left > 0){
                    theGameActions();
                }
            }
        }, fps);
    }
}
