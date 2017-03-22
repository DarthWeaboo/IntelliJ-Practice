package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        printArray(intArray);

        int [] sortedArray = sortArray(intArray);
        printArray(sortedArray);



    }

    public static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Enter " + number + " numbers: ");
        for (int i = 0; i < number; i++){
            values[i] = kb.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
