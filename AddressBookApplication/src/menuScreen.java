import java.awt.EventQueue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class menuScreen implements ActionListener{
	AddressEntry person = new AddressEntry();
//	DefaultListModel<AddressEntry> model = new DefaultListModel<AddressEntry>();
	private JDialog mydialog;

	private JFrame frame;
	/** Address Book buttons to Display, create a new entry into Address Book and to Remove an entry in the Address Book */
    static JButton Display = new JButton("Display");
    static JButton New = new JButton("New");
    static JButton Remove = new JButton("Remove");
    static JButton Search = new JButton("Search");
    static JButton Save = new JButton("Save");
    static JButton Exit = new JButton("Exit");
    /** Creates Labels for Address Book Entries such as First Name and Last Name  */
    static JLabel FirstName = new JLabel("First Name: ", SwingConstants.RIGHT);
    static JLabel LastName = new JLabel("Last Name: ", SwingConstants.RIGHT);
    static JLabel Street = new JLabel("Street: ", SwingConstants.RIGHT);
    static JLabel City = new JLabel("City: ", SwingConstants.RIGHT);
    static JLabel State = new JLabel("State: ", SwingConstants.RIGHT);
    static JLabel Zip = new JLabel("Zip: ", SwingConstants.RIGHT);
    static JLabel Telephone = new JLabel("Telephone: ", SwingConstants.RIGHT);
    static JLabel Email = new JLabel("Email: ", SwingConstants.RIGHT);    
    /** The text fields for each labels such as First Name and Last Name used to input and display Address Book Info */
    static JTextField Lfield = new JTextField(13);
    static JTextField Rfield = new JTextField(13);
    static JTextField Sfield = new JTextField(13);
    static JTextField Cfield = new JTextField(13);
    static JTextField sfield = new JTextField(13);
    static JTextField Zfield = new JTextField(13);
    static JTextField Tfield = new JTextField(13);
    static JTextField Efield = new JTextField(13); 
    static JScrollPane scrollPane = new JScrollPane();
    static Container contentPane = new Container();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuScreen window = new menuScreen();
					window.frame.setTitle("Address Book");
					window.frame.setVisible(true);
			        window.frame.setPreferredSize(new Dimension(340,380));
			   //		frame.setResizable(false);
			        window.frame.pack();
			        window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menuScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		contentPane.setLayout(new GridBagLayout());
        JScrollPane scrollPane = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JPanel panelC = new JPanel(new GridLayout(1,11,1,1));
        frame.getContentPane().add(panelC);
//        panelC.setBorder(new EmptyBorder(5,5,5,5));
        panelC.add(scrollPane);
		
        
	    JPanel buttonPanel = new JPanel();
	    buttonPanel.setLayout(new GridBagLayout());
	    
	    /** Display Button  */
	    GridBagConstraints DButton = new GridBagConstraints();
        DButton.gridx = 0;
        DButton.gridy = 1;
        DButton.insets = new Insets(0, 0, 0, 0);
        DButton.fill = GridBagConstraints.HORIZONTAL;
		DButton.anchor = GridBagConstraints.NORTH;
		DButton.weightx = 1.0;
        DButton.weighty = 1.0;
        contentPane.add(Display,DButton);
   //     contentPane.add(buttonPanel);
        Display.setMnemonic('D');
        
        /** Add New Entry button  */
        GridBagConstraints NButton = new GridBagConstraints();
        NButton.gridx = 1;
        NButton.gridy = 1;
        NButton.insets = new Insets(0, 0, 0, 0); 
        NButton.fill = GridBagConstraints.HORIZONTAL;
		NButton.anchor = GridBagConstraints.NORTH;
		NButton.weightx = 1.0;
        NButton.weighty = 1.0;
 //       buttonPanel.add(New,NButton);
        contentPane.add(New, NButton);
        New.setMnemonic('N');
        
        /** Remove a Person Button */
        GridBagConstraints RButton = new GridBagConstraints();
        RButton.gridx = 2;
        RButton.gridy = 1;
        RButton.insets = new Insets(0, 0, 0, 0); 
        RButton.fill = GridBagConstraints.HORIZONTAL;
		RButton.anchor = GridBagConstraints.NORTH;
		RButton.weightx = 1.0;
        RButton.weighty = 1.0;
        contentPane.add(Remove,RButton);
        Remove.setMnemonic('R');
        
        /** Search a Person Button */
        GridBagConstraints SButton = new GridBagConstraints();
        SButton.gridx = 0;
        SButton.gridy = 2;
        SButton.insets = new Insets(0, 0, 0, 0); 
        SButton.fill = GridBagConstraints.HORIZONTAL;
		SButton.anchor = GridBagConstraints.SOUTH;
		SButton.weightx = 1.0;
        SButton.weighty = 1.0;
        contentPane.add(Search,SButton);
        Search.setMnemonic('S');
        
        /** Exit the program */
        GridBagConstraints EButton = new GridBagConstraints();
        EButton.gridx = 1;
        EButton.gridy = 2;
        EButton.insets = new Insets(0, 0, 0, 0); 
        EButton.fill = GridBagConstraints.HORIZONTAL;
		EButton.anchor = GridBagConstraints.SOUTH;
		EButton.weightx = 1.0;
        EButton.weighty = 1.0;
        contentPane.add(Exit,EButton);
        Exit.setMnemonic('E');
        
        /** Save the program */
        GridBagConstraints sButton = new GridBagConstraints();
        sButton.gridx = 2;
        sButton.gridy = 2;
        sButton.insets = new Insets(0, 0, 0, 0); 
        sButton.fill = GridBagConstraints.HORIZONTAL;
		sButton.anchor = GridBagConstraints.SOUTH;
		sButton.weightx = 1.0;
        sButton.weighty = 1.0;
        contentPane.add(Save,sButton);
        Save.setMnemonic('s');
        
        Display.addActionListener(this);
   		New.addActionListener(this);
   		Remove.addActionListener(this);
   		Search.addActionListener(this);
   		Save.addActionListener(this);
   		Exit.addActionListener(this);
        
	}
	
	/**
	 * clear text field after display and input
	 */	
	public void clear(){
	    
		Lfield.setText(""); 
		Rfield.setText(""); 
		Sfield.setText(""); 
		Cfield.setText(""); 
		sfield.setText(""); 
		Zfield.setText(""); 
		Tfield.setText(""); 
		Efield.setText(""); 
	 
     }
	
	/**
	 * add new entry to address book through text field
	 */
	public void New () {
		/**
        // First name 
		GridBagConstraints line = new GridBagConstraints();
	    FirstName.setLabelFor(Lfield);  
	    line.gridx = 0;
	    line.gridy = 0;
	    contentPane.add(FirstName,line); 
	    FirstName.setDisplayedMnemonic('F');
	    
	    /** left field  
	    GridBagConstraints lineField = new GridBagConstraints();
		lineField.gridx = 1;
		lineField.insets = new Insets(5, 5, 5, 5);
		lineField.weightx = 1.0;
        lineField.weighty = 1.0;
		lineField.fill = GridBagConstraints.HORIZONTAL;
		lineField.anchor = GridBagConstraints.CENTER;
	    contentPane.add(Lfield,lineField);
	    Lfield.setFocusAccelerator('F');
	    */
	    /** Last name 
	    GridBagConstraints line1 = new GridBagConstraints();
	    LastName.setLabelFor(Rfield);  
	    line1.gridx = 0;
	    contentPane.add(LastName,line1);
	    LastName.setDisplayedMnemonic('L');
	    */
	    /** last name field  
	    GridBagConstraints lineField1 = new GridBagConstraints();
		lineField1.gridx = 1;
		lineField1.insets = new Insets(5, 5, 5, 5);
		lineField1.gridy = 1;
		lineField1.weightx = 1.0;
        lineField1.weighty = 1.0;
		lineField1.fill = GridBagConstraints.HORIZONTAL;
		lineField1.anchor = GridBagConstraints.CENTER;
	    contentPane.add(Rfield,lineField1);
	    Rfield.setFocusAccelerator('L');
	    */
	    /** Street  
	    GridBagConstraints line2 = new GridBagConstraints();
	    Street.setLabelFor(Sfield);  
	    line2.gridx = 0;
	    contentPane.add(Street,line2); 
	    Street.setDisplayedMnemonic('S');
	    */
	    /** street field 
	    GridBagConstraints lineField2 = new GridBagConstraints();
		lineField2.gridx = 1;
		lineField2.insets = new Insets(5, 5, 5, 5);
		lineField2.gridy = 2;
		lineField2.weightx = 1.0;
        lineField2.weighty = 1.0;
		lineField2.fill = GridBagConstraints.HORIZONTAL;
		lineField2.anchor = GridBagConstraints.CENTER;
	    contentPane.add(Sfield,lineField2);
	    Sfield.setFocusAccelerator('S');
	    */
	    /** City 
	    GridBagConstraints line3 = new GridBagConstraints();
	    City.setLabelFor(Cfield);  
	    line3.gridx = 0;
	    contentPane.add(City,line3); 
	    City.setDisplayedMnemonic('C');
	    */
	    /** city field 
	    GridBagConstraints lineField3 = new GridBagConstraints();
		lineField3.gridx = 1;
		lineField3.insets = new Insets(5, 5, 5, 5);
		lineField3.gridy = 3;
		lineField3.weightx = 1.0;
        lineField3.weighty = 1.0;
		lineField3.fill = GridBagConstraints.HORIZONTAL;
		lineField3.anchor = GridBagConstraints.CENTER;
	    contentPane.add(Cfield,lineField3);
	    Cfield.setFocusAccelerator('C');
	    */
	    /** State 
	    GridBagConstraints line4 = new GridBagConstraints();
	    State.setLabelFor(sfield);  
	    line4.gridx = 0;
	    contentPane.add(State,line4);
	    State.setDisplayedMnemonic('s');
	    */
	    /** state field  
	    GridBagConstraints lineField4 = new GridBagConstraints();
	    lineField4.gridx = 1;
		lineField4.insets = new Insets(5, 5, 5, 5);
		lineField4.gridy = 4;
		lineField4.weightx = 1.0;
        lineField4.weighty = 1.0;
		lineField4.fill = GridBagConstraints.HORIZONTAL;
		lineField4.anchor = GridBagConstraints.CENTER;
	    contentPane.add(sfield,lineField4);
	    sfield.setFocusAccelerator('s');
	    */
	    /** Zip code 
	    GridBagConstraints line5 = new GridBagConstraints();
	    Zip.setLabelFor(Zfield);  
	    line5.gridx = 0;
	    contentPane.add(Zip,line5); 
	    Zip.setDisplayedMnemonic('Z');
	    */
	    /** zip field 
	    GridBagConstraints lineField5 = new GridBagConstraints();
		lineField5.gridx = 1;
		lineField5.insets = new Insets(5, 5, 5, 5);
		lineField5.gridy = 5;
		lineField5.weightx = 1.0;
        lineField5.weighty = 1.0;
		lineField5.fill = GridBagConstraints.HORIZONTAL;
		lineField5.anchor = GridBagConstraints.CENTER;
	    contentPane.add(Zfield,lineField5);
	    Zfield.setFocusAccelerator('Z');
	    */
	    /** Telephone number  
	    GridBagConstraints line6 = new GridBagConstraints();
	    Telephone.setLabelFor(Tfield);   
	    line6.gridx = 0;
	    contentPane.add(Telephone,line6);
	    Telephone.setDisplayedMnemonic('T');
		*/
	    /** telephone field 
	    GridBagConstraints lineField6 = new GridBagConstraints();
		lineField6.gridx = 1;
		lineField6.insets = new Insets(5, 5, 5, 5);
		lineField6.gridy = 6;
		lineField6.weightx = 1.0;
        lineField6.weighty = 1.0;
		lineField6.fill = GridBagConstraints.HORIZONTAL;
		lineField6.anchor = GridBagConstraints.CENTER;
	    contentPane.add(Tfield,lineField6);
	    Tfield.setFocusAccelerator('T');
	    */
	    /** Email Address  
	    GridBagConstraints line7 = new GridBagConstraints();
	    Email.setLabelFor(Efield);   
	    line7.gridx = 0;
	    contentPane.add(Email,line7);
	    Email.setDisplayedMnemonic('E');
	    */
	    /** email field  
	    GridBagConstraints lineField7 = new GridBagConstraints();
		lineField7.gridx = 1;
		lineField7.insets = new Insets(5, 5, 5, 5);
		lineField7.gridy = 7;
		lineField7.weightx = 1.0;
        lineField7.weighty = 1.0;
		lineField7.fill = GridBagConstraints.HORIZONTAL;
		lineField7.anchor = GridBagConstraints.CENTER;
	    contentPane.add(Efield,lineField7);
	    Efield.setFocusAccelerator('E');
	    
	    */
		/**
		person.setFName(FirstName);
		person.setLName(LastName);
		person.setStreet(Street);
		person.setCity(City);
		person.setState(State);
		person.setZip(Zip);
		person.setTelephone(Telephone);
		person.setEmail(Email); 
        AddressBook.ablist.add(new AddressEntry(person.getFName(),person.getLastName(),person.getStreet(),person.getCity(),person.getState(),person.getZip(),person.getTelephone(),person.getEmail()));
		*/
	}
	
	/**
	 * display contents of address book through text field 
	 */
	public void display () {
		/**
		Collections.sort(AddressBook.ablist);
	    for(AddressEntry elem : AddressBook.ablist){
	    	model.addElement(elem);
	    	model.toString();
	    }  */
	    
	//	 List = new JList<>(model);
	//	 add(List);
		//JOptionPane.showMessageDialog(null,List+"Please enter person name to search.");
		/**
		Lfield.setText(person.getFName()); 
		Rfield.setText(person.getLastName()); 
		Sfield.setText(person.getStreet()); 
		Cfield.setText(person.getCity()); 
		sfield.setText(person.getState()); 
		Zfield.setText(person.getZip()); 
		Tfield.setText(person.getTelephone()); 
		Efield.setText(person.getEmail());  */
	}
	
	/**
	 * remove someone from the address book by first name through the use of the text field 
	 */
	public void RemoveByFirst(){

	   	String FirstName = JOptionPane.showInputDialog("Please Enter first name");
	   	if(FirstName.equals("")){
	   		JOptionPane.showMessageDialog(null,"Please enter person name to delete.");
	   	}	   	
	   	else {
	   		AddressBook.deleteByFirstName(FirstName);
	   		JOptionPane.showMessageDialog(null,FirstName+" Record(s) deleted.");
	   	}	   	
     }
	
	/**
	 * search for someone from the address book by last name through the use of the text field  
	 */
	public void searchPerson() {
	    
		String LastName = JOptionPane.showInputDialog("Please Enter Last name");
	   	/*clear contents of arraylist if there are any from previous search*/	
	   	if(LastName.equals("")){
	   		JOptionPane.showMessageDialog(null,"Please enter person name to search.");
	   	}
	   	else{
	   		AddressBook.Find(LastName);
			JOptionPane.showMessageDialog(null,LastName +" was Found");
	   			return;
	   		}
	   	}
	
	/**
	 * enables the use of action listners for the Display, New, Remove, save and Exit Buttons
	 */	
	public void actionPerformed (ActionEvent e){
   		
   		if (e.getSource () == Display){
          //   display();
   			DefaultListModel<AddressEntry> model = new DefaultListModel<AddressEntry>();
   			JList<AddressEntry> List = new JList<AddressEntry>(model);   			
             Collections.sort(AddressBook.ablist);
            AddressBookApplication.initAddressBookExercise();
            try {
				AddressBookApplication.init("src/file.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
     	    for(AddressEntry elem : AddressBook.ablist){
     	    	model.addElement(elem);
     	    	model.toString();
     	    }      		
     	//	JPanel panel = new JPanel();
     		//JScrollPane scroll = new JScrollPane(List,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
           // panel.setLayout( new GridLayout( 1, 3) );
            panelC.add(scroll);
            /**
            mydialog = new JDialog();
            mydialog.setSize(new Dimension(400,400));
            mydialog.getContentPane().add(panel);
            mydialog.setTitle("Address Book List");
            mydialog.setModalityType(JDialog.ModalityType.APPLICATION_MODAL); // prevent user from doing something else
            mydialog.setVisible(true); */  
        }

   		else if (e.getSource() == New){
             New();
             clear();
        }

   		else if (e.getSource() == Remove){
   			RemoveByFirst();
            clear(); 
        }
   		
   		
   		else if (e.getSource() == Search){
             searchPerson();
        } 
   		
   		else if (e.getSource() == Save){
   			try {
				AddressBookApplication.savetoFile("src/save.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
       } 

   		
   		else if (e.getSource() == Exit){			
   			System.exit(0);
   		} 

   	}

}