package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookHash {
	HashMap<String, AddressBookService> addressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);

  
   public AddressBookService findAddressBook(String addBookName) {

       for (Map.Entry<String, AddressBookService> itrator : addressBook.entrySet()) {
           if (itrator.getKey().equalsIgnoreCase(addBookName)) {
               return itrator.getValue();
           }
       }

       return null;

   }
   public void addAddressBook() {

       System.out.println(" enter the name of the address  ");
       String name = sc.next();

       if (addressBook.get(name) != null) {

           System.out.println(" this book already exists");
           return;
       }

       addressBook.put(name, new AddressBookService());

   }
   public void addContact() {
   	System.out.println("enter the address book name");
   	
   	String addressBook=sc.next();
   	AddressBookService addBook=findAddressBook(addressBook);
   	if(addBook==null) {
   		System.out.println("this is not exist");
   		return;
   	}
   	AddressBookService.addContacts();
   }
   public void editContact() {
   	System.out.println("please enter the address book ");
   	String addressBook=sc.next();
   	AddressBookService addBook=findAddressBook(addressBook);
   	if(addBook==null) {
   		System.out.println("this is not exist");
   		return;
   	}
   	AddressBookService.editContact();
   }
   public void deleteContact() {
   	System.out.println("please enter the address book ");
   	String addressBook=sc.next();
   	AddressBookService addBook=findAddressBook(addressBook);
   	if(addBook==null) {
   		System.out.println("this is not exist");
   		return;
   	}
   	AddressBookService.deleteContact();
   }
   
   public void display() {
   	System.out.println("please enter the address book ");
   	String addressBook=sc.next();
   	AddressBookService addBook=findAddressBook(addressBook);
   	if(addBook==null) {
   		System.out.println("this is not exist");
   		return;
   	}
   	AddressBookService.display();
   	
   }
   public void find(String name, String state, String City) {
   	

   	addressBook.values().stream().forEach((addBook) -> {
           AddressBookService.addressBookMang.stream().filter(contact -> {

                       if (City.equalsIgnoreCase("city"))
                           return Contacts.getCity().equalsIgnoreCase(state);
                       else
                           return Contacts.getState().equalsIgnoreCase(state);
                   }).filter(contact -> Contacts.getFirst_name().equalsIgnoreCase(name))
                   .forEach(contact -> System.out.println(contact));
       });
   }
   
   
   }