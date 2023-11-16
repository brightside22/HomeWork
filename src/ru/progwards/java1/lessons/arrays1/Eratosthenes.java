package ru.progwards.java1.lessons.arrays1;

public class Eratosthenes {

    private static boolean[] sieve;

    public Eratosthenes(int N){

        sift();
    }

    private static void sift() {
        for(int i = 1; i< sieve.length; i++) {
            System.out.println(sieve[i]);
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        boolean sieve[] = new boolean[5];
    }
}
