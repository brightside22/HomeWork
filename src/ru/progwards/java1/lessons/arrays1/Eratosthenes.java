package ru.progwards.java1.lessons.arrays1;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        sieve = new boolean[N + 1];


        for (int i = 2; i <= N; i++) {
            sieve[i] = true;
        }


        sift();
    }

    private void sift() {
        for (int i = 2; i * i <= sieve.length; i++) {

            if (sieve[i]) {


                for (int j = i * i; j <= sieve.length; j += i) {
                    sieve[j] = false;
                }


            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }
}

