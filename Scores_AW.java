// In this program you are to ask the user for the number of students in the class.  The number of students must be greater than 0 and less than 26.
// 
// Using and array of ints that is equal in size to the number of students, you are to ask the user to enter the scores (which must be 0 - 100, inclusive) and store them in the array.
// 
// Your program must then calculate and output:
// 
// The scores in order from lowest to highest.
// The highest score of the scores entered
// Then lowest score of the scores entered
// The average of all of the scores entered
// The number of scores at the average
// The number of scores above the average
// The number of scores below the average
import java.util.Arrays;
import java.util.Scanner;


public class Scores_AW {
   public static void main(String[] args) {
      //return back an array
      int[] scores = createPopulateArrayOfInts(); 
      System.out.println(Arrays.toString(scores));    
         
   
   }
   //create a method and populate the array
   public static int[] createPopulateArrayOfInts() {
      Scanner kb = new Scanner(System.in);
      int n;
      
      do {
         System.out.println("Please enter a value 0 - 25, inclusive: ");
         n = kb.nextInt();
      } while (n < 0 || n > 25);
      
      int[] theArray = new int[n];
      
      for (int i = 0; i < theArray.length; ++i) {
        do {
         System.out.println("Please enter a value 0 - 100, inclusive: ");
         n = kb.nextInt();
         } while (n < 0 || n > 100);
         theArray[i] = n;
      }
      return theArray;
   }//end array method   


}