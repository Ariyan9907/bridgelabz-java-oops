package com.src;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    //add contact in addressbook
    public void addContact(Contact contact){
        contacts.add(contact);
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
