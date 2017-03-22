package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int firstNum = kb.nextInt();
        int secondNum = kb.nextInt();
        int thirdNum = kb.nextInt();
        int counter = 0;
        for (int i = firstNum; i <= secondNum; i++){
            if(i % thirdNum == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
