package org.example;

public class Coffe extends HotDrinks {
    public static String volume;
    public static int temperature;
    public Coffe(String name, String volume,int temperature) {
        super(name);
        this.temperature = temperature;
        this.volume = volume;
    }
}

