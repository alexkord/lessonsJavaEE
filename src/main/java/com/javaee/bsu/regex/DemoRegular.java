package com.javaee.bsu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegular {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("a+y");
        Matcher m1 = p1.matcher("aaay");
        boolean b = m1.matches();
        System.out.println(b);

        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
        String s = "e-mails:blinov@gmail.com, oleg.cherednichenko@ring.com";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }
    }
}
