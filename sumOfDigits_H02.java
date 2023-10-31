/**
*Author: TuringProblem, 10/31/2023
*
*/

public class sumOfDigits_H02 {
   public static void main(String[] args) {
      int n = 12345;
      int sumOfDigits = 0;
      
      while (n > 0) {
         sumOfDigits = sumOfDigits + n % 10;
         n = n / 10;
         
         
      }//end while
        
      System.out.println(sumOfDigits);
   
   }//end method
}//end class