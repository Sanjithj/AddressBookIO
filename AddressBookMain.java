package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
public static void main(String[] args) {
	System.out.println("Welcome to address book");
	Scanner sc =new Scanner(System.in);
	int option;
	while(true) {
		System.out.println("Operation want to perform\n 1.Add Contact\n 2.edit contact\n 3.delete\n 4.Display contact\n 5. add address book");
		option =sc.nextInt();
		switch(option) {
		case 1:
			AddressBookService.addContacts();
			break;
		case 2:
			AddressBookService.editContact();
			break;
		case 3:
			AddressBookService.deleteContact();
			break;
		case 4:
			AddressBookService.display();
			break;
		case 5:
			AddressBookService.addAddressBook();
		case 6:
		    System.out.print(" please enter the name of person ");
            String name = sc.next();
            System.out.print(" enter to search by city: ");
            String City = sc.next();
            System.out.println("please enter state");
            String state=sc.next();
            AddressBookService.find(name, state, City);
		default:
			System.out.println("Enter the correct option");
		}
		
	System.out.println("Visit again");
	sc.close();
	}
 }	
	
}

