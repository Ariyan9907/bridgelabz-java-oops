package com.src;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    //add contact in addressbook
    public void addContact(Contact contact){
        if(isDuplicate(contact.getFirstName(),contact.getLastName())){
            System.out.println("Contact already exists");
            return;
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    //check first and last name duplicate
    public boolean isDuplicate(String firstName,String lastName){
        for(Contact contact:contacts){
            if((contact.getFirstName()).equalsIgnoreCase(firstName)&&(contact.getLastName()).equalsIgnoreCase(lastName)){
                return true;
            }
        }
        return false;
    }

    //edit contact from adressbook
    public void editContact(String firstName){
        for(Contact contact:contacts){
            if((contact.getFirstName()).equalsIgnoreCase(firstName)){
                System.out.println(contact);

                System.out.println("Enter your first name:");
                contact.setFirstName(sc.nextLine());

                System.out.println("Enter your last name:");
                contact.setLastName(sc.nextLine());

                System.out.println("Enter your Address:");
                contact.setAddress(sc.nextLine());

                System.out.println("Enter your city:");
                contact.setCity(sc.nextLine());

                System.out.println("Enter your state:");
                contact.setState(sc.nextLine());

                System.out.println("Enter your zip:");
                contact.setZip(sc.nextLine());

                System.out.println("Enter your phone number:");
                contact.setPhone(sc.nextLine());

                System.out.println("Enter your email:");
                contact.setEmail(sc.nextLine());

                System.out.println(contact);
                return;

            }

        }
        System.out.println("Contact Not Found");
    }

    //delete contact from addressbook
    public void deleteContact(String firstName){
        for(int i=0;i<contacts.size();i++){
            if((contacts.get(i).getFirstName()).equalsIgnoreCase(firstName)){
                contacts.remove(i);
                System.out.println("Contact deleted succefully");
                return;
            }
        }
        System.out.println("Contact Not Found");
    }

    //search by city
    public void searchByCity(String city) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getCity().equalsIgnoreCase(city)) {
                System.out.println(contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contact found in city: " + city);
        }

    }
    //search by city
    public void searchByState(String state) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getState().equalsIgnoreCase(state)) {
                System.out.println(contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contact found in city: " + state);
        }

    }

    //display contact from adress book
    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("Address Book is Empty");
            return;
        }

        for(Contact contact:contacts){
            System.out.println(contact);
        }
    }
}
