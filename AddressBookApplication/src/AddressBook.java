import java.util.ArrayList;
import java.util.List;

public class AddressBook {
		 // Address book entries
		static List<AddressEntry>ablist = new ArrayList<AddressEntry>();
		
		/**
		public AddressBook()
		   {
		      ablist=new ArrayList<AddressEntry>();
		   } 
		*/  
        //find
		//add
		//remove
		//list
		//save
		//load
     
		public static void printList(){
		    for(AddressEntry elem : ablist){
		        System.out.println(elem.toString());
		    }
		} 

		
		}