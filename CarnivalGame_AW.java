import java.util.Random;

/**
 * @author Override
 * @since 11/12/2023 02:13
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */

public class CarnivalGame_AW {
    public static void main(String[] args) {
    int wins = 0;
    int lose = 0;
    int sum, dieOne, dieTwo, dieThree, dieFour, dieFive;


    for (int i = 0; i < 100; ++i) {
        dieOne = dieRoll(6);
        dieTwo = dieRoll(20);
        dieThree = dieRoll(8);
        dieFour = dieRoll(4);
        dieFive = dieRoll(12);
        sum = dieOne + dieTwo + dieThree + dieFour + dieFive;
        if (sum < 20 || sum > 35) {
            wins++;
        } else {
            lose++;
        }
        System.out.printf("Wins: %2d \t Loses: %d \t Sum: %d \n", wins, lose,sum);
    }



    }
    public static int dieRoll(int x) {
        Random RNG = new Random();
        return RNG.nextInt(x) + 1;
    }
}
