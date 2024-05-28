import java.util.Scanner;

//Prompt the user to enter values until
//0 is pressed.  The max value will be displayed.


public class FindMaxS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int num;		//a number entered by the user
		int max;		//the current maximum value entered
		
		Scanner scnr = new Scanner(System.in);
		
		//priming read
		System.out.print("Enter a positive number, press 0 to stop: ");
		num = scnr.nextInt();
		
		max = num;		//initialize max to the first input number
		
		while (num > 0) {
			if (num > max) {
				//new max value
				max = num;
			}
			System.out.print("Enter a positive number, press 0 to stop: ");
			num = scnr.nextInt();
		}
		
		//display the max
		System.out.print("Max = " + max);	
		
		//close the scanner
		scnr.close();

	}	

}
