import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String input;
      
      System.out.println("Input an abbreviation:");
      
      input = scnr.next();
      
      if (input.equals("LOL")) {
         System.out.println("laughing out loud");
      } else if (input.equals("IDK")) {
         System.out.println("I don't know");
      } else if (input.equals("BFF")){
         System.out.println("best friends forever");
      } else if (input.equals("IMHO")){
         System.out.println("in my humble opinion");
      } else if (input.equals("TMI")){
         System.out.println("too much information");
      } else {
         System.out.println("Unknown");
      }
   }
}
