package com.javase.param_class;

public class SimpleActionCourse <T1> extends Course {

    public <T1 extends Course> SimpleActionCourse(T1 course) {}

    public <T2> SimpleActionCourse() {}

    public <T3 extends Course> float calcMark () {
        return 0.1f;
    }

}
