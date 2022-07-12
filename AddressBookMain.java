package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
public static void main(String[] args) {
	System.out.println("Welcome to address book");
	Scanner sc =new Scanner(System.in);
	int option;
	while(true) {
		System.out.println("Operation want to perform\n 1.Add Contact\n 2.edit contact\n 3.delete\n 4.Display contact\n 5. add address book\n 6. view city\n 7. view state\n 8. sort alphabetical\n 9.sort city");
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
	        	System.out.println("Enter the city");
	        	String city=sc.next();
	        	AddressBookService.viewCity(city);
	    case 7:
	        	System.out.println("Enter the state");
	        	String State=sc.next();
	        	AddressBookService.viewState(State);
	    case 8:
        	AddressBookService.sortAlphabatically();
	    case 9:
        	AddressBookService.sortByCity();
	        	default:
			System.out.println("Enter the option");
		}
		
	System.out.println("Visit again");
	sc.close();
	}
 }	
	
}

