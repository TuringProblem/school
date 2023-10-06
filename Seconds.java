import java.util.Scanner;


public class Seconds
{
   public static void main(String[] args) 
   {
   //add variables
   
   int secondsPerYear, secondsPerDay, secondsPerHour, secondsPerMinute;
   
   //add the input method
   
   Scanner keyboard = new Scanner(System.in);
   int seconds = keyboard.nextInt();
   
   //solve the equation for years, days, hours, minutes, and seconds
   
   secondsPerYear = seconds / (365 * 24 * 60 * 60);
   seconds = seconds % (365 * 24 * 60 * 60);
   secondsPerDay = seconds / (24 * 60 * 60);
   seconds = seconds % (24 * 60 * 60);
   secondsPerHour = seconds / (60 * 60);
   seconds = seconds % (60 * 60);
   secondsPerMinute = seconds / 60; 
   seconds = seconds % 60;
   seconds = seconds;
    
 
   //print out the input in seconds
   
   System.out.println("Years: " + secondsPerYear);
   System.out.println("Days: " + secondsPerDay);
   System.out.println("Hours: " + secondsPerHour);
   System.out.println("Minutes: " + secondsPerMinute);
   System.out.println("Seconds: " + seconds);

   }//end main
}//end class