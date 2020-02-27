package com.adjav.game.bored;


import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.concurrent.BlockingQueue;


public class HomeFragment extends Fragment {

    private Button exit;
    private Button play;
    private Button about;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        play = (Button) view.findViewById(R.id.play);
        exit = (Button) view.findViewById(R.id.exit);
        about = (Button) view.findViewById(R.id.about);

        final HomeFragment homeFragment = this;

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
//                getActivity().getFragmentManager().beginTransaction().remove(this, new HomeFragment(), null).commit();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new GameFragment(), null).addToBackStack(null).commit();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),About.class));
            }
        });

        return view;
    }
}

