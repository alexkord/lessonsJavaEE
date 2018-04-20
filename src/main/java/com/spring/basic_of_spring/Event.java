package com.spring.basic_of_spring;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    private int id = (int) (Math.random() * 10) + 1;
    private String msg;
    private Date date;

    public Event(Date date) {
        this.date = date;
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
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
        return "id = " + id + " message = " + msg + " date is " + date;
    }
}
