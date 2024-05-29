import java.util.Scanner;

public class GolfAssignment {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numberOfStrokes;
		int par;
		
		
		par = scnr.nextInt();
		numberOfStrokes = scnr.nextInt();
		
		String scoreName = getScoreName(par, numberOfStrokes);
		
		
		System.out.println(scoreName);
		scnr.close();
	}

	
	public static String getScoreName(int par, int strokes) {
		if (par != 3 && par != 4 && par != 5) {
             return "Error";
        }

        int difference = strokes - par;
        
        
        switch (difference) {
        	case -2:
        		return "Eagle";
        	case -1:
        		return "Birdie";
        	case 0:
        		return "Par";
        	case 1:
        		return "Bogey";
        	default:
        		return "Error";
        }
	}
}
