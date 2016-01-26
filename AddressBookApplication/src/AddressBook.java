import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * AddressBook class for the Address Book Application
 */
public class AddressBook {
		 // Address book entries
		/**
		 * Data structure for the Address Book
		 */
	    static List<AddressEntry> ablist = new ArrayList<AddressEntry>(); 

		
		/**
		 * constructor for data structure
		 */
		public AddressBook()
		   {
		      ablist=new ArrayList<AddressEntry>();
		   } 
		   
		 

     /**
      * Print out list of people in the Address Book
      */
		public static void printList(){
		    for(AddressEntry elem : ablist){
		        System.out.println(elem.toString());
		    } 
		}
		
		/**
		 * Removes A Person from address book by first name
		 * @param firstName
		 */
		public static void deleteByFirstName(String firstName) {
			  for (Iterator<AddressEntry> iterator = ablist.iterator(); iterator.hasNext();) {
			    AddressEntry temp = iterator.next();

			    if (temp.getFName().equalsIgnoreCase(firstName)) {
			      iterator.remove();
			      System.out.println( firstName + " was removed from Address Book");
			      return;
			    }
			  }

			  System.out.println("No contact with first name " + firstName + " was found.");
			}
		
		/**
		 * Find A person in the AddressBook by Last Name and print it out 
		 * @param LastName
		 */
		public static void Find(String LastName) {
			for (Iterator<AddressEntry> iterator = ablist.iterator(); iterator.hasNext();) {
			    AddressEntry temp = iterator.next();

			    if (temp.getLastName().contains(LastName)) {
			      iterator.toString();
			      System.out.println("Found : " + temp);
			      return;
			    }
			  }
		}
		}