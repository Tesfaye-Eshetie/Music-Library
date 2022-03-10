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

    @Override
    public String toString() {
        return "Song: " +
                "title='" + title + '\'' +
                ", playlist='" + playlist + '\'' +
                ", \nyoutubeURL='" + youtubeURL + '\'' +
                '\n' + musician.toString();
    }
}

