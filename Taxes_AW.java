import java.util.Scanner;

public class Taxes_AW {
    public static void main(String[] args) throws Exception {
        float taxIn, firstBracket, secondBracket, thirdBracket, fourthBracket, fifthBracket, sixthBracket, seventhBracket;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your taxable income: ");
            taxIn = keyboard.nextFloat();

            //create if statement for tax, make sure that you include rate

        if (taxIn <= 20000) {
            firstBracket = (float) (taxIn * .01);
            System.out.printf("Your tax is: $%5.2f", firstBracket);
        } else if (taxIn <= 50000) {
            //less than 50000... so minus 20000
            secondBracket = (float) (20000 * .01 + (taxIn - 20000) * .02);
            System.out.printf("Your tax is: $%5.2f", secondBracket);
        } else if (taxIn <= 75000) {
            //less than 75000... so minus 50000
            thirdBracket = (float) (20000 * .01 + 30000 *.02 + (taxIn - 50000) * .03);
            System.out.printf("Your tax is: $%6.2f", thirdBracket);
        } else if (taxIn <= 100000) {
            //less than 100000... so minus 750000
            fourthBracket = (float) (20000 * .01 + 30000 * .02 + 25000 * .03 + (taxIn - 75000) * .04);
            System.out.printf("Your tax is: $%6.2f", fourthBracket);
        } else if (taxIn <= 250000) {
            //less than 100000... so minus 100000
            fifthBracket = (float) (20000 * .01 + 30000 * .02 + 25000 * .03 + 25000 * .04 + (taxIn - 100000) * .05);
            System.out.printf("Your tax is: $%6.2f", fifthBracket);
        } else if (taxIn <= 500000) {
            //less than 500000... so minus 250000
            sixthBracket = (float) (20000 * .01 + 30000 * .02 + 25000 * .03 + 25000 * .04 + 150000 * .05 + (taxIn - 250000) * .06);
            System.out.printf("Your tax is: $%6.2f", sixthBracket);

        } else if (taxIn > 500000) {
            //greater than 500000... so minus 500000
            seventhBracket = (float) (20000 * .01 + 30000 * .02 + 25000 * .03 + 25000 * .04 + 150000 * .05 + 250000 * .06 + (taxIn - 500000) * .07);
            System.out.printf("Your tax is: $%8.2f", seventhBracket);

        }//end if logic
    }//end main
}//end class
