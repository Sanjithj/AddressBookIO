package com.bridgelabz;

public class AddressBookMain {
public static void main(String[] args) {
	System.out.println("Welcome to address book");
	AddressBookService.addContact();
	AddressBookService.display();
	AddressBookService.editContact();
}
}
