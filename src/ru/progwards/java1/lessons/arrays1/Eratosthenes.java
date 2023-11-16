package ru.progwards.java1.lessons.arrays1;

public class Eratosthenes {

    private static boolean[] sieve;

    public Eratosthenes(int N) {
        sieve = new boolean[N];
        for (int i = 2; i <= N; i++) {
            sieve[i] = true;
        }
        sift();
    }
    private static void sift() {
        for(int i = 2; i < sieve.length-1; i++) {
            if(sieve[i]==true) {
                for(int j = i * i; j < sieve.length; j += i) {
                    sieve[j] = false;
                }
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }
}
