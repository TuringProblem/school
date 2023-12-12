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
      int sum = 0;
      double average;
      int numberAbove = 0, numberBelow = 0, numberEqual = 0;
      Arrays.sort(scores);
      System.out.println(Arrays.toString(scores)); 
      System.out.println("Highest: " + scores[scores.length - 1]);
      System.out.println("Lowest: " + scores[0]);   
      
      for (int i = 0; i < scores.length; ++i) {
         sum += scores[i];
      }
      average = (double)sum / scores.length;
      System.out.println("Average: " + average);
      for (int i = 0; i < scores.length; ++i) {
         if (scores[i] > average)  {
            ++numberAbove;
         } else if (scores[i] < average)  {
            ++numberBelow;
         } else {
            ++numberEqual;
         }
      }
      System.out.println("Above Average: " + numberAbove);
      System.out.println("Below Average: " + numberBelow);
      System.out.println("Equals Average: " + numberEqual);   
   
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
   
//    public static int[] mean(int[] arrayPassed) {
//      
//    }


}