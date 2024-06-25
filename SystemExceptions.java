import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemExceptions {
	public static void main(String[] args) {
		//variables
		int num;		//numerator
		int den;		//denominator
		double result;	//calculated value
		
		try {
			File file = new File("numbers.txt");
			Scanner scanFile = new Scanner(file);
			
			int num1 = 100 / 0;
			
			//loop until eof
			while (scanFile.hasNext()) {
				num = scanFile.nextInt();
				den = scanFile.nextInt();
				result = (double)num / den;
				System.out.println(num + " / " + den + " = " + result);
			}//end while
			scanFile.close();
		}
		catch(FileNotFoundException fe) {
			System.out.println("File Error." + fe.toString());
		}
		catch(InputMismatchException ie) {
			System.out.println("Input Mismatch." + ie.getMessage());
		}
		catch( ArithmeticException ae) {
			System.out.println("Arithmetic exception." + ae.toString());
		}
//		catch(NoSuchElementException ne) {
//			System.out.println("No such element Exception." + ne.toString());
//			 
//		}
		
		
		finally {
			System.out.println("Done.");
		}
		
	}

}
