class ContactNode
{
	private String contactName;
	private String contactPhoneNumber;
	private ContactNode nextNodePtr;


	public ContactNode(String contactName, String contactPhoneNumber)
	{
		this.contactName 		= contactName;
		this.contactPhoneNumber = contactPhoneNumber;
		this.nextNodePtr 		= null;
	}
	
	public String getName()	// Name from constructor
	{
		return this.contactName;
	}
	
	public String getPhoneNumber() // Phone from constructor
	{
		return contactPhoneNumber;
	}
	
	public void insertAfter(ContactNode N)
	{
		this.nextNodePtr = N;
	}
	
	ContactNode getNext()	
	{
		return nextNodePtr;
	}
	
	void printContactNode()	// Print
	{
		System.out.println("Name: "+ this.contactName);
		System.out.println("Phone number: "+contactPhoneNumber);
	}

}