package com.tesfayeeshetie;

public class TrumpetPlayer extends Musician {
    String trumpetType;

    public TrumpetPlayer(String name, String country, String style, String timePeriod, String trumpetType) {
        super(name, country, style, timePeriod);
        this.trumpetType = trumpetType;
    }

    @Override
    public String toString() {
        return "TrumpetPlayer: {" +
                "trumpetType='" + trumpetType + '\'' +
                '}'+ '\n' + super.toString() + '\n';
    }
}
