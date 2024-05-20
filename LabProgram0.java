import java.util.Scanner;

public class LabProgram0 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int age;
      int lbs;
      int bpm;
      int minutes;
      
      double calories;
      
      age = scnr.nextInt();
      lbs = scnr.nextInt();
      bpm = scnr.nextInt();
      minutes = scnr.nextInt();
      
      calories = (double)((age * 0.2757) + (lbs * 0.03295) + (bpm * 1.0781) - 75.4991) * minutes / 8.368;
      
      System.out.print("Calories: ");
      System.out.printf("%.2f", calories);
      System.out.println(" calories"); 
   }
} 
