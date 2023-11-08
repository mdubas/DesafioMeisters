package com.challenge.meisters.challenges;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.printf("Before: a = %d b = %d%n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("After: a = %d b = %d%n", a, b);
    }
}
