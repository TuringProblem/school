import java.util.Scanner;

public class Appointment {
   Scanner KEYBOARD = new Scanner(System.in);
   private String month;
   private int day;
   private int year;
   private int hour;
   private int minute;

   //default method   
   public Appointment() {
      this.month = "unknown";
      this.day = 0;
      this.year = 0;
      this.hour = 0;
      this.minute = 0;
   }
   
    //1 non-default constructor that accepts arguments for all instance variables, your constructor must call the setter methods below to set the values of the instance variables
   
    public Appointment(String monthPassed, int dayPassed, int yearPassed, int hourPassed, int minutePassed) {
      return this.month = setMonth(monthPassed) +
              this.day = setDay(dayPassed) +
              this.year = setYear(yearPassed) +
              this.hour = setHour(hourPassed) +
              this.minute = setMinute(minutePassed);


    }
   
   //5 setter methods (one for each instance variable) with these limits:
   
   //the setter for the month must determine if the 
   //month passed is a valid month 
   //(January - December), if not 
   //trap the user until they enter a valid month
   
   public void setMonth(String monthPassed) {
   
      while (monthPassed.equals("January") == false && monthPassed.equals("February") == false) {
         System.out.println("Invalid month, please re-enter the month: ");
         monthPassed = KEYBOARD.nextLine();
      }
      
      this.month = monthPassed;
   }
   
    
   
   //the setter for hour must confirm that the hour is 
   //between 0 and 23 (inclusive) if it is not
   //trap the user until they enter a valid hour
   
   public void setHour(int hourPassed) {
    Scanner KEYBOARD = new Scanner(System.in);
    while(hourPassed < 0 || hourPassed > 23) {
      System.out.println("Invalid hour please re-enter: ");
      hourPassed = KEYBOARD.nextInt();
    }
    this.hour = hourPassed;
   }
   
    
   
   //the setter for year must confirm that the year 
   //is >= 0 and <= 2023, if it is not
   //trap the user until they enter a valid year
   
   public void setYear(int yearPassed) {
      this.year = yearPassed;
   
   }
   
    
   
   //the setter for minute must confirm that the 
   //minute is between 0 and 59 (inclusive) if it is 
   //not trap the user until they enter a valid minute
   
   public void setMinute(int minutePassed) {
      this.minute = minutePassed;
   
   }
   
    
   
   //the setter for day must confirm that the 
   //day is a valid day for the month and year passed
   //if it is not trap the user to enter a valid day for the month
   //and year passed to the method (i.e. do not have the user
   //reenter the month and year, they are to reenter the day only)
   //remember to check if the year is a leap year
   
   public void setDay(int dayPassed, String monthPassed, int yearPassed) {
        this.day = dayPassed;
   }
   
    
   
   //5 getter methods (one for each instance variable) that return the value of the variable
   
   public String getMonth() {
   }
   public int getDay() {
   }
   public int getYear(); {
   }
   
   public int getHour(); {
   }
   
   public int getMinute(); {
   }
   //1 toString method
   
    public String toString() {
    
    }
   
   //1 equals method
   
    public boolean equals(Appointment appointmentPassed) {
   
    }
   
   //This program (Appointment) will compile but not run (it serves as the architecture of the class), it does not to have a main method.
   
   //I strongly suggest that you write a separate  program (one that has a main method) to test your code Appointment.java. In that main method you should  create an instance of the class with valid arguments and then another instance with invalid arguments. If you have written Appointment.java correctly the attempt to create an instance with invalid arguments will result in the user being asked to enter valid data. You should also call the toString and equals methods.
   
    
   
   //Or simply add this main method to your code and then run your code:
   
   public static void main(String[] args)
   {
   Appointment a1 = new Appointment();
   System.out.println(a1.toString());
   Appointment a2 = new Appointment("June", 30, 2023, 23, 59);
   System.out.println(a2.toString());
   
   }//end main

}