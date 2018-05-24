package com.javaee.bsu.inner.run;

import com.javaee.bsu.inner.Abonent;

public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Alex Axenrt");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(380, 67);
        System.out.println(abonent);
    }
}
