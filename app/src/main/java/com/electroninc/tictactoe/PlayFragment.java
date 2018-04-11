package com.electroninc.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayFragment extends Fragment {

    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_play, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        LinearLayout menu1 = getView().findViewById(R.id.menu1);
        LinearLayout menu2 = getView().findViewById(R.id.menu2);
        LinearLayout menu3 = getView().findViewById(R.id.menu3);
        LinearLayout menu4 = getView().findViewById(R.id.menu4);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SetupActivity.class);
                intent.putExtra(SetupActivity.GAMETYPE, SetupActivity.GAMETYPE1);
                startActivity(intent);
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SetupActivity.class);
                intent.putExtra(SetupActivity.GAMETYPE, SetupActivity.GAMETYPE2);
                startActivity(intent);
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SetupActivity.class);
                intent.putExtra(SetupActivity.GAMETYPE, SetupActivity.GAMETYPE3);
                startActivity(intent);
            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SetupActivity.class);
                intent.putExtra(SetupActivity.GAMETYPE, SetupActivity.GAMETYPE4);
                startActivity(intent);
            }
        });

    }
}
