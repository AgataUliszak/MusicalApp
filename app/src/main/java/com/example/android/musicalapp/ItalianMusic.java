package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ItalianMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Tarantella napoletana","Athanasius Kricher", R.drawable.italian));
        songs.add(new Song ("Alla carpinese", "Giuseppe De Vittorio", R.drawable.italian));
        songs.add(new Song ("Matteo Salvatore", "Lamento dei mendicanti", R.drawable.italian));
        songs.add(new Song ("Silenzio d'amuri", "Alfio Antic", R.drawable.italian));
        songs.add(new Song ("Ah, vita bella !", "Lucilla Galeazzi", R.drawable.italian));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // When listView is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int p, long id){
                Song song = (Song) listView.getItemAtPosition(p);
                Intent currentSong = new Intent(ItalianMusic.this, CurrentSong.class);
                currentSong.putExtra ("R.string.title_key", song.getSongName());
                currentSong.putExtra("R.string.name_key", song.getArtistName());
                currentSong.putExtra("R.string.image_key", song.getSongIcon());
                startActivity(currentSong);
            }}
        );
    }
}
