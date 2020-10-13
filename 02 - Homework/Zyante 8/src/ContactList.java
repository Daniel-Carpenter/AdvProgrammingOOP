import java.util.Scanner;

public class ContactList
{
	private final static int NUM_CONTACTS = 3;

	public static void main(String[] args)
	{		
		Scanner scnr 		= new Scanner(System.in);
		ContactNode cNode[] = new ContactNode[NUM_CONTACTS];
		
		for(int i = 0; i < NUM_CONTACTS; ++i)
		{
			// Get User Input
				int personNum = i + 1;
				System.out.println("Person " + personNum);
				System.out.println("Enter name:");			
				String contactName = scnr.nextLine();
				
				System.out.println("Enter phone number:");
				String contactPhoneNumber = scnr.nextLine();
				
				System.out.println("You entered: " + contactName + ", " + contactPhoneNumber + "\n");
				
			// Create obj from input above 
				cNode[i] = new ContactNode(contactName, contactPhoneNumber);
		
		}
		
		// Linked List
			for(int i = 1; i < NUM_CONTACTS; ++i )
			{
				cNode[i-1].insertAfter(cNode[i]);
			}
		
			System.out.println("CONTACT LIST");
		
			ContactNode contactNode = cNode[0];
		
		// Print Contacts
			while(contactNode != null)
			{
				contactNode.printContactNode();			
				contactNode = contactNode.getNext();
				System.out.println();
			}
	}
}