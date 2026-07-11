package com.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String,ArrayList<Contact>> cityMap=new HashMap<>();
    HashMap<String,ArrayList<Contact>> stateMap=new HashMap<>();

    Scanner sc=new Scanner(System.in);

    //add contact in addressbook
    public void addContact(Contact contact){
        if(isDuplicate(contact.getFirstName(),contact.getLastName())){
            System.out.println("Contact already exists");
            return;
        }
        contacts.add(contact);

        if(!cityMap.containsKey(contact.getCity())){
            cityMap.put(contact.getCity(),new ArrayList<>());
        }
        ArrayList<Contact> cityContacts = cityMap.get(contact.getCity());
        cityContacts.add(contact);


        if(!stateMap.containsKey(contact.getState())){
            cityMap.put(contact.getState(),new ArrayList<>());
        }
        ArrayList<Contact> stateContacts = cityMap.get(contact.getState());
        stateContacts.add(contact);
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

    public void viewCoctactsByCity(String city){
        ArrayList<Contact> cityContacts = cityMap.get(city);
        if (cityContacts == null || cityContacts.isEmpty()) {
            System.out.println("No contacts found in city: " + city);
            return;
        }

        for (Contact contact : cityContacts) {
            System.out.println(contact);
        }
    }

    public void viewCoctactsByState(String state){
        ArrayList<Contact> stateContacts = cityMap.get(state);
        if (stateContacts == null || stateContacts.isEmpty()) {
            System.out.println("No contacts found in city: " + state);
            return;
        }

        for (Contact contact : stateContacts) {
            System.out.println(contact);
        }
    }

    public void countContactByCity(String city){
        if((cityMap.get(city)==null)||(cityMap.isEmpty())){
            System.out.println("No contacts available in this city");
            return;
        }

        int n=cityMap.get(city).size();
        System.out.println(n+" contancts in the "+city);
    }

    public void countContactBystate(String state){
        if((cityMap.get(state)==null)||(cityMap.isEmpty())){
            System.out.println("No contacts available in this state");
            return;
        }

        int n=cityMap.get(state).size();
        System.out.println(n+" contancts in the "+state);
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
