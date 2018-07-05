package com.example.android.musicalapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * sources of images: https://unsplash.com/
 */

public class CurrentSong extends AppCompatActivity {
    TextView finalSong;
    TextView finalArtist;
    ImageView finalImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);

    //Gets intent and ListView item data from activities with lists
        Intent intent = getIntent();
        if (intent != null){
            finalSong = findViewById(R.id.current_song);
            finalArtist = findViewById(R.id.current_artist);
            finalImage = findViewById(R.id.song_icon);
            finalSong.setText(intent.getStringExtra("R.string.title_key"));
            finalArtist.setText(intent.getStringExtra("R.string.name_key"));
            finalImage.setImageResource(intent.getIntExtra("R.string.image_key", 0));
    }
}}