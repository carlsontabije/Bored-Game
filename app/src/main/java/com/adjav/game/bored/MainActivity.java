package com.adjav.game.bored;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ReflexFragment.OnFragmentInteractionListener, MemoryFragment.OnFragmentInteractionListener, FragmentManager.OnBackStackChangedListener {

    private long backPressedTime;
    private Toast backToast;

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();



        if (findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState !=null) {
               return;
            }

           FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            HomeFragment homeFragment = new HomeFragment();
            fragmentTransaction.add(R.id.fragment_container, homeFragment, null);
            fragmentTransaction.commit();
        }

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



    @Override
    public void onBackPressed() {
            tellFragments();
            super.onBackPressed();
    }

    private void tellFragments(){
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for(Fragment f : fragments){
            if(f != null && f instanceof BaseFragment)
                ((BaseFragment)f).onBackPressed();
        }
    }
    @Override
    public void onFragmentInteraction(String string) {

    }

    @Override
    public void onBackStackChanged() {

    }


//    public boolean onKeyDown(int keycode, KeyEvent event) {
//        if (keycode == KeyEvent.KEYCODE_BACK) {
//            moveTaskToBack(true);
//        }
//        return super.onKeyDown(keycode, event);
//    }
}


//
//        if (backPressedTime + 2000 > System.currentTimeMillis()) {
//                backToast.cancel();
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.addCategory(Intent.CATEGORY_HOME);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//                finish();
//                System.exit(0);
//                } else {
//                backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
//                backToast.show();
//                }
//
//                backPressedTime = System.currentTimeMillis();
//                }
