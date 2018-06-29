package com.example.android.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class UkrainianMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Letila zozula","Drevo"));
        songs.add(new Song ("Zoria ty zoriuszka", "Werhovyna"));
        songs.add(new Song ("Dywnaja hodyna", "Drevo"));
        songs.add(new Song ("Oj tam za moriami", "Drevo"));
        songs.add(new Song ("Pyjemo, pyjemo", "Mariana Sadovska"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
