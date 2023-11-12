package ru.progwards.java1.lessons.inheritance;

  class Time {
     static int hours;
     static int minutes;
      static int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


      public int secondsBetween(Time time) {
        int sec = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int sec1 = this.hours * 3600 + this.minutes * 60 + this.seconds;

        if (sec >= sec1) {
            return sec - sec1;}

        else {return sec1 - sec;}
    }

}