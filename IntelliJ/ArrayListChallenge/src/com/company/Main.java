package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends MobilePhone{


    private static Scanner kb = new Scanner(System.in);

    public Main(int phoneNumber, String contactName) {
        super(phoneNumber, contactName);
    }

    public static void main(String[] args) {
        MobilePhone.menu();
        boolean quit = true;
        while (quit){
            int option = kb.nextInt();
            switch (option){
                case 1: storeContacts();
                    break;
                case 2: changeContacts();
                    break;
                case 3: removeContact();
                    break;
                case 4: searchContacts();
                    break;
                case 5: printContacts();
                    break;
                case 6: quit();
                    quit = false;
            }
        }

    }



}
