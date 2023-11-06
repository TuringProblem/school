/**
 * @author Override
 * @see 11/6/2023 12:13
 * <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Rectangle r1 = new Rectangle();

        int areaOfInstance;
        r1.about();
        areaOfInstance = r1.area();
        System.out.println(areaOfInstance);
    }
}