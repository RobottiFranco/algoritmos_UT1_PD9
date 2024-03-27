package com.example;

public final class Factorial {

    public static void main(String[] args) {
        int num = 5;

        try {
            int factorial = factorial(num);
            System.out.println(factorial);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static int factorial(int numero) {

        if (numero < 1) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }

        int resultado = numero;
        for (int i = numero - 1; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
