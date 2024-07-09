import javax.swing.JOptionPane;

public class MPG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		double miles;
		double gallons;
		double mpg;
		String input;
		
		//prompt for miles
		input = JOptionPane.showInputDialog("Enter the number of miles: ");
		miles = Double.parseDouble(input);
		
		//prompt for gallons
		input = JOptionPane.showInputDialog("Enter the number of gallons: ");
		gallons = Double.parseDouble(input);
		
		//calculation
		mpg = miles / gallons;
		
		//display the mpg
		JOptionPane.showMessageDialog(null, "MPG = " + String.format("%.2f", mpg));

	}

}
