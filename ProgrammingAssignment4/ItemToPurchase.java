package ProgrammingAssignment4;

public class ItemToPurchase {
  private String itemName;
  private int itemPrice;
  private int itemQuantity;
  private String itemDescription;
 
  
  //default constructor
  public ItemToPurchase() {
     this.itemName = "none";
     this.itemPrice = 0;
     this.itemQuantity = 0;
     this.itemDescription = "none";
     return;
  }
  //parameterized constructor
  public ItemToPurchase( String itemNameInput, String itemDescriptionInput, int itemPriceInput, int itemQuantityInput) {
    itemName = itemNameInput;
    itemPrice = itemPriceInput;
    itemQuantity = itemQuantityInput;
    itemDescription = itemDescriptionInput;
    return;
  }
  
  public void setName(String name) {
     this.itemName = name;
     return;
  }
  
  public void setPrice(int price) {
     itemPrice = price;
     return;
  }
  
  public void setQuantity(int quantity) {
     this.itemQuantity = quantity;
     return;
  }
  
  public String getName() {
     return itemName;
  }
  
  public int getPrice() {
     return itemPrice;
  }
  
  public int getQuantity() {
     return itemQuantity;
  }

  public void printItemPurchase() {
     System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                        " = $" + (itemPrice * itemQuantity));
  }
  
  public String setDescription(String itemDescriptionInput) {
    return this.itemDescription = itemDescriptionInput;
  }
  
  public String getDescription() {
    return itemDescription;

  }
  
  public void printItemCost() {
    int subTotal = itemQuantity * itemPrice;
    System.out.println(itemName + " " + itemQuantity + " @ " + "$" + itemPrice + " = " + "$"+subTotal);
  }
  
  public void printItemDescription() {
    System.out.println(itemName + ": " + itemDescription);

  }
}