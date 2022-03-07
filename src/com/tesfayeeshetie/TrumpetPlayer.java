package com.tesfayeeshetie;

public class TrumpetPlayer extends Musician {
    String trumpetType;

    public TrumpetPlayer(String name, String country, String style, String timePeriod, String trumpetType) {
        super(name, country, style, timePeriod);
        this.trumpetType = trumpetType;
    }

    @Override
    public void show(){
        System.out.printf("Musician Name: %s, Country: %s, Style: %s, Time period: %s, Trumpet type %s%n",
                name, country, style, timePeriod, trumpetType);
    }
}
