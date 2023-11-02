/**
 * Author: @override
 * Date: 11/01/2023
 */
import java.util.Scanner;

public class Insipid_AW {
    public static void main(String[] args) {
        int n, tens, ones, hundreds;
        boolean exit;
        Scanner keyboard = new Scanner(System.in);
        do {
            //ask the user for an input in a do-while loop
            do {
                System.out.println("Please enter a number 1-99: ");
                n = keyboard.nextInt();
            } while (n < 1 || n > 99);

            do {
                ones = n % 10;
                //System.out.println(ones);
                n = n / 10;
                tens = n;
                //System.out.println(tens);
                tens *= tens;
                System.out.println(tens);
                ones *= ones;
                System.out.println(ones);
                n = ones + tens;
                System.out.println(n);
                if (n > 99) {
                    hundreds = n / 100;
                    //System.out.println(hundreds);
                    n = n % 100;
                    tens = n / 10;
                    //System.out.println(tens);
                    ones = n % 10;
                    hundreds *= hundreds;
                    tens *= tens;
                    ones *= ones;
                    System.out.println(ones);
                    n = hundreds + tens + ones;
                    System.out.println(n);
                }

            } while (n != 58 && n != 1);

            if (n == 58) {
                System.out.println("The number is: Not insipid.");
            }
            System.out.println("You have an insipid number!");
            System.out.println("Do you want to enter another number? true or false: ");
            exit = keyboard.nextBoolean();


        } while (exit);
    }//end method
}//end class