package com.javase.enumeration;

import java.util.Scanner;

public class MelomanRunner {

    public static void run() {
        MusicStyle ms = input();
        switch (ms) {
            case TRANCE:
                System.out.println("Genre is " + ms);
                break;
            case ROCK:
                System.out.println("Genre is " + ms);
                break;
            case CLASSIC:
                System.out.println("Genre is " + ms);
                break;
            case DUBSTEP:
                System.out.println("Genre is " + ms);
        }
    }

    private static MusicStyle input() {
        MusicStyle ms;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a genre of music(trance, rock, dubstep, classic): ");
        String in = sc.next();
        ms = getStyle(in);
        return ms;
    }

    private static MusicStyle getStyle(String style) {
        MusicStyle ms = null;
        switch (style.toUpperCase()) {
            case "TRANCE":
                ms = MusicStyle.TRANCE;
                break;
            case "ROCK":
                ms = MusicStyle.ROCK;
                break;
            case "DUBSTEP":
                ms = MusicStyle.DUBSTEP;
                break;
            case "CLASSIC":
                ms = MusicStyle.CLASSIC;
        }
        return ms;
    }
}
