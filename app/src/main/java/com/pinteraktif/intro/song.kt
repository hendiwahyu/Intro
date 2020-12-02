package com.pinteraktif.intro

import android.util.Log


private const val TAG = "SONG"

// Song attributes
val songName: String = "Black or White"
val albumName: String = "Dangerous"
val artistName: String = " Michael Jackson "
val trackNumber:Int = 1
val composerName: String = " Michael Jackson and Bill Bottrell"
val durationInMillis: Int = 256
val genre: String = "Pop Rock"
val isTopBillboardSong: Boolean = true
val chordPlayed = 'E'


fun songAttributes(){
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
