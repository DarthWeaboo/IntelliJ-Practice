package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
        System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
        System.out.println("3) Quit");
        int choice = kb.nextInt();
        if (choice == 1){
            for (int i = 1; i <= 5; i++){
                for (int j = 0; j <= 9; j++){
                    if (i + j > 10){
                        System.out.print(i + " ");
                        System.out.println(j);
                    }
                }
            }
        }
    }
}
