package com.javase.task4;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> sentence;

    public Sentence() {
        sentence = new ArrayList<>();
    }

    @Override
    public String toString() {
        return sentence.toString();
    }
}
