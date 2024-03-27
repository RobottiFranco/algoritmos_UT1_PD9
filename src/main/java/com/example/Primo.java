package com.example;

public class Primo {
    public static void main(String[] args) {
        System.out.println("la suma da: " + suma(11));
    }

    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if ((n % 2 != 0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int suma(long n) {
        int suma = 0;
        if (isPrime(n)) {
            int i = 2;
            while (i <= n) {
                suma += i;
                i += 2;
            }
        } else {
            int i = 1;
            while (i <= n) {
                suma += i;
                i += 2;
            }
        }
        return suma;
    }
}
