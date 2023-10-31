/**
*Author: TuringProblem, 10/31/2023
*
*/

public class Investment_H02 {
   public static void main(String[] args) {
      double balance = 10000;
      double rate = .07; //this represents how much it goes up each year for the investment
      int years = 0;
      
      
      while (balance < 20000) {
         ++years;
         balance = balance + balance * rate; //this is my update, and will eventually make my balance above 20000.
         System.out.printf("Your balance: $%,1.2f \n", balance); //throwing this inside of the while loop to show progression
         System.out.println(years);
      }//end while
      System.out.printf("Your balance: $%,1.2f \n", balance); //use %, before the 1.2f in order to get 20,000
      
   }
}