package ProgrammingAssignment4;
import java.util.Scanner;

public class ShoppingCartManager {
	
	public static void main(String[] args) {
        {
        	char choice = ' ';
            Scanner scnr = new Scanner (System.in);            
            System.out.println ("Enter Customer's Name:");
            String customerName = scnr.nextLine ();
            System.out.println ("Enter Today's Date:");
            String currentDate = scnr.nextLine ();
            System.out.println("");
            System.out.println ("Customer Name: " + customerName);
            System.out.println ("Today's Date: " + currentDate);
            System.out.println("");
            
            ShoppingCart shoppingCart = new ShoppingCart(customerName, currentDate);
            
            
           
            while (choice != 'q') {
                choice = printMenu (shoppingCart, scnr);
            }

            return;
        }
    }

   public static char printMenu(ShoppingCart shoppingCart, Scanner scnr) {
        System.out.println ("MENU");
        System.out.println ("a - Add item to cart");
        System.out.println ("d - Remove item from cart");
        System.out.println ("c - Change item quantity");
        System.out.println ("i - Output items' descriptions");
        System.out.println ("o - Output shopping cart");
        System.out.println ("q - Quit");
        System.out.println ("");


        char choice = ' ';
        String Name = "";
        String Description = "";
        int price = 0;
        int quantity = 0;

        while (choice != 'a' && choice != 'd' && choice != 'c' &&
                choice != 'i' && choice != 'o' && choice != 'q') {
            System.out.println ("Choose an option:");
            choice = scnr.next().charAt(0);
        }

        switch (choice) {
            case 'a':
                scnr.nextLine();
                System.out.println ("ADD ITEM TO CART");
                System.out.println ("Enter the item name:");
                Name = scnr.nextLine();
                System.out.println("Enter the item description:");
                Description = scnr.nextLine();
                System.out.println ("Enter the item price:");
                price = scnr.nextInt();
                System.out.println ("Enter the item quantity:");
                quantity = scnr.nextInt();
                ItemToPurchase item = new ItemToPurchase(Name, Description, price, quantity);
                shoppingCart.addItem(item);
                choice = ' ';
                System.out.println("");
                break;

            case 'd':
                scnr.nextLine();
                System.out.println ("REMOVE ITEM FROM CART");
                System.out.println ("Enter name of item to remove:");
                Name = scnr.nextLine();
                shoppingCart.removeItem(Name);
                choice = ' ';
                System.out.println("");
                break;

            case 'c':
                scnr.nextLine ();
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                Name = scnr.nextLine ();
                System.out.println("Enter the new quantity:");
                quantity = scnr.nextInt();
                ItemToPurchase modItem = new ItemToPurchase();
                modItem.setName(Name);
                modItem.setQuantity(quantity);
                shoppingCart.modifyItem(modItem);
                choice = ' ';
                System.out.println("");
                break;
            case 'i':
                System.out.println ("OUTPUT ITEMS' DESCRIPTIONS");
                shoppingCart.printDescriptions ();
                choice = ' ';
                System.out.println("");
                break;
            case 'o':
                System.out.println ("OUTPUT SHOPPING CART");
                shoppingCart.printTotal();
                System.out.println("");
                choice = ' ';
                break;

        }
        return choice;
    }

    

}
