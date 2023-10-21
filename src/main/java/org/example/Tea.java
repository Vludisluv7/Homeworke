package org.example;

public class Tea extends HotDrinks {
    public static String volume;
    public static int temperature;
    public Tea(String name, String volume,int temperature) {
        super(name);
        this.temperature = temperature;
        this.volume = volume;
    }

}
