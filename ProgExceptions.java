import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgExceptions {
	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner(System.in);
		int numSteps = 0;
		
		try {
			while(true) {
				//prompt the user
				System.out.print("Enter the number of steps taken: ");
				numSteps = scan.nextInt();
			
				System.out.printf("%.2f miles\n", stepsToMiles(numSteps));
			}//end while
			}
		catch(InputMismatchException ie) {
			System.out.println("Invalid input.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
			System.out.println("Done.");
		}
			

		
		
	}//end main
	
	//step to miles will convert the number of steps to miles
	public static double stepsToMiles(int steps) throws Exception {
		final int STEPSPERMILE = 2000;
		
		if (steps < 0) {
			throw new Exception("Exception: negative steps not allowed.");
		}
		else if (steps > 50000) {
			throw new Exception("Exception: too many steps.");
		}
		
		return (double)steps/STEPSPERMILE;
	}

}
