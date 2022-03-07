package com.tesfayeeshetie;

import java.io.PrintWriter;
import java.util.ArrayList;

public class MusicApp {
    static java.util.Scanner sc;
    static java.io.File myFile;

    public static void main(String[] argv) {

        Musician miles = new TrumpetPlayer("Miles Davis", "USA", "jazz",
                "1950s", "brass");
        Musician curtis = new Vocalist("Curtis Mayfield", "USA", "soul",
                "1970s", "Muddy Waters");
        Musician gary = new Guitarist("Gary Clark Jr", "USA", "blues",
                "2010s", 6);
        Musician ray = new Vocalist("Ray Charles", "USA", "soul",
                "1996", "Nat King Cole");
        Musician Louis = new Vocalist("Louis Armstrong", "USA", "jazz",
                "1967", "Joe King Oliver");

        // Create our library
        ArrayList<Song> library = new ArrayList<>();


        Song music_1 = new Song("People Get Ready", curtis, "Relaxing",
                "https://www.youtube.com/watch?v=VOXmaSCt4ZE");
        Song music_2 = new Song("So What", miles, "Dinner Music",
                "https://www.youtube.com/watch?v=zqNTltOGh5c");
        Song music_3 = new Song("Bright Lights", gary, "Jogging tunes",
                "https://www.youtube.com/watch?v=x_ZeDn-hHGE");
        Song music_4 = new Song("What a wonderful world", Louis, "Live",
                "https://www.youtube.com/watch?v=CWzrABouyeE");
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
        //Enhance the music library by adding a method to write the musicians in your song's library to disk
        try {
            PrintWriter pw = new PrintWriter("mySongs.txt");
            pw.println("List of Musicians Name from my Song's Library");
            for (Song music: library) {
                    pw.println(music.musician.name);
            }
            pw.close();
        }  catch (Exception e) {
            System.out.printf("Could not write the mySongs info, because:%s", e);
        }

        //        Read mySongs file and display the list of musician here
        try {
            myFile = new java.io.File("mySongs.txt");
            sc = new java.util.Scanner(myFile);

            while ( sc.hasNextLine() ) {
                System.out.println(sc.nextLine());
            }

        } catch (Exception e) {
            System.out.printf("Could not read the mySongs info, because:%s", e);
        }

    }
}
