package com.javase.task4;

public class Text {
    private Word word;
    private Sentence sentence;

    public Text(Word word, Sentence sentence) {
        this.word = word;
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "word : " + word + " sentence" + sentence;
    }
}
