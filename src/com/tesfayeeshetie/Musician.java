package com.tesfayeeshetie;

public class Musician {
    String name;
    String country;
    String style;
    String timePeriod;

    public Musician(String name, String country, String style, String timePeriod) {
        this.name = name;
        this.country = country;
        this.style = style;
        this.timePeriod = timePeriod;
    }

    public void show() {
        System.out.printf("Musician Name: %s, Country: %s, Style: %s, Time period: %s%n",
                name, country, style, timePeriod);
    }
}
