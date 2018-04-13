package com.javase.task4;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> sentence;

    public Sentence() {
        sentence = new ArrayList<>();
    }

    public void setWords(Word word) {
        sentence.add(word);
    }

    @Override
    public String toString() {
        return sentence.toString();
    }
}
