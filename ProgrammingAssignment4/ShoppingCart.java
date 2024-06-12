package ProgrammingAssignment4;
import java.util.ArrayList;

public class ShoppingCart {

	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems;
	
	public ShoppingCart() {
		this.customerName = "none";
		this.currentDate = "January 1, 2016";
		this.cartItems = new ArrayList<ItemToPurchase>();
	}
	
	public ShoppingCart(String nameInput, String dateInput) {
		this.customerName = nameInput;
		this.currentDate = dateInput;
		this.cartItems = new ArrayList<ItemToPurchase>();
		return;
	}
	
	//get customer name
	public String getCustomerName() {
		return customerName; 
	}
	
	
	//set customer name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//get date
	public String getDate() {
		return currentDate;
	}
	
	//set date
	public void setDate(String date) {
		this.currentDate = date;
	}
	
	// Add an item to cartItem Array;
	public void addItem(ItemToPurchase item) {
		 this.cartItems.add(item);
	}
	
	//remove items from cart item array.
	// @params(String) Takes in a string that is the item's name
	// @return void
	// Iterate through cartItems. If not found, then print statement, not found in cart
	public void removeItem(String itemName) {
		boolean found = false;
		for (ItemToPurchase item : cartItems) {
			if (item.getName().equals(itemName)) {
				cartItems.remove(item);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Item not found in cart. Nothing removed.");
		}
	}
	
	//Modify an item in cart array
	// @param (ItemToPurchase item). Takes in an object item
	// @return void
	// iterate through cartItems, and if the cartItem name is found check to see 
	// if description is not none, or not 0 in price or quantity.
	// other wise, output that nothing was modified.
	public void modifyItem(ItemToPurchase item) {
        boolean found = false;
        for (ItemToPurchase cartItem : cartItems) {
            if (cartItem.getName().equals(item.getName())) {
                if (!item.getDescription().equals("none")) {
                    cartItem.setDescription(item.getDescription());
                }
                if (item.getPrice() != 0) {
                    cartItem.setPrice(item.getPrice());
                }
                if (item.getQuantity() != 0) {
                    cartItem.setQuantity(item.getQuantity());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }
	
	
	// Get number of items in the cart.
	// @Param None
	// @Return Integer.
	// If cart is empty, print statement "SHOPPING CART IS EMPTY" and return 0.
	// Otherwise, iterate through cartItem and then add the number of quantity to total Quantity.
	
	public int getNumItemsInCart() {
		int totalQuantity = 0;
		
		
			for (ItemToPurchase cartItem : cartItems) {
				totalQuantity += cartItem.getQuantity();
			}

		return totalQuantity;
	}
	
	// Get number of items in the cart.
	// @Param None
	// @Return integer
	// If cart is empty, print statement "SHOPPING CART IS EMPTY" and return 0.
	// Otherwise, iterate through cartItem and then add cost by quantity times price to total Quantity.
	
	public int getCostOfCart() {
		int totalCost = 0;		
				
			for (ItemToPurchase cartItem: cartItems) {
				totalCost += cartItem.getPrice() * cartItem.getQuantity();
			
		}
		
		return totalCost;
	}
	
	
	//Print out total of cart
	// @Param none
	// @Return void
	// Print out statements.
	public void printTotal() {			
           System.out.println(customerName + "'s Shopping Cart - " + currentDate);
           System.out.println("Number of Items: " + getNumItemsInCart());
           System.out.println("");
           if (cartItems.isEmpty()) {
        	   System.out.println("SHOPPING CART IS EMPTY");
           } else {        	   
        	   for (ItemToPurchase cartItem : cartItems) {
        		   cartItem.printItemCost();
           		}
           }
           System.out.println("");
           System.out.println("Total: $" + getCostOfCart());
        
		
	}
	
	
	
	public void printDescriptions() {
		if (cartItems.isEmpty()) {
			System.out.println("SHOPPING CART IS EMPTY");
			
		}else {			
		System.out.println(customerName + "'s" + " " + "Shopping Cart - " + currentDate);
		System.out.println();
		System.out.println("Item Descriptions");
		for (ItemToPurchase cartItem : cartItems) {			
			cartItem.printItemDescription();
		}

		}
		
	}

	
	

}
