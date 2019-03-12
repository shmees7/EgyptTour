package com.example.android.musically;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Songs> songslists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songslists = new ArrayList<>();
        prepareMovieData();
        RecyclerView recyclerView = findViewById(R.id.recycler);
        SongViewAdapter adapter = new SongViewAdapter(songslists, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void prepareMovieData() {

        Songs song = new Songs("Emenim", "Not Afraid", "2010", R.drawable.songemeinim);
        songslists.add(song);

        song = new Songs("Justin Bieber", "Love Your Self", "2015", R.drawable.songer11);
        songslists.add(song);

        song = new Songs("Shakera", "Dare (LA LA LA)", "2014", R.drawable.songshakera);
        songslists.add(song);

        song = new Songs("Maher Zain", "Medina", "2016", R.drawable.songmaher);
        songslists.add(song);

    }
}
