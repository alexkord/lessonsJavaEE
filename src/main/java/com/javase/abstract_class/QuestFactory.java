package com.javase.abstract_class;

public class QuestFactory {
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch(mode) {
            case 1:
                return new DragnDropQuest();
            case 2:
                return new SingleChoiceQuest();
            default:
                throw new IllegalArgumentException();
        }
    }
}
