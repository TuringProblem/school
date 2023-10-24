import java.util.Scanner;

public class TwelveDays_HL1 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int day;
      
      System.out.println("Please enter the day, 1 - 12.");
      day = keyboard.nextInt();
      

      if (day == 1) {
         System.out.printf("On the %dst day of Christmas, my true love sent to me \n", day);
      } else if (day == 2) {
         System.out.printf("On the %dnd day of Christmas, my true love sent to me \n", day);
      } else if (day == 3) {
         System.out.printf("On the %drd day of Christmas, my true love sent to me \n", day);
      } else {
         System.out.printf("On the %dth day of Christmas, my true love sent to me \n", day);
      }
            
      switch (day) {
         case 12:
            System.out.println("Twelve drummers drumming");
         case 11:
            System.out.println("Eleven pipers piping");
         case 10:
            System.out.println("Ten lords a-leaping");
         case 9:
            System.out.println("Nine ladies dancing");
         case 8:
            System.out.println("Eight mads a-milking");
         case 7:
            System.out.println("Seven swans a-swimming");
         case 6:
            System.out.println("Six geese a-laying");
         case 5:
            System.out.println("Five GOLDEN RIIIIIINGS!");
         case 4:
            System.out.println("Four calling birds");
         case 3:
            System.out.println("Three french hens");
         case 2:
            System.out.println("Two turtle doves, and");
         case 1:
            System.out.println("A partidge in a pear tree");
            break;
         default:
            System.out.println("COAL!"); 
                 
      }//end switch statement  
   }//end method
}//end class