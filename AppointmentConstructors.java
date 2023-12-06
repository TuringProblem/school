import java.util.Scanner;

/**
 * @author Override
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 * @since 12/2/2023 16:02
 */

public class AppointmentConstructors {
    Scanner keyboard = new Scanner(System.in);
    private String month;
    private int day, year, hour, minute;

    public AppointmentConstructors() {
        this.month = "null";
        this.day = 0;
        this.year = 0;
        this.hour = 0;
        this.minute = 0;
    }

    public AppointmentConstructors(String monthPassed, int dayPassed, int yearPassed, int hourPassed, int minutePassed) {
        this.setMonth(monthPassed);

        this.setYear(yearPassed);
        if(monthPassed.equals("February")) {
            if (yearPassed % 4 == 0) {
                do {
                    System.out.println("LEAP YEAR!\n Please enter a new day for this month: ");
                    dayPassed = keyboard.nextInt();
                    this.setDay(dayPassed);
                } while (dayPassed <= 29);
            }
            if (yearPassed % 4 != 0 ) {
                while (dayPassed > 28) {
                    System.out.println("Please enter a new day for this month: ");
                    dayPassed = keyboard.nextInt();
                    this.setDay(dayPassed);
                }
            }
        }
        this.setDay(dayPassed);
        this.setHour(hourPassed);
        this.setMinute(minutePassed);

    }

    public String getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getHour() {
        return this.hour;
    }

    public int getYear() {
        return this.year;
    }

    public int getMinute() {
        return this.minute;
    }

    //the setter for the month must determine if the
    //month passed is a valid month
    //(January - December), if not
    //trap the user until they enter a valid month
    public void setMonth(String monthPassed) {
        while (!monthPassed.equals("January") && !monthPassed.equals("February") && !monthPassed.equals("March") && !monthPassed.equals("April") && !monthPassed.equals("May") && !monthPassed.equals("June") && !monthPassed.equals("July") && !monthPassed.equals("August") && !monthPassed.equals("September") && !monthPassed.equals("October") && !monthPassed.equals("November") && !monthPassed.equals("December")) {
            System.out.println("Please enter a new month (EXAMPLE: September): ");
            monthPassed = keyboard.nextLine();
        }

        this.month = monthPassed;
    }

    public void setDay(int dayPassed) {
        //add the date validater :o
        while (dayPassed < 0 || dayPassed > 31) {
            System.out.println("That number is invalid! \n Please enter a number greater than 0, \n and less than 31.");
            dayPassed = keyboard.nextInt();
        }
        this.day = dayPassed;
    }

    public void setMinute(int minutePassed) {
        while (minutePassed < 0 || minutePassed > 59) {
            System.out.println("That number is invalid! \n Please enter a number 0-59: ");
            minutePassed = keyboard.nextInt();
        }
        this.minute = minutePassed;

    }
    //the setter for hour must confirm that the hour is
    //between 0 and 23 (inclusive) if it is not
    //trap the user until they enter a valid hour


    public void setHour(int hourPassed) {
        while (hourPassed < 0 || hourPassed > 23) {
            System.out.println("That number is invalid!\n Please enter a number greater than 0,\n and less than 23: ");
            hourPassed = keyboard.nextInt();
        }
        this.hour = hourPassed;
    }

    //the setter for year must confirm that the year
    //is >= 0 and <= 2023, if it is not
    //trap the user until they enter a valid year


    public void setYear(int yearPassed) {
        if (yearPassed < 0 || yearPassed > 2023) {
            do {
                System.out.println("Please enter a new year: ");
                yearPassed = keyboard.nextInt();
            } while (yearPassed < 0 || yearPassed > 2023);
        }

        this.year = yearPassed;

    }

    //toString method

    public String toString() {
        return "\nMonth: " + this.getMonth() +
                "\nDay: " + this.getDay() +
                "\nYear: " + this.getYear() +
                "\nHour: " + this.getHour() +
                "\nMinute: " + +this.getMinute();
    }

    //String monthPassed, int dayPassed, int yearPassed, int hourPassed, int minutePassed
    public boolean equals(AppointmentConstructors appointmentPassed) {
        return this.getMonth().equals(appointmentPassed.getMonth()) &&
                this.getDay() == appointmentPassed.getDay() &&
                this.getYear() == appointmentPassed.getYear() &&
                this.getHour() == appointmentPassed.getHour() &&
                this.getMinute() == appointmentPassed.getMinute();
    }


}
