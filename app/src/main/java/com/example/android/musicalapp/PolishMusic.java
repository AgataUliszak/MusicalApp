package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PolishMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create a list of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Serce","Janusz Prusinowski Trio", R.drawable.polish));
        songs.add(new Song ("Owijak zapustny", "Lautari", R.drawable.polish));
        songs.add(new Song ("Mazurek niepojety", "Kapela Maliszow", R.drawable.polish));
        songs.add(new Song ("Wiwat", "Kapela Brodow", R.drawable.polish));
        songs.add(new Song ("W stodole sowa siada", "Balbina Darlak", R.drawable.polish));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

// When listView is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int p, long id){
                Song song = (Song) listView.getItemAtPosition(p);
                Intent currentSong = new Intent(PolishMusic.this, CurrentSong.class);
                currentSong.putExtra ("R.string.title_key", song.getSongName());
                currentSong.putExtra("R.string.name_key", song.getArtistName());
                currentSong.putExtra("R.string.image_key", song.getSongIcon());
                startActivity(currentSong);
            }}
        );
    }
}
