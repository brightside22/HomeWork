package ru.progwards.java1.lessons.interfaces2;


public class CompareHome {
    public static boolean sameHome(Home h1, Home h2) {
        if (h1.equals(h2))
        {
            System.out.println("Результат сравнения " + h1.getClass().getSimpleName() + " и " + h2.getClass().getSimpleName() + " равен " + true);
            return true;
        } else

        {
         System.out.println("Результат сравнения " + h1.getClass().getSimpleName() + " и " + h2.getClass().getSimpleName() + " равен " + false);
            return false;
        }
    }

    public static void main(String[] args) {
        Cow cow = new Cow("aaa");
        Duck duck = new Duck("aaa");
        Animal hamster = new Cow("aaa");
        Hawk hawk = new Hawk();


        sameHome(cow, duck);
        sameHome(cow, hamster);
        sameHome(duck, hamster);
        sameHome(duck, hawk);
        sameHome(hamster, hawk);

    }
}
