package com.javaee.servlets;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        URLConnection urlConnection = new URL("http://localhost:8080/temp").openConnection();
                        urlConnection.getInputStream();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
