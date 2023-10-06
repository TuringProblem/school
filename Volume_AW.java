import java.util.Scanner;
import java.lang.Math;

public class Volume_AW {
   public static void main(String[] args) {
      double userRadius, userHeight, volume, pi, gallonsToFill;
      float conversion;

      pi = Math.PI;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("Please type a value for the radius in inches: ");
      userRadius = keyboard.nextDouble();
      conversion = (float)userRadius / 12;
      System.out.println(conversion + " = ft.");
      System.out.println("Please type a value for the height in feet: ");
      userHeight = keyboard.nextDouble();

      //calculate the volume
      volume = pi * (conversion * conversion) * userHeight;

      //need to calculate for the 1ft^3 to 7.48 gallons to fill
      gallonsToFill = volume * 7.48;
      System.out.println("There are " + gallonsToFill + "(gal.) in that cylinder.");

   }
}