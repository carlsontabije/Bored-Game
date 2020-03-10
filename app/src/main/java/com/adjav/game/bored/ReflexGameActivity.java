package com.adjav.game.bored;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Point;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class ReflexGameActivity extends AppCompatActivity implements ReflexFragment.OnFragmentInteractionListener {

    private TextView scoreLabel;
    private ImageView startLabel;
    private ImageView kirbyy;
    private ImageView star;
    private ImageView pink;
    private ImageView bang;

    // Size
    private int frameHeight;
    private int kirbyySize;
    private int screenWidth;
    private int screenHeight;

    // Position
    private int kirbyyY;
    private int starX;
    private int starY;
    private int pinkX;
    private int pinkY;
    private int bangX;
    private int bangY;

    // Speed
    private int kirbyySpeed;
    private int starSpeed;
    private int pinkSpeed;
    private int bangSpeed;

    // Score
    private int score = 0;

    private Handler handler = new Handler();
    private Timer timer = new Timer();
    private ReflexGameSounds sound;


    // Status Check
    private boolean action_flg = false;
    private boolean start_flg = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflex_game);

        sound = new ReflexGameSounds(this);

        scoreLabel = findViewById(R.id.scoreLabel);
        startLabel = findViewById(R.id.startLabel);
        kirbyy = findViewById(R.id.kirbyy);
        star = findViewById(R.id.star);
        pink = findViewById(R.id.pink);
        bang = findViewById(R.id.bang);


        WindowManager wm = getWindowManager();
        Display disp = wm.getDefaultDisplay();
        Point size = new Point();
        disp.getSize(size);

        screenWidth = size.x;
        screenHeight = size.y;


        kirbyySpeed = Math.round(screenHeight / 60);
        starSpeed = Math.round(screenWidth / 60);
        pinkSpeed = Math.round(screenWidth / 36);
        bangSpeed = Math.round(screenWidth / 30);


        star.setX(-80);
        star.setY(-80);
        pink.setX(-80);
        pink.setY(-80);
        bang.setX(-80);
        bang.setY(-80);

        scoreLabel.setText("Score : 0");

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);

        doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicServiceReflex.class);
        startService(music);
    }

    private boolean mIsBound = false;
    private MusicServiceReflex mServ;
    private ServiceConnection Scon =new ServiceConnection(){

        public void onServiceConnected(ComponentName name, IBinder
                binder) {
            mServ = ((MusicServiceReflex.ServiceBinder)binder).getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            mServ = null;
        }
    };

    void doBindService(){
        bindService(new Intent(this, MusicServiceReflex.class),
                Scon,Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService()
    {
        if(mIsBound)
        {
            unbindService(Scon);
            mIsBound = false;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mServ != null) {
            mServ.resumeMusic();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        //Detect idle screen
        PowerManager pm = (PowerManager)
                getSystemService(Context.POWER_SERVICE);
        boolean isScreenOn = false;
        if (pm != null) {
            isScreenOn = pm.isScreenOn();
        }

        if (!isScreenOn) {
            if (mServ != null) {
                mServ.pauseMusic();
            }
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this, MusicServiceReflex.class);
        stopService(music);

    }


    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);

    }


    public void changePos() {

        hitCheck();

        // Star
        starX -= starSpeed;
        if (starX < 0) {
            starX = screenWidth + 20;
            starY = (int) Math.floor(Math.random() * (frameHeight - star.getHeight()));
        }
        star.setX(starX);
        star.setY(starY);


        // Bang
        bangX -= bangSpeed;
        if (bangX < 0) {
            bangX = screenWidth + 10;
            bangY = (int) Math.floor(Math.random() * (frameHeight - bang.getHeight()));
        }
        bang.setX(bangX);
        bang.setY(bangY);


        // Pink
        pinkX -= pinkSpeed;
        if (pinkX < 0) {
            pinkX = screenWidth + 5000;
            pinkY = (int) Math.floor(Math.random() * (frameHeight - pink.getHeight()));
        }
        pink.setX(pinkX);
        pink.setY(pinkY);


        // Move Kirby
        if (action_flg == true) {
            // Touching
            kirbyyY -= kirbyySpeed;

        } else {
            // Releasing
            kirbyyY += kirbyySpeed;
        }

        if (kirbyyY < 0) kirbyyY = 0;

        if (kirbyyY > frameHeight - kirbyySize) kirbyyY = frameHeight - kirbyySize;

        kirbyy.setY(kirbyyY);

        scoreLabel.setText("Score : " + score);

    }


    public void hitCheck() {

        // Star
        int starCenterX = starX + star.getWidth() / 2;
        int starCenterY = starY + star.getHeight() / 2;


        if (0 <= starCenterX && starCenterX <= kirbyySize &&
                kirbyyY <= starCenterY && starCenterY <= kirbyyY + kirbyySize) {

            score += 10;
            starX = -10;
            sound.playHitSound();

        }

        // Pink
        int pinkCenterX = pinkX + pink.getWidth() / 2;
        int pinkCenterY = pinkY + pink.getHeight() / 2;

        if (0 <= pinkCenterX && pinkCenterX <= kirbyySize &&
                kirbyyY <= pinkCenterY && pinkCenterY <= kirbyyY + kirbyySize) {

            score += 30;
            pinkX = -10;
            sound.playHitPinkSound();

        }

        // Bang
        int bangCenterX = bangX + bang.getWidth() / 2;
        int bangCenterY = bangY + bang.getHeight() / 2;

        if (0 <= bangCenterX && bangCenterX <= kirbyySize &&
                kirbyyY <= bangCenterY && bangCenterY <= kirbyyY + kirbyySize) {

            // Stop Timer
            timer.cancel();
            timer = null;

            sound.playOverSound();

            // Show Result
            Intent intent = new Intent(getApplicationContext(), ReflexResultActivity.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);

            doUnbindService();
            Intent music = new Intent();
            music.setClass(this, MusicServiceReflex.class);
            stopService(music);

        }


    }


    public boolean onTouchEvent(MotionEvent me) {

        if (start_flg == false) {

            start_flg = true;

            FrameLayout frame = findViewById(R.id.frame);
            frameHeight = frame.getHeight();

            kirbyyY = (int) kirbyy.getY();

            kirbyySize = kirbyy.getHeight();


            startLabel.setVisibility(View.GONE);

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            changePos();
                        }
                    });
                }
            }, 0, 20);


        } else {
            if (me.getAction() == MotionEvent.ACTION_DOWN) {
                action_flg = true;

            } else if (me.getAction() == MotionEvent.ACTION_UP) {
                action_flg = false;
            }
        }

        return true;
    }

    @Override
    public void onFragmentInteraction(String string) {

    }
}
