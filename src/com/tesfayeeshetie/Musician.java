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

    @Override
    public String toString() {
        return "Musician: {" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", style='" + style + '\'' +
                ", timePeriod='" + timePeriod + '\'' +
                '}';
    }
}
