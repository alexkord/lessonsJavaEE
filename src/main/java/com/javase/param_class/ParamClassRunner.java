package com.javase.param_class;

public class ParamClassRunner {
    public static void run() {
        SimpleActionCourse simpleActionCourse = new SimpleActionCourse(new Course(1));
        new SimpleActionCourse(new PythonCourse(2));

        Message message = new Message();
        message.setValue("Hello");
        System.out.println(message.getValue());
        message.setValue(12);

        Exam<Double> ex1 = new Exam<>("Progr", 15.0);
        Exam<Integer> ex2 = new Exam<>("Math", 15);
        boolean t = ex1.equalsToMark(ex2);
        System.out.println(t);
    }
}
