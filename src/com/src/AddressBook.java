package com.src;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public void addContact(Contact contact){
        contacts.add(contact);
    }

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

            }
        }
    }

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

    public void displayContacts(){
        for(Contact contact:contacts){
            System.out.println(contact);
        }
    }
}
