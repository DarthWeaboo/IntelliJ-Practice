package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }

    public static int reverse(int x){
        int reversedNum = 0;
        while (x != 0){
            reversedNum = reversedNum * 10 + x %10;
            x = x / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE){
            throw new IllegalArgumentException();

        }
        return reversedNum;
    }
}
