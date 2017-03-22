package com.company;

import java.util.ArrayList;

/**
 * Created by Nick on 2/24/2017.
 */
public class Contacts {
    private int number;
    private String name;

    public static ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public Contacts(int phoneNumber, String contactName){
        number = phoneNumber;
        name = contactName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void addContacts(Contacts contacts){
        contactList.add(contacts);
    }

    public static void printContacts(){
        for (int i = 0; i < contactList.size(); i++){
            System.out.println(i + 1 + ". " + contactList.get(i).toString());
        }
    }

    public static void modifyContactName(String oldName, String newName){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getName().equals(oldName)){
                contactList.get(i).setName(newName);
            }
        }
    }

    public static void modifyContactNumber(int oldNumber, int newNumber){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getNumber()== oldNumber){
                contactList.get(i).setNumber(newNumber);
            }
        }
    }

    public void findContact(String name) {
        if (contactList.contains(name)) {
            System.out.println("Contact found.");
            for (int i = 0; i < contactList.size(); i++){
                if (contactList.get(i).getName() == name){
                    System.out.println(contactList.get(i));
                }
            }
        }
        else{
            System.out.println("Contact not found");
        }

    }

    public void removeContact(Contacts contact){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).equals(contact)) {
                contactList.remove(i);
            }
        }
    }

    public String toString(){
        return getName() + " " + getNumber();
    }
}
