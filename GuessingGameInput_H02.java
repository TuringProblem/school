import java.util.Scanner;
import java.util.Random;

public class GuessingGameInput_H02 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      Random rng = new Random();
      int randomNumber = rng.nextInt(100) + 1;
      int guess;
      
      System.out.println(randomNumber);
      
      do {
         System.out.println("Please enter your guess: ");
         guess = keyboard.nextInt();
         System.out.println("Please guess again!");
         //if was example below, you don't need to add that clearly it works :P but if you do then you can! (Might be applicable for certain things.
         
         /*if (guess != randomNumber) {
            System.out.println("Please guess again!");
         }*/ 
      
      
      
      } while(guess != randomNumber);//finish do-while loop
      
      System.out.println("Nice! You guessed right, it was " + guess);
   
   
   }//end method

}//end class