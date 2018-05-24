package com.javaee.bsu.nested;

public class Ship {
    private int id;

    public static class LifeBoat {
        private int boatId;

        public static void down() {
            System.out.println("Down boat on the water");
        }

        public void swim() {
            System.out.println("Boat is swimming");
        }
    }
}
