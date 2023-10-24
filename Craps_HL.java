import java.util.Random;

public class Craps_HL {
   public static void main(String[] args) {
      int d1, d2, roll;   
      Random rng = new Random();            
      
      /*d1 = rng.nextInt(6) + 1; // + 1 makes the value not end no 0-5 instead 1-6 (like dice)
      d2 = rng.nextInt(6) + 1;
      roll = d1 + d2;*/
      
      roll = rng.nextInt(6) + rng.nextInt(6) + 2; //more efficient way instead of using up top values.
      
      System.out.println(roll);
      //roll = 33; (used for testing purposes on default case)
      switch (roll) {
         case 4, 5, 6, 8, 9, 10:
            System.out.println("You rolled: " + roll + ", Please roll again.");
            break;
        /* case 5:
            System.out.println("You rolled: " + roll + ", Please roll again");
            break;
         case 6:
            System.out.println("You rolled: " + roll + ", Please roll again");
            break;
         case 8:
            System.out.println("You rolled: " + roll + ", Please roll again");
            break;
         case 9:
            System.out.println("You rolled: " + roll + ", Please roll again");
            break;   
         case 10:
            System.out.println("You rolled: " + roll + ", Please roll again");
            break;*/
            //above is showing the way to write down everything, but you can just add (,) to each section and put it on one line
            
         case 7, 11:
            System.out.println("You rolled: " + roll + ", You lose.");
            break;
         /*case 11:
            System.out.println("You rolled: " + roll + ", You lose.");
            break;*/
         case 2, 3:
            System.out.println("You rolled: " + roll + ", You win!");
            break;
         /*case 3:
            System.out.println("You rolled: " + roll + ", You win!");
            break;*/
         case 12:
            System.out.println("You rolled: " + roll + ", neither win or lose.");
            break;
         default:
            System.out.println("You did not roll a valid number... STOP CHEATING!");
            break;
            
            //or you can do the following...
         
         /*case 4:
         case 5:
         case 6:
         case 8:
         case 9:
         case 10: 
            System.out.println("You rolled: " + roll + ", Please roll again.");
            break;
         case 7:
         case 11:
            System.out.println("You rolled: " + roll + ", You lose.");
            break;
         case 2:
         case 3:
            System.out.println("You rolled: " + roll + ", You win!");
            break;
         case 12:
            System.out.println("You rolled: " + roll + ", neither win or lose.");
            break;
         case default:
            System.out.println("You did not roll a valid number... STOP CHEATING!");
            break;*/
      
      
      }//end roll switch case      

   }//end method
}//end class 