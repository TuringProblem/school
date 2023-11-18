import java.util.Scanner;

/**
 * @author Override
 * @since 11/17/2023 22:34
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */


public class GCDLCM_AW {
    public static void main(String[] args) {
        int a, b;
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your first value: ");
        a = kb.nextInt();
        System.out.println("Please enter your second value: ");
        b = kb.nextInt();
        System.out.print("The GCD of " + a + " and " + b + " is: "+ GCD(a, b) + "\n");
        System.out.print("The LCM of " + a + " and " + b + " is: "+ LCM(a, b));




    }//end main method

    public static int GCD (int a, int b) {
        int r;
        if ( b > a) {
            r = a;
            a = b;
            b = r;
        }
        while (b != 0) {
            r = a;
            a = b;
            b = r % a;
        }

        return a;
    }//end method

    public static int LCM(int a, int b) {
        int lcm;
        lcm = (a * b) / GCD(a, b);
        return lcm;
    }//end method


}
