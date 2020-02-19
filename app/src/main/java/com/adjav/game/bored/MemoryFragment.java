package com.adjav.game.bored;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MemoryFragment extends Fragment {

    private Button level1;
    private Button level2;
    private Button level3;
    private Button level4;
    private Button level5;
    private Button level6;
    private Button level7;
    private Button level8;
    private OnFragmentInteractionListener mListener;



    public MemoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_memory, container, false);

        level1 = view.findViewById(R.id.lvl1start);
        level2 = view.findViewById(R.id.lvl2start);
        level3 = view.findViewById(R.id.lvl3start);
        level4 = view.findViewById(R.id.lvl4start);
        level5 = view.findViewById(R.id.lvl5start);
        level6 = view.findViewById(R.id.lvl6start);
        level7 = view.findViewById(R.id.lvl7start);
        level8 = view.findViewById(R.id.lvl8start);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel1Activity.class));
            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel2Activity.class));
            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel3Activity.class));
            }
        });

        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel4Activity.class));
            }
        });

        level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel5Activity.class));
            }
        });

        level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel6Activity.class));
            }
        });

        level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel7Activity.class));
            }
        });

        level8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MemoryLevel8Activity.class));
            }
        });

        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String string);
    }

    public void onBackPressed(){
        getActivity().getSupportFragmentManager().popBackStack();
    }

}
