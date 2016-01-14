
import java.awt.PrintJob;
import java.util.*;

public class AddressBookApplication {
	
	static ArrayList<AddressBook> ab;

	public static class AddressBook {
		private static ArrayList<AddressEntry>ablist;
		
		
		public AddressBook()
		   {
		      ablist=new ArrayList<AddressEntry>();
		      
		     for (AddressEntry value : ablist) {
		    System.out.println(value); 
		} 
		      }
	}


	


		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Menu.prompt_FirstName());
		System.out.println(Menu.prompt_LastName());
		System.out.println(Menu.prompt_Street());
		System.out.println(Menu.prompt_City());
		System.out.println(Menu.prompt_State());
		System.out.println(Menu.prompt_Zip());
		System.out.println(Menu.prompt_Telephone());
		System.out.println(Menu.prompt_Email());
//		System.out.println(AddressBook.AddressBook());
		
		
		AddressEntry ae1 = new AddressEntry("olabiyi","oyewumi","5049 glenn","San pablo","CA","94804","510-000-000","oyewumi@gmail.com");
		AddressEntry ae2 = new AddressEntry("john","doe","5049 glenn","Richmond","CA","94805","510-050-030","jdoe@gmail.com");
		

	//	ab.add(ae1);
	//	ab.add(ae2);

		System.out.println(ab);
	}   
		
		
	


	public void initAddressBookExercise() {
		ArrayList<AddressBook> book; 
//        Book.add(AddressEntry.ae2);
//        Book.add(ae4);
	}
	           	
	   
	
	public static class AddressEntry{
		public String FirstName;
		public String LastName;
		public String Street;
		public String City;
		public String State;
		public String Zip;
		public String Telephone;
		public String Email;
		public String toString() {
	        return this.FirstName + ", " + this.LastName + "," + this.Street + "," + this.City + "," + this.State + "," + this.Zip + "," + this.Telephone + "," + this.Email;
	    }
		
		public AddressEntry(String FN,String LN,String S,String C,String State,String Zip,String Telephone,String Email) 
		{
			FirstName = FN;
			LastName = LN;
			Street = S;
			City = C;
			this.State = State;
			this.Zip = Zip;
			this.Telephone = Telephone;
			this.Email = Email;
		}
	   

	public void setFName( String FirstName){
	       this.FirstName = FirstName;
	   }

	   public String getFName( ){
	       System.out.println("Puppy's age is :" + FirstName ); 
	       return FirstName;
	   }  
	
	
	public void setLName( String LastName){
	       this.LastName = LastName;
	   }

	   public String getLastName( ){
	       System.out.println("Puppy's age is :" + LastName ); 
	       return LastName;
	   }  

	
	public void setStreet( String Street){
	       this.Street = Street;
	   }

	   public String getStreet( ){
	       System.out.println("Puppy's age is :" + Street ); 
	       return Street;
	   }  
	   
	   
	   public void setCity( String City){
	       this.City = City;
	   }

	   public String getCity( ){
	       System.out.println("Puppy's age is :" + City ); 
	       return City;
	   }  
	   
	   public void setState( String State){
	       this.State = State;
	   }

	   public String getState( ){
	       System.out.println("Puppy's age is :" + State ); 
	       return State;
	   }  
	   
	   public void setZip( String Zip){
	       this.Zip = Zip;
	   }

	   public String getZip( ){
	       System.out.println("Puppy's age is :" + 	Zip ); 
	       return Zip;
	   }  
	   
	   public void setTelephone( String Telephone){
	       this.Telephone = Telephone;
	   }

	   public String getTelephone( ){
	       System.out.println("Puppy's age is :" + 	Telephone); 
	       return Telephone;
	   }  
	   
	   public void setEmail( String Email){
	       this.Email = Email;
	   }

	   public String getEmail( ){
	       System.out.println("Puppy's age is :" + 	Email ); 
	       return Email;
	   }  
	}
	

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

		   
		}
	

}
