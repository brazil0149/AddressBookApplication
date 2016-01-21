
public  class AddressEntry{
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
	