
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddressBookApplication {
	
	 static void init(String filename) throws IOException {
		 
		 FileReader fr = new FileReader(filename);
		 BufferedReader br = new BufferedReader(fr);
	     List<AddressEntry>temp = new ArrayList<AddressEntry>();
	     String line  = br.readLine();
	     String token[] = new String [10];
	        while (line != null)
	        {
	            token = line.split(" ");
	        	// assume file is made correctly
                // and make temporary variables for objects
                String FirstName = token[0];
              //  String LastName = token[1];
               // String Street = token[2];
              //  String City = token[3];
              //  String State = token[4];
              //  String Zip = token[5];
              //  String Telephone = token[6];
              //  String Email = token[7];
             //   AddressEntry c = new AddressEntry(FirstName,LastName,Street,City,State,Zip,Telephone,Email);
                
               //temp.add(new AddressEntry(FirstName,LastName,Street,City,State,Zip,Telephone,Email));
	             temp.add(new AddressEntry(FirstName));
	            
	            
	            line  = br.readLine();	            
	        } 

	        for(AddressEntry list : temp){
		        System.out.println(list.toString());
		    }

	        br.close();
	        fr.close();    
			}
	
	public static void main(String [] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(Menu.prompt_FirstName());
		System.out.println(Menu.prompt_LastName());
		System.out.println(Menu.prompt_Street());
		System.out.println(Menu.prompt_City());
		System.out.println(Menu.prompt_State());
		System.out.println(Menu.prompt_Zip());
		System.out.println(Menu.prompt_Telephone());
		System.out.println(Menu.prompt_Email());
		System.out.println("\n");
		initAddressBookExercise();
		init("C:/Users/biyi/AddressBookApplication/AddressBookApplication/src/file.txt");
		//AddressBook.printList();
	   //AddressEntry ae1 = new AddressEntry("olabiyi","oyewumi","5049 glenn","San pablo","CA","94804","510-000-000","oyewumi@gmail.com");
	  //AddressEntry ae2 = new AddressEntry("john","doe","5049 glenn","Richmond","CA","94805","510-050-030","jdoe@gmail.com");
		
	//	ab.add(ae1);
	//	ab.add(ae2);
	}   
		
		
	public static void initAddressBookExercise() {
		// that creates an instance of AddressBook which holds in its collection two instances of the AddressEntry
	// it calls the AddressBook's list() method. The AddressBook's list method cycles through the collection of AddresEntry objects contained in AddressBook 
	// and print outs the information to the console window calling toString() methods on each of its AddressEntry objects.
	//    List = new ArrayList<AddressBook>();
		AddressEntry a = new AddressEntry("Olabiyi","Oyewumi","5049 glenn","San pablo","CA","94804","510-000-000","oyewumi@gmail.com");
		AddressEntry b = new AddressEntry("John","doe","5049 glenn","Richmond","CA","94805","510-050-030","jdoe@gmail.com");
		AddressBook.ablist.add(a);	
		AddressBook.ablist.add(b);
		AddressBook.printList();
	}

}