import java.util.Scanner;
/**
 * 
 * Program will return an output from a given input down to the first 
 * number that is divisible by 11.
 * 
 * @author Daniel Park
 * @verision 1.0
 */

public class CountDownTilMatching {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input = 0;
		
		 // Loop until a valid number is entered
        while (true) {          
            if (scnr.hasNextInt()) {
                input = scnr.nextInt();
                if (input >= 11 && input <= 100) {
                    break; // Exit the loop if the number is within the valid range
                } else {
                    System.out.println("Input must be 11-100");
                }
            } else {            	
                scnr.next(); // Clear the invalid input
            }
        }
		
		for (int i = input; i >= 10; --i) {
			System.out.print(i+ " "); // Print out numbers counting down from input
			if (i % 11 == 0) {
				break;// If the countdown reaches a number that is divisible by 11, break out of program
			} 
		}
		System.out.println("");
		scnr.close();
	}

	
}
	
	


