import java.util.Scanner;

public class DescendingOrder {
   // 		Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
      int i;
      int j;
      int k;
      int indexLargest = 0;
      int temp; // Temporary variable for swap                                                         

      for (i = 0; i < numElements - 1; ++i) {
         // Find index of largest remaining element                                                   
         indexLargest = i;
         for (j = i + 1; j < numElements; ++j) {
            if (numbers[j] > numbers[indexLargest]) {
               indexLargest = j;
            }
         }
         
         // Swap numbers[i] and numbers[indexLargest]                                                 
         temp = numbers[i];
         numbers[i] = numbers[indexLargest];
         numbers[indexLargest] = temp;

         // Output current array                                                                      
         for (k = 0; k < numElements; ++k) {
            System.out.print(numbers[k] + " " );
         }
         System.out.println();
      }
   }  
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];
            
      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      input = scnr.nextInt();
      while (input != -1) {
         numbers[i] = input;
         ++i;
         ++numElements;
         input = scnr.nextInt();
      }
      selectionSortDescendTrace(numbers, numElements);
      scnr.close();
   }
}