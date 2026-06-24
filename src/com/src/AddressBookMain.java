package com.src;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

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

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact);
        System.out.println("Contact Added Successfully");

        System.out.println("Enter firstname to edit contact");
        addressBook.editContact(sc.nextLine());






    }
}
