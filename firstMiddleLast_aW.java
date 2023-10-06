import java.util.Scanner;
import java.lang.String;

public class firstMiddleLast_aW {
    public static void main(String[] args) {
        String firstName, middleName, lastName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = keyboard.next();
        System.out.println("Enter your middle name: ");
        middleName = keyboard.next();
        System.out.println("Enter your last name: ");
        lastName = keyboard.next();
        //turn into int
        String f = firstName;
        String m = middleName;
        String l = lastName;
        f = String.valueOf((int)f.length());
        System.out.println(f);
        m = String.valueOf((int)m.length());
        System.out.println(m);
        l = String.valueOf((int)l.length());
        System.out.println(l);
        //to uppercase
        firstName = firstName.toUpperCase();
        middleName = middleName.toUpperCase();
        lastName = lastName.toUpperCase();
        System.out.printf("%s %s %s \n", firstName, middleName, lastName);
        //get the char
        firstName = String.valueOf((char)firstName.charAt(0));
        middleName = String.valueOf((char)middleName.charAt(0));
        lastName = String.valueOf((char)lastName.charAt(0));
        System.out.printf("%s%s%s \n", firstName, middleName, lastName);
        //ASCII calculations for char

        //figure out the solution for the ASCII part
         System.out.println(firstName);
        /*firstName = 'M';
        middleName = 'M';
        lastName = 'M';*/



    }
}