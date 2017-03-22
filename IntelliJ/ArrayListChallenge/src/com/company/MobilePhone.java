package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nick on 2/24/2017.
 */
public class MobilePhone extends Contacts{

    private static Scanner kb = new Scanner(System.in);
    public ArrayList<Contacts> contactList = new ArrayList<Contacts>();
    public MobilePhone(int phoneNumber, String contactName) {
        super(phoneNumber, contactName);
    }

    public static void menu(){
        System.out.println("Menu: ");
        System.out.println("1. Save new contacts");
        System.out.println("2. Change existing contacts");
        System.out.println("3. Remove existing contacts");
        System.out.println("4. Search contacts list");
        System.out.println("5. See all contacts");
        System.out.println("6. Quit");
    }

    public static void storeContacts(){
        System.out.println("Enter the name: ");
        String name = kb.nextLine();
        System.out.println("Enter the number: ");
        int number = kb.nextInt();
        String eater = kb.nextLine();
        Contacts newContact = new Contacts(number, name);
        MobilePhone.addContacts(newContact);
        menu();
    }
    public static void changeContacts(){
        System.out.println("Enter the the index of the contact you would like to change.");
        //String name = kb.nextLine();
        //int number = kb.nextInt();

            printContacts();

            int choice;
            System.out.println("What would you like to change? ");
            System.out.println("1. Name");
            System.out.println("2. Number");
            choice = kb.nextInt();
            if (choice == 1){
                System.out.println("Enter new name: ");
                String newName = kb.nextLine();
                Contacts.modifyContactName(name, newName);
            }
            else if (choice == 2){
                System.out.println("Enter new number: ");
                int newNumber = kb.nextInt();
                Contacts.modifyContactNumber(number, newNumber);

            }
            else {
                System.out.println("Not an option.");
            }


        menu();
    }

    public static void printContacts(){
        Contacts.printContacts();
        menu();
    }

    public void searchContacts(){
        System.out.println("Enter the name of the contact you are searching for: ");
        String name = kb.nextLine();
        findContact(name);
        menu();
    }

    public void removeContact(){
        printContacts();
        System.out.println("Enter the index of the contact you would like to remove: ");
        int choice = kb.nextInt() - 1;
        removeContact(contactList.get(choice));
    }

    public void quit(){
        System.out.println("Goodbye");
    }
}
