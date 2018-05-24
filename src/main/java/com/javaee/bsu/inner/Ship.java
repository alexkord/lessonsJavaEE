package com.javaee.bsu.inner;

public class Ship {
    private Engine eng;

    public class Engine {
        public void launch() {
            System.out.println("Start engine");
        }
    }

    public void init() {
        eng = new Engine();
        eng.launch();
    }
}
