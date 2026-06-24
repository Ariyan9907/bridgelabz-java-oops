package com.src;

import java.util.Scanner;

public class AddressBookMain {
    public static Scanner sc=new Scanner(System.in);


    public static Contact getContact(){
        System.out.println("Enter your first name:");
        String firstName=sc.nextLine();
        System.out.println("Enter your last name:");
        String lastName=sc.nextLine();
        System.out.println("Enter your Address:");
        String address=sc.nextLine();
        System.out.println("Enter your city:");
        String city=sc.nextLine();
        System.out.println("Enter your state:");
        String state=sc.nextLine();
        System.out.println("Enter your zip:");
        String zip = sc.nextLine();
        System.out.println("Enter your phone number:");
        String phone=sc.nextLine();
        System.out.println("Enter your email:");
        String email=sc.nextLine();
        return new Contact(firstName, lastName, address, city, state, zip, phone, email);
    }


    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        System.out.println("Eneter the contact numbers you want to save");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=n;i++){
            System.out.println("For Contact "+i+":");
            Contact contact = getContact();
            addressBook.addContact(contact);
            System.out.println(i+" Contact Added Successfully");
        }

        addressBook.displayContacts();

        System.out.println("Enter firstname to edit contact");
        addressBook.editContact(sc.nextLine());


        System.out.println("Enter firstname to delete contact");
        String deleteName = sc.nextLine();

        addressBook.deleteContact(deleteName);

        addressBook.displayContacts();

    }
}
