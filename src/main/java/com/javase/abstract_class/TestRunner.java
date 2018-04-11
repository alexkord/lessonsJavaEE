package com.javase.abstract_class;

public class TestRunner {
    public static void run() {
        TestAction bt = new TestAction();
        AbstractQuest[] test = bt.generateTest(60, 2);
        bt.checkTest(test);
    }
}
