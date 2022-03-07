package com.tesfayeeshetie;

public class Guitarist extends Musician {
    Integer numStrings;


    public Guitarist(String name, String country, String style, String timePeriod, Integer numStrings) {
        super(name, country, style, timePeriod);
        this.numStrings = numStrings;
    }

    public void show(){
        System.out.printf("Name: %s, Country: %s, Style: %s, Time period: %s, Number of strings: %s%n",
                name, country, style, timePeriod, numStrings);
    }
}
