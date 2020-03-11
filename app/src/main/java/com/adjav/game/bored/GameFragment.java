package com.adjav.game.bored;


import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class GameFragment extends Fragment {

    private Button memory;
    private Button reflex;
    private Button accuracy;
    private Button multiAccuracy;



    public GameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        memory = view.findViewById(R.id.memory_play);
        reflex = view.findViewById(R.id.reflex_play);
        accuracy = view.findViewById(R.id.accuracy_play);
        multiAccuracy = view.findViewById(R.id.multi_accuracy);

        memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new MemoryFragment(), null).addToBackStack(null).commit();

            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReflexFragment(), null).commit();

            }
        });

        accuracy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AccuracyGameActivity.class));
            }
        });

        multiAccuracy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),AccuracyMultiplayer.class));
            }
        });

        return view;
    }
}

