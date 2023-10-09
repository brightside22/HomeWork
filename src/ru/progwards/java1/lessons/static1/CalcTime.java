package ru.progwards.java1.lessons.static1;

public class CalcTime {


    //1.1
    static double distance;
    static double speed;
    static String cityFrom;
    static String cityTo;


    //1.2
    public static void printTime() {
        double time = speed*distance;
        System.out.println("Если ехать из " + cityFrom + " в " + cityTo + " со скоростью " +
                speed + " км/ч, то " + distance + " км проедем за " + time + " часов.");
    }


    //1.3
    public static void MoscowToPiter() {
        distance = 712;
        speed = 80;
        cityFrom= "Москва";
        cityTo = "Питер";
    }


    //1.3
    public static void LissabonToVladivostok() {
        distance = 13090;
        speed = 75;
        cityFrom= "Лиссабон";
        cityTo = "Владивосток";
    }


    //1.4
    public static void MurmanskToAlmata() {
        distance = 5413;
        speed = 60;
        cityFrom= "Мурманск";
        cityTo = "Алмата";
    }



    //1.5
    public static void printTimes() {
        MoscowToPiter();
        printTime();
        LissabonToVladivostok();
        printTime();
        MurmanskToAlmata();
        printTime();
    }
}


