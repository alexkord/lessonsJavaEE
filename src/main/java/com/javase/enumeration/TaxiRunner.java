package com.javase.enumeration;

public class TaxiRunner {
    public static void run() {
        TaxiStation ts = TaxiStation.valueOf(TaxiStation.class, "Mercedes".toUpperCase());
        System.out.println(ts + " : ordinal - > " + ts.ordinal());
        ts.setFreeCabs(3);
        TaxiStation[] taxiStations = TaxiStation.values();
        for (TaxiStation t : taxiStations) {
            System.out.println(t);
        }
    }
}
