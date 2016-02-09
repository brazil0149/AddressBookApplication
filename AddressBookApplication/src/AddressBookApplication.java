/**
 *
 * @author Olabiyi Oyewumi
 * @version 1.0
 * @since  January 25 2016
 *
 * purpose: Address Book
 */


import java.io.BufferedReader;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;


public class AddressBookApplication {
	
	/**
	 * Get file from a text file and save it to the array list
	 * @param filename Filename of the text file that is being read
	 * @throws IOException To see if file is empty 
	 */	
	 static void init(String filename) throws IOException {
		 BufferedReader in = new BufferedReader(new FileReader(filename));
		 Scanner line = new Scanner(in);
		 AddressEntry book = new AddressEntry();
         try {
        	 while (in.ready()) {
						  	book.setFName(in.readLine());
						  	book.setLName(in.readLine());
						  	book.setStreet(in.readLine());
						  	book.setCity(in.readLine());
						  	book.setState(in.readLine());
						  	book.setZip(in.readLine());
						  	book.setTelephone(in.readLine());
						  	book.setEmail(in.readLine()); 
							in.readLine();
						  AddressBook.ablist.add(new AddressEntry(book.getFName(),book.getLastName(),book.getStreet(),book.getCity(),book.getState(),book.getZip(),book.getTelephone(),book.getEmail()));
						 continue;
					 }
              line.close();
         } catch (Exception e) {
              e.printStackTrace();
         }
		 } 


	public static void main(String [] args) throws IOException {
		Menu.menu();
	//	init("src/file.txt");
	//	initAddressBookExercise();
	}   
	
	/**
	 * add people into Address Book manually and print it out 
	 */
	public static void initAddressBookExercise() {
		// that creates an instance of AddressBook which holds in its collection two instances of the AddressEntry
	// it calls the AddressBook's list() method. The AddressBook's list method cycles through the collection of AddresEntry objects contained in AddressBook 
	// and print outs the information to the console window calling toString() methods on each of its AddressEntry objects.
		
		AddressBook.ablist.add(new AddressEntry("Olabiyi","Oyewumi","5049 glenn","San pablo","CA","94804","510-000-000","oyewumi@gmail.com"));	
		AddressBook.ablist.add(new AddressEntry("John","doe","5049 glenn","Richmond","CA","94805","510-050-030","jdoe@gmail.com"));	
		Collections.sort(AddressBook.ablist);
		AddressBook.printList();
	}
	
	/**
	 * Done! Save data and exit.
	 * @param filePath Path to where to save Address Book file
	 * @throws IOException If file is empty
	 */
	public static void  savetoFile(String filePath) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(filePath)); 

		for(AddressEntry x:AddressBook.ablist){ // Traverse each entry of the address book and write it to a file
				String temp= x.toFile();
				out.println(temp);
				
		}
		System.out.println("Your file has been saved");
		out.close();
    }

	           	
}