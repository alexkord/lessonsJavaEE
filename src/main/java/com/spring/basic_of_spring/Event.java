package com.spring.basic_of_spring;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(String...words) {
        for (String s : words) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public Event(Date date) {
        this.date = date;
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.dateFormat = df;
    }

    public int getId() {
        return id = (int) (Math.random() * 10_000_000) + 1_000_000;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "id = " + id + " message = " + msg + " date is " + dateFormat.format(date);
    }
}
