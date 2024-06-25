

public class NegativeInputException extends Exception {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  

  public NegativeInputException() {
    System.out.println("Negative input values not allowed.");
  }
  
  public NegativeInputException(String s) {
    System.out.println("here!");
    System.out.println(s);
  }

}

