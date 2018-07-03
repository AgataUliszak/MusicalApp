package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CentralAsiaMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Flowers","Hanggai", R.drawable.mongolian));
        songs.add(new Song ("Tunka", "Namgar", R.drawable.mongolian));
        songs.add(new Song ("Mather Mongolia", "Altan urag", R.drawable.mongolian));
        songs.add(new Song ("Chyraa-Khoor", "Huun Huur Tu", R.drawable.mongolian));
        songs.add(new Song ("Kaa-Khem", "Yat-Kha", R.drawable.mongolian));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // When listView is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int p, long id){
                Song song = (Song) listView.getItemAtPosition(p);
                Intent currentSong = new Intent(CentralAsiaMusic.this, CurrentSong.class);
                currentSong.putExtra ("message_key1", song.getSongName());
                currentSong.putExtra("massage_key2", song.getArtistName());
                currentSong.putExtra("massage_key3", song.getSongIcon());
                startActivity(currentSong);
            }}
        );
    }
}
