package ru.progwards.java1.lessons.classes1;

public class Count {
    int count;

    Count() {
        count = 0;
    }

    public Count(int count) {
        this.count = count;
    }


    public int getCount(){
        return count;
    }

    public void inc() {
        count = (count + 1);
    }

    public boolean dec() {
        count = (count - 1);
        if (count <= 0)
            return true;
        else return false;
    }


    public static void main(String[] args) {
        ru.progwards.java1.lessons.classes1.Count count = new ru.progwards.java1.lessons.classes1.Count(10);

        while (count.dec() != true) {
            count.dec();

            if (count.getCount() == 0) {
                System.out.println("count равен 0");
                break;
            }
        }
    }

}
