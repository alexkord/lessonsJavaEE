package com.javase.abstract_class;

public class SingleChoiceQuest extends AbstractQuest {
    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
        return true;
    }
}
