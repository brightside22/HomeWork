package ru.progwards.java1.lessons.inheritance;

public class Time {
    static int hours;
    static int minutes;
    static int seconds;

    public Time(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public String toString() {
        String str = null;
        if (hours < 10 && minutes < 10 && seconds < 10) {
            str = "0" + hours + ":" + "0" + minutes + ":" + "0" + seconds; }

        else if (hours < 10 && minutes < 10) {
            str = "0" + hours + ":" + "0" + minutes + ":" + seconds; }

        else if (hours < 10 && seconds < 10) {
            str = "0" + hours + ":" + minutes + ":" + "0" + seconds; }

        else if (minutes < 10 && seconds < 10) {
            str = hours + ":" + "0" + minutes + ":" + "0" + seconds; }

        else if (hours < 10) {
            str = "0" + hours + ":" + minutes + ":" + seconds; }

        else if (minutes < 10) {
            str = hours + ":" + "0" + minutes + ":" + seconds; }

        else if (seconds < 10) {
            str = hours + ":" + minutes + ":" + "0" + seconds; }

        else if (hours >= 10 && minutes >= 10 && seconds >= 10) {
            str = hours + ":" + minutes + ":" + + seconds; }

        return str;
    }


    public int toSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public int secondsBetween(Time time) {
        int sec = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int sec1 = this.hours * 3600 + this.minutes * 60 + this.seconds;

        if (sec >= sec1) {
            return sec - sec1;}

        else {return sec1 - sec;}
    }
}

