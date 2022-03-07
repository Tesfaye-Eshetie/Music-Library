package com.tesfayeeshetie;

public class Song {
    String title;
    Musician musician;
    String playlist;
    String youtubeURL;

    public Song(String title, Musician musician, String playlist, String youtubeURL) {
        this.title = title;
        this.musician = musician;
        this.playlist = playlist;
        this.youtubeURL = youtubeURL;
    }
    public void show(){
        System.out.printf("Title: %s%nMusician info: %s%nPlay list: %s%nYoutube URL: %s%n%n",
                title, musician, playlist, youtubeURL);
    }
}
