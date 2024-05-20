import java.util.Scanner;

public class CalorieCounter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int age;
      int lbs;
      int bpm;
      int minutes;
      
      double menCalories;
      double womenCalories;
      
      age = scnr.nextInt();
      lbs = scnr.nextInt();
      bpm = scnr.nextInt();
      minutes = scnr.nextInt();
      
      womenCalories = (double)((age * .074) - (lbs * 0.05741) + (bpm * 0.4472) - 20.4022) * (minutes / 4.184);
      menCalories = (double)((age * 0.2017) + (lbs * 0.09036) + (bpm * 0.6309) - 55.0969) * (minutes / 4.184);
      
      System.out.print("Women: ");
      System.out.printf("%.2f", womenCalories);
      System.out.println(" calories");
      
      System.out.print("Men: ");
      System.out.printf("%.2f", menCalories);
      System.out.println(" calories"); 
   }
} 
