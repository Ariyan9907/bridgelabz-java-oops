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
        AddressBookSystem system = new AddressBookSystem();

        while (true){
            System.out.println("Choose option");
            System.out.println("1. Create Address Book");
            System.out.println("2. Open Address Book");
            System.out.println("3. Display Address Books");
            System.out.println("4. Exit");
            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Address Book name");
                    String name=sc.nextLine();
                    system.addAddessBook(name);
                    break;

                case 2:
                    System.out.println("Enter name to open");
                    String bookname=sc.nextLine();
                    AddressBook addressBook = system.getAddressBook(bookname);

                    if(addressBook == null){
                        System.out.println("Address Book Not Found");
                        break;
                    }

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
                    break;

                case 3:
                    system.displayAddessBooks();
                    break;

                case 4:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invlid choice choose again");

            }
        }







//        addressBook.displayContacts();
//
//        System.out.println("Enter firstname to edit contact");
//        addressBook.editContact(sc.nextLine());
//
//
//        System.out.println("Enter firstname to delete contact");
//        String deleteName = sc.nextLine();
//
//        addressBook.deleteContact(deleteName);
//
//        addressBook.displayContacts();

    }
}
