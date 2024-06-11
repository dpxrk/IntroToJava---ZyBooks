import java.util.Scanner;

public class ContactList {
	public static void main(String[] args) {
		
		//variables
		Scanner scnr = new Scanner(System.in);
		String name;		//user input
		String phone;		//user input
		
		ContactNode contact1;
		ContactNode contact2;
		ContactNode contact3;
		ContactNode currContact;
		
		//get contact 1's info
		System.out.print("Enter contact name: ");
		name = scnr.nextLine();
		System.out.print("Enter contact phone number: ");
		phone = scnr.nextLine();
		
		//redisplay contact info
		System.out.println("Person 1: " + name + ", " + phone);
		
		//First contact node
		contact1 = new ContactNode(name, phone);
		
		//contact 2
		System.out.print("Enter contact name: ");
		name = scnr.nextLine();
		System.out.print("Enter contact phone number: ");
		phone = scnr.nextLine();
		
		//redisplay contact info
		System.out.println("Person 2: " + name + ", " + phone);
		
		//Second contact node
		contact2 = new ContactNode(name, phone);
		
		//link contact 1 to contact 2 node
		contact1.insertAfter(contact2);
		
		//Third contact node
		System.out.print("Enter contact name: ");
		name = scnr.nextLine();
		System.out.print("Enter contact phone number: ");
		phone = scnr.nextLine();
		
		//redisplay contact info
		System.out.println("Person 3: " + name + ", " + phone);
		
		//Third contact node
		contact3 = new ContactNode(name, phone);
		
		//connect node 2 to node 3
		contact2.insertAfter(contact3);
		
		//print out the linked list (contact info)
		System.out.println("\nCONTACT LIST\n");
		
		//set currContact to the head node (contact1)
		currContact = contact1;
		
		while (currContact != null) {
			currContact.printContactNode();
			currContact = currContact.getNext();
			System.out.println("");
		}	
		
	}

}
