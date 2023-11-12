package ru.progwards.java1.lessons.classescompare;

public class TestAnimal {
    public static void printAnimal(Animal animal) {
        System.out.println(animal.toString() + " - " + animal.say() + "!");
    }

    public static void main(String[] args) {
        //System.out.println("Тест для Animal, Cow, Hamster, Duck");
       // Cow cow = new Cow("глаша");
        //printAnimal(cow);

        String n1 = "2+32";
        String n2 = "1+33";
        String n3 = "2+53";
        String n4 = "5+55";
        String n5 = "2+49";
        String n6 = "56+39";
        String n7 = "32+33";
        String n8 = "21+32";
        String n9 = "25+39";
        String n10 = "22+30";
        String n11 = "22+38";
        String n12 = "25+36";
        String n13 = "29+32";
        String n14 = "20+33";
        String n15 = "29+34";




        String[] massive = new String[] {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15};

        for (int i = 0; i < massive.length; i++) {
         /*   int xx = 0;
            int max = 15;
            int min = 1;
            double x = c;
            int x1 = (int) (x /1);
            System.out.println(massive[i]+ " " + x1);
            */

            int max1 = 10;
            int min1 = 1;
            int num = (int) (((Math.random() * ((max1 - min1) + 1)) + min1)/1);
            int num2 = (int) (((Math.random() * ((max1 - min1) + 1)) + min1)/1);
            System.out.println(num + " * " + num2);



        }

    }

}


