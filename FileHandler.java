package com.bridgelabz;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandler {
	public static void readFromFile()  {
		File file=new File("AddressBook.txt");
        try {
		FileReader f=new FileReader(file);    
        int i;    
        while((i=f.read())!=-1)    
        System.out.print((char)i);    
        f.close();  
		}catch(IOException e) {
			e.printStackTrace();
		}
	  
	}
	public static void writeintofile() {
		try {
            File file=new File("AddressBook.txt");
			FileWriter f=new FileWriter(file);
			f.append(AddressBookService.listOfContacts.toString());
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
