package com.github.pavelhrdina;

public class Main {
    /**
     * add two binary numbers together and output the result,
     */
    public static void main(String[] args) {
        int[] number1 = {0b11101011};
        int[] number2 = {0b1101110010};
        while (number2[0] != 0) {
            int carry = number1[0] & number2[0]; // calculate the carry
            number1[0] = number1[0] ^ number2[0]; // calculate the sum as XOR
            number2[0] = carry << 1; // carry left over to the next bit
        }
        // convert the result to binary string and remove the leading zeros
        while (number1[0] != 0) {
            System.out.print(number1[0] & 1);
            number1[0] = number1[0] >> 1;
        }
    }
}