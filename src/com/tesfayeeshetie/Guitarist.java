package com.tesfayeeshetie;

public class Guitarist extends Musician {
    Integer numStrings;


    public Guitarist(String name, String country, String style, String timePeriod, Integer numStrings) {
        super(name, country, style, timePeriod);
        this.numStrings = numStrings;
    }

    @Override
    public String toString() {
        return "Guitarist: {" +
                "numStrings=" + numStrings +
                '}' + '\n' + super.toString() + '\n';
    }
}
