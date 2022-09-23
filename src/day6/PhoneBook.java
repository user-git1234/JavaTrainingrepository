package day6;

import java.util.HashMap;
import java.util.Scanner;



public class PhoneBook {

	public static void main(String[] args) {
		HashMap<String, Long> myContacts = new HashMap<>();
		//for testing cases 2,3,4
		myContacts.put("Luke", 7998817713L);
		myContacts.put("Haley", 6778817713L);
		myContacts.put("Alex", 8726398713L);
		myContacts.put("Lily", 9082635187L);
		
		 System.out.println("Enter the Action to perform");
		 System.out.println("1. ADD Contact\n" + "2. Display Contacts\n" +"3. Search Contact\n"+ "4.Delete Contact");
		 
		 Scanner sc = new Scanner(System.in);
		 int inputAction =  sc.nextInt();
		 try {
		 
			
			 if(inputAction <=0 | inputAction > 4 ) {
				 throw new InvalidSelectionException("Invalid Option Selected");
			 }
		 }
		 catch(InvalidSelectionException is) {
			 System.out.println(is.getMessage());
		 }
		 
		 
		 switch(inputAction) {
		 
		 case 1:
			 System.out.println("Enter the name");
			 String name = sc.next();
			 System.out.println("Enter the number");
			 Long num = sc.nextLong();
			 myContacts.put(name, num);
			 System.out.println("Contact Added Succesfully");
			 System.out.println(myContacts);
			 break;
			 
			 
		 case 2:

			 System.out.println(myContacts);
			 break;
			 

		  case 3:
			 System.out.println("Enter the Contact Name to search");
			 String contact = sc.next();
			 if(myContacts.containsKey(contact)) {
				 System.out.println("Contact Found");
				 Long mynum = myContacts.get(contact);
				 System.out.println(mynum);
			 }
			 else {
				 System.out.println("Contact Not Found!!");
			 }
			 break;
		 
		 case 4:
			 System.out.println("Enter the Contact to be removed ");
			 String Name = sc.next();
			 if(myContacts.containsKey(Name)) {
				 
				 myContacts.remove(Name);
				 System.out.println("Contact Deleted");
				 System.out.println(myContacts);
				 
			 }
			 else {
				 System.out.println("Contact Not Found!!");
			 }
			 break;
			 
					 
		 }
	}

}
