public class ItemToPurchase {
  private String itemName;
  private int itemPrice;
  private int itemQuantity;
  
  //default constructor
  public ItemToPurchase() {
     itemName = "none";
     itemPrice = 0;
     itemQuantity = 0;
     return;
  }
  
  public void setName(String name) {
     itemName = name;
     return;
  }
  
  public void setPrice(int price) {
     itemPrice = price;
     return;
  }
  
  public void setQuantity(int quantity) {
     itemQuantity = quantity;
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
}
