import java.util.Scanner;


public class FuelCost
{
   public static void main(String[] args)
   {
   
   Scanner keyboard = new Scanner(System.in);

   //adding input function along with asking the questions

   System.out.println("please enter your beginning odometer reading: ");

   int beginningOdometerReading = keyboard.nextInt();

   System.out.println("Please enter your ending odometer reading: ");

   int endingOdometerReading = keyboard.nextInt();

   System.out.println("Please enter how many gallons to fill your tank: ");

   int gallonToFillTank = keyboard.nextInt();

   System.out.println("Please enter the cost per gallon: ");

   double costPerGallonOfGas = keyboard.nextDouble();

   System.out.println("Please enter the number of miles driven per year: ");

   int numberMilesDrivenPerYear = keyboard.nextInt();

   
    //calculations for each input

   
   int milesTraveled = endingOdometerReading - beginningOdometerReading;
  
   double milesPerGallon = (double)milesTraveled / (double)gallonToFillTank;
   
   System.out.println("Miles Per Gallon: " + milesPerGallon);
   
   
   double fuelCostPerMile = (double) costPerGallonOfGas / (double)milesPerGallon;
   
   System.out.println("Fuel Cost Per Mile: " + fuelCostPerMile);
   
   double totalCostPerYear = (double)numberMilesDrivenPerYear * (double)fuelCostPerMile;


   System.out.println("Total Cost Per Year: " + totalCostPerYear);
   
   
   }

}
