package com.example.android.musicalapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by ezuliag on 2018-06-22.
 */

public class CurrentSong extends AppCompatActivity {
    TextView finalSong;
    TextView finalArtist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);

    //Gets intent and ListView item data from activities with lists
        Intent intent = getIntent();
        if (null !=intent){
            finalSong = findViewById(R.id.current_song);
            finalArtist = findViewById(R.id.current_artist);
            finalSong.setText(intent.getStringExtra("message_key1"));
            finalArtist.setText(intent.getStringExtra("message_key2"));
    }
}}
