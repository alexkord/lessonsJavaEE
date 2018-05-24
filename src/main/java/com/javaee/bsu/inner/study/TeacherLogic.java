package com.javaee.bsu.inner.study;

public class TeacherLogic {
    public void excludeProcess(int rectorId, String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);

        System.out.println("Student: " + nameStudent + " excluded: "
                + teacher.excludeStudent(nameStudent));
    }
}
