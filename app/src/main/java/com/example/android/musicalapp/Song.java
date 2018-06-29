package com.example.android.musicalapp;

/**
 * Created by euenia on 2018-06-20.
 */

public class Song {
    /** Name of the artist*/
    private String mArtistName;

    /** Song title*/
    private String mSongName;

    /**
     * Create a new Song object.
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Get the title of the song
     */
    public String getSongName() {
        return mSongName;
    }
    /**
     * Get the name of the artist
     */
    public String getArtistName() {
        return mArtistName;
    }


}
