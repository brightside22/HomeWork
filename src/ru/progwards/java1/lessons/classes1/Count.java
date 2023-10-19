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
        Count count = new Count(10);

        while (count.dec() == true) {
            System.out.println("count равен 0");
            break;
        }
    }

}
