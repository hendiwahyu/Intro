package com.pinteraktif.intro

import android.util.Log


private const val TAG = "SONG"

// Song attributes


fun songAttributes(){
    val songName = "Black or White"
    val albumName = "Dangerous"
    val artistName = " Michael Jackson "
    val trackNumber = 1
    val composerName = " Michael Jackson and Bill Bottrell"
    val durationInMillis = 256
    val genre = "Pop Rock"
    val isTopBillboardSong = true
    val chordPlayed = 'E'

    Log.d(TAG, "Song Name: $songName")
    Log.d(TAG, "Album Name: $albumName")
    Log.d(TAG, "Artist Name: $artistName")
    Log.d(TAG, "track number: $trackNumber")
    Log.d(TAG, "Composer Name: $composerName")
    Log.d(TAG, "Duration: $durationInMillis millisecond")
    Log.d(TAG, "Genre: $genre")
    Log.d(TAG, "Hit in the 90's : $isTopBillboardSong")
    Log.d(TAG, "Chord Played : $chordPlayed")

}

