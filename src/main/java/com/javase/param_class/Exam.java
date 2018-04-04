package com.javase.param_class;

public class Exam <T extends Number> {
    private String name;
    private T mark;

    public Exam(String name, T mark) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    private int roundMark() {
        return Math.round(mark.floatValue());
    }

    public boolean equalsToMark(Exam<?> ob) {
        return roundMark() == ob.roundMark();
    }
}
