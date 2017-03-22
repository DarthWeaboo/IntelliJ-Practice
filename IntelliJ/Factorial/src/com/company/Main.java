package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int fact = kb.nextInt();
        for (int i = fact - 1; i > 0; i--){
            fact *= i;
        }
        System.out.println(fact);
    }
}
