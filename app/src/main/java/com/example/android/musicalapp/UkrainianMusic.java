package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class UkrainianMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Letila zozula","Drevo", R.drawable.ukrainian));
        songs.add(new Song ("Zoria ty zoriuszka", "Werhovyna", R.drawable.ukrainian));
        songs.add(new Song ("Dywnaja hodyna", "Drevo", R.drawable.ukrainian));
        songs.add(new Song ("Oj tam za moriami", "Drevo", R.drawable.ukrainian));
        songs.add(new Song ("Pyjemo, pyjemo", "Mariana Sadovska", R.drawable.ukrainian));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // When listView is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int p, long id){
                Song song = (Song) listView.getItemAtPosition(p);
                Intent currentSong = new Intent(UkrainianMusic.this, CurrentSong.class);
                currentSong.putExtra ("message_key1", song.getSongName());
                currentSong.putExtra("massage_key2", song.getArtistName());
                startActivity(currentSong);
            }}
        );
    }
}
