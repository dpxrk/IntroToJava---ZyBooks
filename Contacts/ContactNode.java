
public class ContactNode {
	
	private String contactName;
	private String contactPhoneNumber;
	private ContactNode nextNodePtr;
	
	//default constructor
	public ContactNode() {
		contactName = " ";
		contactPhoneNumber = " ";
		nextNodePtr = null;
	}	
	
	//constructor
	public ContactNode(String name, String phone) {
		this.contactName = name;
		this.contactPhoneNumber = phone;
		this.nextNodePtr = null;
	}
	
	public String getName() {
		return this.contactName;
	}
	
	public String getPhoneNumber() {
		return this.contactPhoneNumber;
	}
	
	//getNext pointer
	public ContactNode getNext() {
		return this.nextNodePtr;
	}
	
	//insertAfter
	public void insertAfter(ContactNode nodeLoc) {
		ContactNode tmpNext;			//create temp 
		tmpNext = this.nextNodePtr;
		this.nextNodePtr = nodeLoc;
		nodeLoc.nextNodePtr = tmpNext;
	}
	
	//print contact node
	public void printContactNode() {
		System.out.println("Name: " + this.contactName);
		System.out.println("Phone number: " + this.contactPhoneNumber);
	}
	

} //end class