package com.green.java.ch06;

public class Time {
    private int hour;
    private int minute;
    private int second;
    //멤버 필드는 은닉화.

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >=1 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
