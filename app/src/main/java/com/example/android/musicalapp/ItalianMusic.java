package com.example.android.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ItalianMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Tarantella napoletana","Athanasius Kricher"));
        songs.add(new Song ("Alla carpinese", "Giuseppe De Vittorio"));
        songs.add(new Song ("Matteo Salvatore", "Lamento dei mendicanti"));
        songs.add(new Song ("Silenzio d'amuri", "Alfio Antic"));
        songs.add(new Song ("Ah, vita bella !", "Lucilla Galeazzi"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
