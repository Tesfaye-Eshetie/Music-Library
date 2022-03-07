package com.tesfayeeshetie;

import java.util.ArrayList;

public class MusicApp {

    public static void main(String[] argv) {

        Musician miles = new TrumpetPlayer("Miles Davis", "USA", "jazz",
                "1950s", "brass");
        Musician curtis = new Vocalist("Curtis Mayfield", "USA", "soul",
                "1970s", "Muddy Waters");
        Musician gary = new Guitarist("Gary Clark Jr", "USA", "blues",
                "2010s", 6);
        Musician ray = new Vocalist("Ray Charles", "USA", "soul",
                "1996", "Nat King Cole");

        // Create our library
        ArrayList<Song> library = new ArrayList<>();


        Song music_1 = new Song("People Get Ready", curtis, "Relaxing",
                "https://www.youtube.com/watch?v=VOXmaSCt4ZE");
        Song music_2 = new Song("So What", miles, "Dinner Music",
                "https://www.youtube.com/watch?v=zqNTltOGh5c");
        Song music_3 = new Song("Bright Lights", gary, "Jogging tunes",
                "https://www.youtube.com/watch?v=x_ZeDn-hHGE");
        Song music_4 = new Song("When My Train Pulls In", gary, "Jogging tunes",
                "https://www.youtube.com/watch?v=gYXMDCNjl8M");
        Song music_5 = new Song("Hit the Road Jack on Saturday", ray, "Live",
                "https://www.youtube.com/watch?v=CyVuYAHiZb8");

    //Add a song to the library
        library.add(music_1);
        library.add(music_2);
        library.add(music_3);
        library.add(music_4);
        library.add(music_5);

    // Using a loop, display all your Songs
        for (Song music:library) {
            music.show();
        }
    }
}
