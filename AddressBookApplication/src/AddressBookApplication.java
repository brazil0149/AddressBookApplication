
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddressBookApplication {
	/**
	public static class AddressBook {
		 // Address book entries
		static List<AddressEntry>ablist = new ArrayList<AddressEntry>();
		
		/**
		public AddressBook()
		   {
		      ablist=new ArrayList<AddressEntry>();
		   } 
		  
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
	*/
	
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
	           	
	   
	/**
	public static class AddressEntry{
		public String FirstName = " ";
		public String LastName = " ";
		public String Street = " ";
		public String City = " ";
		public String State = " ";
		public String Zip = " ";
		public String Telephone = " ";
		public String Email = " ";
		public String toString() {
	        return this.FirstName + ", " + this.LastName + "," + this.Street + "," + this.City + "," + this.State + "," + this.Zip + "," + this.Telephone + "," + this.Email + "\n";
	    }
		
		public AddressEntry(String FirstName,String LastName,String Street,String City,String State,String Zip,String Telephone,String Email) 
		{
			this.FirstName = FirstName;
			this.LastName = LastName;
			this.Street = Street;
			this.City = City;
			this.State = State;
			this.Zip = Zip;
			this.Telephone = Telephone;
			this.Email = Email;
		}
		
		public AddressEntry() 
		{
			
		}
		
		public AddressEntry(String FirstName) 
		{
			this.FirstName = FirstName;
		}
	   
		public void setFName( String FirstName){
		       this.FirstName = FirstName;
		   }
	
		   public String getFName( ){
		       return FirstName;
		   }  
		
		
		public void setLName( String LastName){
		       this.LastName = LastName;
		   }
	
		   public String getLastName( ){
		       return LastName;
		   }  
	
		
		public void setStreet( String Street){
		       this.Street = Street;
		   }

		   
	   public void setState( String State){
	       this.State = State;
	   }

	   public String getState( ){ 
	       return State;
	   }  
	   
	   public void setZip( String Zip){
	       this.Zip = Zip;
	   }

	   public String getZip( ){
	       return Zip;
	   }  
	   
	   public void setTelephone( String Telephone){
	       this.Telephone = Telephone;
	   }

	   public String getTelephone( ){
	       return Telephone;
	   }  
	   
	   public void setEmail( String Email){
	       this.Email = Email;
	   }

	   public String getEmail( ){ 
	       return Email;
	   }  
	}
	*/

	
	/**
	public static  class Menu{
		   		   
			public static  String prompt_FirstName() 
			{
				
				return "Enter First Name: ";
				}
			public static String prompt_LastName() 
			{				
				return "Enter Last Name: ";

				}
			public static String prompt_Street() 
			{				
				return "Street: ";

				}
			public static String prompt_City() 
			{				
				return "City: ";
				}
			public static String prompt_State() 
			{
				return "State: ";
				}
			public static String prompt_Zip() 
			{
				return "Zip: ";
				}
			
			public static String prompt_Telephone() 
			{
				return "Telephone: ";
				}
			public static String prompt_Email() 
			{
				return "Email: ";
				}

		   
		}*/
	

}