import java.util.Scanner;

/**
 * @author  Override
 * @since   11/19/2023 15:38
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */

public class Goldbach_AW {
    public static void main(String[] args) {
        int n;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Enter a value that is greater than 2: ");
            n = keyboard.nextInt();
            goldBach(n);

            System.out.println("Again? Enter 1 for yes, and 0 for no: ");
        } while (continuePlaying(keyboard.nextInt()));

    }


    public static void goldBach(int n) {


        for (int i = 2; i <= n / 2; i++) {
            if (determineIfPrime(i) && determineIfPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
            }
        }

    }


    public static boolean continuePlaying(int value) {
        return value == 1;
    }
    public static boolean determineIfPrime(int valuePassed) {

        if (valuePassed <= 2) {
            return false;
            }
                for(int i = 2; i < Math.sqrt(valuePassed) + 1; ++i) {
                    if (valuePassed % i == 0) {
                        return false;
                    }
                }
                return true;
        }
    }

