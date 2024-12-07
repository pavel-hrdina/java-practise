package com.github.pavelhrdina;

public class Main {
    public static void main(String[] args) {
        System.out.println(binaryMultiplication(10, 11));
    }

    public static int binaryMultiplication(int bin1, int bin2) {
        int result = 0;
        while (bin2 != 0) { // loop until there are no more bits set in b
            if ((bin2 & 1) != 0) { // if the least significant bit of b is set
                result += bin1;
            }
            bin1 <<= 1;
            bin2 >>= 1;
            // the shift is done because we are multiplying by 2^i
            // where i is the position of the bit in the binary number
        }
        return result;
    }

}