import java.util.Scanner;

/**
 * @author  Override
 * @since   11/21/2023 11:28
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */
public class GeometricMean_AW {
    public static void main(String[] args) {

        double year1 = 0, year2 = 0, year3 = 0, year4 = 0, year5 = 0, year6 = 0, investment;
        double geo = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the beginning value of the property:");
        investment = keyboard.nextDouble();
        
        
        System.out.println("Please enter the number of years you will hold the property: ");
        int years = keyboard.nextInt();
      

        switch (years) {
            case 6:
                System.out.println("Please enter the year 6 change: ");
                year6 = keyboard.nextDouble();
            case 5:
                System.out.println("Please enter the year 5 change: ");
                year5 = keyboard.nextDouble();
            case 4:
                System.out.println("Please enter the year 4 change: ");
                year4 = keyboard.nextDouble();
            case 3:
                System.out.println("Please enter the year 3 change: ");
                year3 = keyboard.nextDouble();
            case 2:
                System.out.println("Please enter the year 2 change: ");
                year2 = keyboard.nextDouble();
            case 1:
                System.out.println("Please enter the year 6 change: ");
                year1 = keyboard.nextDouble();
                break;
            default:
                System.exit(0);

        }//end switch

        switch(years) {
            case 1:
                geo = year1;
                break;
            case 2:
                geo = geometricMean(year1, year2);
                break;
            case 3:
                geo = geometricMean(year1, year2, year3);
                break;
            case 4:
                geo = geometricMean(year1, year2, year3, year4);
                break;
            case 5:
                geo = geometricMean(year1, year2, year3, year4, year5);
                break;
            case 6:
                geo = geometricMean(year1, year2, year3, year4, year5, year6);
                break;
            default:
                System.exit(0);
        }

        System.out.println("The geometric mean is: " + geo);
        for (int i = 0; i < years; ++i) {
            investment = investment * geo;
        }
        System.out.printf("The ending investment value is $%,1.2f\n", investment);





    }

    public static double geometricMean(double y1, double y2) {
        return Math.pow(y1 * y2, 1 / 2.0);
    }//method 3

    public static double geometricMean(double y1, double y2, double y3) {
        return Math.pow(y1 * y2 * y3, 1 / 3.0);
    }//method 3

    public static double geometricMean(double y1, double y2, double y3, double y4) {
        return Math.pow(y1 * y2 * y3 * y4, 1 / 4.0);
    }//method 4

    public static double geometricMean(double y1, double y2, double y3, double y4, double y5) {
        return Math.pow(y1 * y2 * y3 * y4 * y5, 1 / 5.0);
    }//method 5

    public static double geometricMean(double y1, double y2, double y3, double y4, double y5, double y6) {
        return Math.pow(y1 * y2 * y3 * y4 * y5 * y6, 1 / 6.0);
    }//method 6
}