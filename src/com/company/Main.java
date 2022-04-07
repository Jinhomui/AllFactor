package com.company;

public class Main {

    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int remainder = 0;
        int divisor = 0;

        while (number > divisor) {
            divisor++;
            remainder = number % divisor;
            if (remainder == 0) {
//                System.out.println(remainder);
                System.out.println(divisor);
            }
        }
    }
}
