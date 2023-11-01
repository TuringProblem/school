/**
 * Author: @override
 * Date: 11/01/2023
 */
import java.util.Scanner;

public class Insipid_AW {
    public static void main(String[] args) {
        int n, number, hundred, tens, ones;
        Scanner keyboard = new Scanner(System.in);
        do {
            //ask the user for an input in a do-while loop
          do {
              System.out.println("Please enter a number 1-99: ");
              n = keyboard.nextInt();
          } while (n < 1 || n > 99);

          do {
              //if statement for IF the number is over 99
              if (n > 99) {

                  hundred = n / 100;
                  n = hundred % 100;
                  tens = n / 10;
                  ones = n % 10;
                  hundred *= hundred;
                  tens *= tens;
                  ones *= ones;
                  number = hundred + tens + ones;
                  System.out.println(number);

              } else {

                  tens = n / 10;
                  ones = n % 10;
                  tens *= tens;
                  ones *= ones;
                  number = tens + ones;
                  System.out.println(number);
              }
          } while (n != 58 && n != 1);
          if (n == 58 || n == 1){
              System.out.println("You have an insipid number!");
          }
          System.out.println("Do you want to enter another number? true or false: ");
        } while (true);
    }//end method
}//end class