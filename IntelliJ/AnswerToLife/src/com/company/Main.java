package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        while (input != 42){
            System.out.println(input);
            input = kb.nextInt();
        }
    }
}
