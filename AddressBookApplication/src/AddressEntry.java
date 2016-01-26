/**
 * Class for the Address Book Entry 
 * Has toString, toFile string methods
 * seters and geters for First Name, Last Name, Street, City, State, Zip, Telephone and Email
 */
public  class AddressEntry{
	
		public String FirstName = " ";
		public String LastName = " ";
		public String Street = " ";
		public String City = " ";
		public String State = " ";
		public String Zip = " ";
		public String Telephone = " ";
		public String Email = " ";
		
		/**
		 * Write file to string 
		 * @return turns file to string
		 */
		public String toString() {
	        return this.FirstName + ", " + this.LastName + "," + this.Street + "," + this.City + "," + this.State + "," + this.Zip + "," + this.Telephone + "," + this.Email + "\n";
	    }
		
		/**
		 * Write the data about people out to a file (filePath).
		 * @return helps print arrayList to a file
		 */
		public String toFile() {
			return FirstName + "\t" + LastName + "\t" + Street + "\t" + City + "\t" + State + "\t" + Zip + "\t" + Telephone + "\t" + Email + "\n";		
		}
		
		/**
		 * Constructor for AddressEntry
		 * @param FirstName points to an instance of FirstName
		 * @param LastName points to an instance of LastName
		 * @param Street points to an instance of Street
		 * @param City points to an instance of City
		 * @param State points to an instance of State
		 * @param Zip points to an instance of Zip
		 * @param Telephone points to an instance of Telephone
		 * @param Email points to an instance of Email
		 */
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
		
		/**
		 * sets first name
		 * @param FirstName
		 */
		public void setFName( String FirstName){
		       this.FirstName = FirstName;
		   }
		
		/**
		 * 
		 * @return first name 
		 */
		public String getFName( ){
		       return FirstName;
		   }  
		
		/**
		 * sets Last name 
		 * @param LastName
		 */
		public void setLName( String LastName){
		       this.LastName = LastName;
		   }
		
		/**
		 * 
		 * @return last name
		 */
	    public String getLastName( ){
		       return LastName;
		   }  
	
		/**
		 * set street 
		 * @param Street
		 */
		public void setStreet( String Street){
		       this.Street = Street;
		   }
		
		/**
		 * 
		 * @return street 
		 */
		public String getStreet( ){ 
		       return Street;
		   }  
		
		/**
		 * set city 
		 * @param City
		 */
		public void setCity( String City){
		       this.City = City;
		   }
		
		/**
		 * 
		 * @return city 
		 */
		public String getCity( ){ 
		       return City;
		   }  

		/**
		 * set state
		 * @param State
		 */
	   public void setState( String State){
	       this.State = State;
	   }

	   /**
	    * 
	    * @return state 
	    */
	   public String getState( ){ 
	       return State;
	   }  
	   
	   /**
	    * set zip code
	    * @param Zip
	    */
	   public void setZip( String Zip){
	       this.Zip = Zip;
	   }
	   
	   /**
	    * 
	    * @return zip code
	    */
	   public String getZip( ){
	       return Zip;
	   }  
	   
	   /**
	    * set telephone number
	    * @param Telephone
	    */
	   public void setTelephone( String Telephone){
	       this.Telephone = Telephone;
	   }
	   
	   /**
	    * 
	    * @return telephone number
	    */
	   public String getTelephone( ){
	       return Telephone;
	   }  
	   
	   /**
	    *  set email address
	    * @param Email
	    */
	   public void setEmail( String Email){
	       this.Email = Email;
	   }
	   
	   /**
	    * 
	    * @return email address
	    */
	   public String getEmail( ){ 
	       return Email;
	   }  
	}	