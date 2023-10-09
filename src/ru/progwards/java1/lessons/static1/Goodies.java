package ru.progwards.java1.lessons.static1;

public class Goodies {
    static String goodies;
    static String child;

    //2.2
    public static void printPresent() {
        System.out.println(child + " дали " + goodies);
    }


    //2.3
    public static void masha() {
        child = "Маше";
    }


    //2.4
    public static void cookie() {
        goodies = "печеньку";
    }


    //2.4'
    public static void setChild(String child) {
        Goodies.child = child;
    }


    //2.5
    public static void setGoodies(String goodies) {
        Goodies.goodies = goodies;
    }


    //2.6
    public static void printPresents() {
        masha();
        printPresent();
        setGoodies("леденец");
        printPresent();
        cookie();
        printPresent();
        setChild("Пете");
        printPresent();
    }
}

