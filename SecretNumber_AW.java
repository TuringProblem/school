/**
 * @author Override
 * @since 11/4/2023
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */

public class SecretNumber_AW {
    public static void main(String[] args){
        int thousands, hundreds, tens, ones;
        for (int i = 1000; i <= 9999; i++) {
            thousands = i / 1000;
            hundreds = (i % 1000) / 100;
            tens = (i % 100) / 10;
            ones = i % 10;

            System.out.println(thousands + "\t" + hundreds + "\t" + tens + "\t" + ones);
            //test to see if all digits are different
            if (thousands != hundreds && thousands != tens && thousands != ones && hundreds != tens && hundreds != ones && tens != ones) {
                //digit in the thousands place is 3x the digit in the tens place
                if (thousands * 3 == tens) {
                    //the number is odd? %2 and get back 1 it's an odd number
                    if (i % 2 != 0) {
                        //sum of the numbers are == 27, add them up and test to see if == 27
                        if (thousands + hundreds + tens + ones == 27) {
                            System.out.println("The secret that you have been searching for is: " + i);
                            break;
                        }
                    }
                }
            }
        }
    }
}
