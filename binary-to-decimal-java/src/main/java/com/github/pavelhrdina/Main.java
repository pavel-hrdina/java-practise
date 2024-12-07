package com.github.pavelhrdina;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Binary to Decimal: " + decimalToBinary(5));
    }

    public static int decimalToBinary(int deci) {
        int binary = 0;
        int rem, i = 1;
        for (int j = deci; j > 0; j = j / 2) {
            rem = j % 2;
            binary = binary + rem * i; // calculate binary number
            i = i * 10;
        }
        return binary;
    }
}