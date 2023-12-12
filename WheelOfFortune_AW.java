import java.util.Scanner;
import java.util.Arrays;


public class WheelOfFortune_AW {
   public static void main(String[] args) {
      //instance of the class Scanner      
      Scanner keyboard = new Scanner(System.in);
    
      //grab from the user a String value
      String userInput;
      char userInputChar;
      int userInputAscii, position;
      int[] frequency = new int[26];
      System.out.println("Enter a line of text: ");
      userInput = keyboard.nextLine();
      Arrays.fill(frequency, 0);
      System.out.println(Arrays.toString(frequency));
      
      userInput = userInput.toUpperCase();
      
      for (int i = 0; i < userInput.length(); ++i) { 
         //need to find character
         userInputChar = userInput.charAt(i);
         
         //need to find the associated ascii value for the char
         userInputAscii = (int)userInputChar;
         
         //subtract 65 from the ascii
         position = userInputAscii - 65;
         if(position >= 0 && position <= 25) {
            //increment the position
            ++frequency[position];
         }

      }
      System.out.println(Arrays.toString(frequency));
      
      for (int i = 0; i < frequency.length; ++i) {          
            System.out.println((char)(i + 65) + ": " + frequency[i]);
        
      }
            
      
   }//end main method


}//end class