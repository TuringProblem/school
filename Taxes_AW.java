import java.util.Scanner;

public class Taxes_AW {
    public static void main(String[] args) throws Exception {
        float taxIn, firstTax, secondTax, thirdTax, fourthTax, fifthTax, sixthTax, seventhTax;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your taxable income: ");
            taxIn = keyboard.nextFloat();

            //create if statement for tax, make sure that you include rate

        if (taxIn > 0 && taxIn <= 20000) {
            firstTax = (float) (taxIn * .01);
            System.out.printf("Your tax is: $%5.2f \n", firstTax);
        } else if (taxIn > 20000 && taxIn <= 50000) {
            secondTax = (float) ((30000 - taxIn) * .02);
            System.out.printf("Your tax is: $%7.2f \n", secondTax);
        } else if (taxIn > 50000 && taxIn <= 75000) {
            taxIn = (float) (taxIn * .03);
            System.out.printf("Your tax is: $%7.2f \n",taxIn);
        } else if (taxIn > 75000 && taxIn <= 100000) {
            taxIn = (float) (taxIn * .04);
            System.out.printf("Your tax is: $%7.2f\n", taxIn);
        } else if (taxIn > 100000 && taxIn <= 250000) {
            taxIn = (float) (taxIn * .05);
            System.out.printf("Your tax is: $%7.2f\n", taxIn);
        } else if (taxIn > 250000 && taxIn <= 500000) {
            taxIn = (float) (taxIn * .06);
            System.out.printf("Your tax is: $%7.2f \n", taxIn);
        } else if (taxIn > 500000) {
            taxIn = (float) (taxIn * .07);
            System.out.printf("Your tax is: $%7.2f \n", taxIn);
        }//end if logic
    }//end main
}//end class
