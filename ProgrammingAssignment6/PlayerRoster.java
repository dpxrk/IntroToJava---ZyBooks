import java.util.Scanner;

//@Author Daniel Park

public class PlayerRoster {
	
	public static void printOutRoster(int[][] array) {
		System.out.println("ROSTER");
		for(int i = 0; i < array.length; i++) {
			System.out.println("Player " + (i+1) + " -- Jersey number: " + array[i][0] + ", Rating: " + array[i][1]);
		}
		System.out.println("");
	}
	
	public static void menu() {
		System.out.println("MENU");
	     System.out.println("u - Update player rating");
	     System.out.println("a - Output players above a rating");
	     System.out.println("r - Replace player");
	     System.out.println("o - Output roster");
	     System.out.println("q - Quit");
	     System.out.println("");
	     System.out.println("Choose an option:"); 
	}
	

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[][] players = new int[5][2];
		boolean menuOpen = true;
		char menuInput;
		
				
		//filling out array of players with a for loop.
		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter player " + (i+1) + "'s jersey number:");
			players[i][0] = scnr.nextInt();
			System.out.println("Enter player " + (i+1) + "'s rating:");
	        players[i][1] = scnr.nextInt();
	        System.out.println("");
		}
		
		printOutRoster(players);
		
		while(menuOpen) {
			menu();
			menuInput = scnr.next().charAt(0);
	 	    if (menuInput == 'q') {
	 	    	menuOpen = false;
	 	    	break;
	 	    } else if (menuInput == 'o') {
				printOutRoster(players);
			} else if (menuInput =='u') {
				System.out.println("Enter a jersey number: ");
				int jerseyNumber = scnr.nextInt();
				System.out.println("Enter a new rating for player:");
				int newRating = scnr.nextInt();
				for (int i = 0; i < players.length;i++) {
					if (players[i][0] == jerseyNumber) {
						players[i][1] = newRating;
					}
				}
			} else if (menuInput == 'a') {
				System.out.println("Enter a rating:");
				int rating = scnr.nextInt();
				
				System.out.println("ABOVE " + rating);
				for (int i = 0; i < players.length;i++) {
					if (players[i][1] > rating) {
						System.out.println("Player " + (i+1) + " -- Jersey number: " + players[i][0] + ", Rating: " + players[i][1]);
					}
					
				}
				System.out.println("");
			} else if (menuInput =='r') {
				System.out.println("Enter a jersey number: ");
		        int jerseyNumber = scnr.nextInt();
		          for (int i = 0; i < players.length; i++) {
		            if (players[i][0] == jerseyNumber) {
		                System.out.println("Enter a new jersey number: ");
		                players[i][0] = scnr.nextInt();
		                System.out.println("Enter a rating for the new player: ");
		                players[i][1] = scnr.nextInt();
		             }
		         } 
			}
		}
		scnr.close();
		
	}

	
}