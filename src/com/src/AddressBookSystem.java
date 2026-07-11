package com.src;

import java.util.HashMap;

public class AddressBookSystem {
    HashMap<String,AddressBook> addressBooks=new HashMap<>();

    public void addAddessBook(String name){
        if(addressBooks.containsKey(name)){
            System.out.println("The address book already exist");
            return;
        }
        addressBooks.put(name,new AddressBook());
        System.out.println("The address book is created");
    }

    public AddressBook getAddressBook(String name){
        return addressBooks.get(name) ;
    }

    public void displayAddessBooks(){
        if(addressBooks.isEmpty()){
            System.out.println("The adressBook is empty");
            return;
        }
        for(String name:addressBooks.keySet()){
            System.out.println(name);
        }
    }
}
