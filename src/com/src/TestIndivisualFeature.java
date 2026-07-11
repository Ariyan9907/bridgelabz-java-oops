package com.src;

public class TestIndivisualFeature {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        addressBook.addContact(new Contact(
                "Aryan",
                "Pujari",
                "Tilakwadi",
                "Belagavi",
                "Karnataka",
                "590001",
                "9876543210",
                "aryan@gmail.com"));

        addressBook.addContact(new Contact(
                "Rahul",
                "Patil",
                "Camp",
                "Belagavi",
                "Karnataka",
                "590002",
                "9876500000",
                "rahul@gmail.com"));

        addressBook.addContact(new Contact(
                "Amit",
                "Sharma",
                "FC Road",
                "Pune",
                "Maharashtra",
                "411001",
                "9999999999",
                "amit@gmail.com"));

        System.out.println("Search By City");
        addressBook.searchByCity("Belagavi");

        System.out.println();

        System.out.println("Search By State");
        addressBook.searchByState("Maharashtra");
    }
}
