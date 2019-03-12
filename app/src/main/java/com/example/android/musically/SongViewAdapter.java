package com.example.android.musically;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moham on 22-Jun-18.
 */

public class SongViewAdapter extends RecyclerView.Adapter<SongViewHolder> {


    private ArrayList<Songs> songsList;
    public ArrayList<Songs> imagesong;
    public ArrayList<Songs> imagename;
    private Context context;


    public SongViewAdapter(ArrayList<Songs> songsList, Context context) {
        this.songsList = songsList;
        this.context = context;

    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.songs_list, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, final int position) {
        final Songs songs = songsList.get(position);
        holder.container.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(context, songs.getNameSong(), Toast.LENGTH_SHORT).show();
                if (position == 0) {

                    Intent intent = new Intent(context, eminem_notafraid.class);
                    context.startActivity(intent);
                } else if (position == 1) {

                    Intent intent = new Intent(context, justen_loveyourself.class);
                    context.startActivity(intent);

                } else if (position == 2) {

                    Intent intent = new Intent(context, shakera_lalala.class);
                    context.startActivity(intent);
                } else if (position == 3) {

                    Intent intent = new Intent(context, maherzain_medina.class);
                    context.startActivity(intent);
                }
            }
        });
        holder.nameSong.setText(songs.getNameSong());
        holder.nameSonger.setText(songs.getNameSonger());
        holder.yearofSong.setText(songs.getYearOfSong());
        holder.imageView.setImageResource(songs.getImage());
    }
}
