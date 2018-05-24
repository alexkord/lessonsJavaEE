package com.javaee.bsu.inner.study;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {
        class Rector extends AbstractTeacher {

            public Rector(int id) {
                super(id);
            }

            @Override
            public boolean excludeStudent(String name) {
                if (name != null) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (isRectorId(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    public static boolean isRectorId(int id) {
        return id == 6;
    }
}
