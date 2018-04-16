package com.javase.override_equals_hash_toString;

public class CloneRunner {
    public static void mutation(Student p) {
        try {
            p = (Student)p.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        p.setId(1000);
        System.out.println("->id = " + p.getId());
    }

    public static void run() {
        Student ob = new Student();
        System.out.println("id = " + ob.getId());
        mutation(ob);
        System.out.println("id = " + ob.getId());
    }
}
