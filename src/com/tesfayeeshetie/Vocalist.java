package com.tesfayeeshetie;

public class Vocalist extends Musician {
    String influencedBy;

    public Vocalist(String name, String country, String style, String timePeriod, String influencedBy) {
        super(name, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }

    @Override
    public String toString() {
        return "Vocalist: {" +
                "influencedBy='" + influencedBy + '\'' +
                '}' + '\n' + super.toString() + '\n';
    }
}
