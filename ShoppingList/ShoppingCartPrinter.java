import java.util.Scanner;

public class ShoppingCartPrinter {

	public static void main(String[] args) {
		// variables
		String name;
		int price;
		int quantity;
		int total = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		//instantiate 2 objects of class ItemToPurchase
		ItemToPurchase item1 = new ItemToPurchase();
		ItemToPurchase item2 = new ItemToPurchase();
		
		//prompt for item1 info
		
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		name = scnr.nextLine();
		
		System.out.println("Enter the item price:");
		price = scnr.nextInt();
		
		System.out.println("Enter the item quantity:");
		quantity = scnr.nextInt();
		
		System.out.println("");
		
		//populate item1 data
		item1.setName(name);
		item1.setPrice(price);
		item1.setQuantity(quantity);
		
		//prompt for item2 info
		
		System.out.println("Item 2");
		System.out.println("Enter the item name:");
		scnr.nextLine();
		name = scnr.nextLine();
				
		System.out.println("Enter the item price:");
		price = scnr.nextInt();
				
		System.out.println("Enter the item quantity:");
		quantity = scnr.nextInt();
				
		System.out.println("");
				
		//populate item2 data
		item2.setName(name);
		item2.setPrice(price);
		item2.setQuantity(quantity);
		
		//totals
		total = (item1.getPrice() * item1.getQuantity()) +
				(item2.getPrice() * item2.getQuantity());
		
		System.out.println("TOTAL COST");
		System.out.println(item1.getName() + " " + item1.getQuantity() +
				" @ $" + item1.getPrice() + " = $" +
				(item1.getPrice() * item1.getQuantity()));
		System.out.println(item2.getName() + " " + item2.getQuantity() +
				" @ $" + item2.getPrice() + " = $" +
				(item2.getPrice() * item2.getQuantity()));
		
		System.out.println("\nTotal: $" + total);
		
		
		
		
		
		//close the scanner
		scnr.close();
	}

}
