
import java.io.IOException;
import java.util.Scanner;

/**
 * Class Menu for Address Book Application
 */
public  class Menu{
	 		
	 		
	 		public Menu ()
	 		{
	 			
	 		}
		   		   			
	        /**
	         * Main menu of the Address Book
	         * @throws IOException 
	         */
	        public static void menu() throws IOException
			   {
			      
			        Scanner sc = new Scanner(System.in);
			        AddressEntry person= new AddressEntry();
				    String menu;
				    String choice;
				    System.out.println("************************************");
				    System.out.println("Please Enter In Your Menu Selection");
				    System.out.println("a. Load from File ");
			        System.out.println("b. Addition ");
			        System.out.println("c. Remove by First Name  ");
			        System.out.println("d. Find ");
			        System.out.println("e. Listing ");
			        System.out.println("f. Save & Quit ");
			        System.out.println("> ");
				    menu = sc.next();
				
				    while (menu != null) {
				
				        switch (menu) {
				        
				        case "a":
				            AddressBookApplication.init("src/file.txt");
				            System.out.println("File has being Read in");
				            System.out.println("> ");
				            break;
				
				        case "b":
				            while (menu != "b") {
				                System.out.println("Enter First Name: ");
				                System.out.println("> ");
				                person.setFName(sc.next());
				                
				                System.out.println("Enter Last Name: ");
				                System.out.println("> ");
				                person.setLName(sc.next()); 
				                
				                System.out.println("Enter Street name: ");
				                System.out.println("> ");
				                person.setStreet(sc.next());
				                
				                System.out.println("Enter City: ");
				                System.out.println("> ");
				                person.setCity(sc.next());
				                
				                System.out.println("Enter State: ");
				                System.out.println("> ");
				                person.setState(sc.next());
				                
				                System.out.println("Enter Zip Code: ");
				                System.out.println("> ");
				                person.setZip(sc.next());
				                
				                System.out.println("Enter Telephone Number: ");
				                System.out.println("> ");
				                person.setTelephone(sc.next());
				                
				                System.out.println("Enter email: ");
				                System.out.println("> ");
				                person.setEmail(sc.next());
				                
				                AddressBook.ablist.add(new AddressEntry(person.getFName(),person.getLastName(),person.getStreet(),person.getCity(),person.getState(),person.getZip(),person.getTelephone(),person.getEmail()));
				                System.out.println("\nYou have successfully added a new person!");
				                break;
				               //menu = sc.next();
				            }
				            break;
				            
				        case "c":
				            System.out.println("Remove a Person: ");
				            System.out.println("> ");
				            choice = sc.next();
							AddressBook.deleteByFirstName(choice);
							
				            break;
				            
				        case "d":
				            System.out.println("Enter Last Name of contact that you would like to Find: ");
				            System.out.println("> ");
				            choice = sc.next();
				            AddressBook.Find(choice);
				            break;
				            
				        case "e":
				        	System.out.println("> ");
				            AddressBookApplication.initAddressBookExercise();
				            
				            break;
				            
                        case "f":
                        	System.out.println("> ");
                        	AddressBookApplication.savetoFile("src/save.txt");
				            System.exit(0);
				            break;
				        }
				       /**
				        System.out.println("************************************");
					    System.out.println("Please Enter In Your Menu Selection");
					    System.out.println("a. Load from File ");
				        System.out.println("b. Addition ");
				        System.out.println("c. Remove by First Name ");
				        System.out.println("d. Find ");
				        System.out.println("e. Listing ");
				        System.out.println("f. Save & Quit ");
				        */
				        menu = sc.nextLine(); 
				    }
				    sc.close();
				    System.out.println("Goodbye!");
			   } 

	        
			
		}