import java.util.Scanner;

/**
 * @author Override
 * @since   11/19/2023 03:48
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */


public class PrimeNumbers_AW {
    public static void main(String[] args) {
        int a, b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first value: ");
        a = keyboard.nextInt();

        System.out.println("You're number is prime: " + determineIfPrime(a));
        System.out.println("You're sophie germain number is prime: " + isSophieGermainPrime(a));
        System.out.println("You're twin number is prime: " + isTwinPrime(a));
        System.out.println("You're mersenne number is prime: " + isMersennePrime(a));
    }

    public static boolean isSophieGermainPrime(int number) {
        return determineIfPrime(number) && determineIfPrime(2 * number + 1);
    }
   public static boolean isTwinPrime(int number) {
       return determineIfPrime(number) && determineIfPrime(number + 2);
   }
    public static boolean isMersennePrime(int number) {
        return determineIfPrime(number) && determineIfPrime(2 * number - 1);
    }

    public static boolean determineIfPrime(int valuePassed) {
        boolean isPrime = true;
        if (valuePassed < 2) {
            isPrime = false;
        } else {
            if (valuePassed == 2) {
                isPrime = true;
            } else {
                for(int i = 2; i < Math.sqrt(valuePassed) + 1; ++i) {
                    if (valuePassed % i == 0) {
                        return false;
                    }
                }
            }
        }
        return isPrime;
    }

}
