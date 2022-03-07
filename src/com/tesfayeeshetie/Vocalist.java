package com.tesfayeeshetie;

public class Vocalist extends Musician {
    String influencedBy;

    public Vocalist(String name, String country, String style, String timePeriod, String influencedBy) {
        super(name, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }

    @Override
    public void show(){
        System.out.printf("Musician Name: %s, Country: %s, Style: %s, Time period: %s, Influenced by: %s%n",
                name, country, style, timePeriod, influencedBy);
    }

}
