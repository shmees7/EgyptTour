package com.example.android.musically;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by moham on 22-Jun-18.
 */

public class SongViewHolder extends RecyclerView.ViewHolder {

    TextView nameSonger, nameSong, yearofSong ;
    ImageView imageView;
    ConstraintLayout container;

    public SongViewHolder(View itemView) {
        super(itemView);

        container = itemView.findViewById(R.id.container);
        nameSonger = itemView.findViewById(R.id.nameSonger);
        nameSong = itemView.findViewById(R.id.nameSong);
        yearofSong = itemView.findViewById(R.id.yearOfSong);
        imageView = itemView.findViewById(R.id.imageView);

    }
}
