package com.example.android.musicalapp;

public class Song {
    /**
     * Name of the artist
     */
    private String mArtistName;

    /**
     * Song title
     */
    private String mSongName;

    /**
     * Song cover
     */
    private int mSongIcon;

    /**
     * Create a new Song object.
     */
    public Song(String songName, String artistName, int songIcon) {
        mSongName = songName;
        mArtistName = artistName;
        mSongIcon = songIcon;
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

    /**
     * Get the name of the artist
     */
    public int getSongIcon() {
        return mSongIcon;
    }
}
