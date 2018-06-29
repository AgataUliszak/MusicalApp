package com.example.android.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CentralAsiaMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Flowers","Hanggai"));
        songs.add(new Song ("Tunka", "Namgar"));
        songs.add(new Song ("Mather Mongolia", "Altan urag"));
        songs.add(new Song ("Chyraa-Khoor", "Huun Huur Tu"));
        songs.add(new Song ("Kaa-Khem", "Yat-Kha"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
