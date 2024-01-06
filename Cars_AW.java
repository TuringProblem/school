import java.util.Scanner;
/**
 * @author Override
 * @since 12/12/2023 22:34
 * @see <a href="https://Github.com/TuringProblem">GitHub Profile</a>
 */

public class Cars_AW {

    public static char[] board;
    public static int c;
    public static int f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Let’s Play the Moving Day Game ----");
        System.out.print("Please enter the number of Chevy's: ");
        c = scanner.nextInt();
        System.out.print("Please enter the number of Fords: ");
        f = scanner.nextInt();

        initializeBoard();
        boolean gameOver = false;

        while (!gameOver) {
            showBoard();
            System.out.print("Choose move: ");
            int move = scanner.nextInt();

            if (!moveCar(move)) {
                System.out.println("Invalid move!");
                continue;
            }

            if (checkWin()) {
                System.out.println("Congratulations! You win!");
                gameOver = true;
            } else if (!canCarMove()) {
                System.out.println("Game Over! You lose!");
                gameOver = true;
            }
        }

        scanner.close();
    }

    private static void initializeBoard() {
        board = new char[c + f + 1];
        for (int i = 0; i < c; i++) board[i] = 'C';
        board[c] = ' ';
        for (int i = c + 1; i < c + f + 1; i++) board[i] = 'F';
    }




    private static boolean moveCar(int position) {
        if (position < 0 || position >= board.length || board[position] == ' ') {
            return false;
        }

        char car = board[position];
        //direction is  C? true = 1 and if f? true = -1 else direction is 0
        int direction = (car == 'C') ? 1 : (car == 'F') ? -1 : 0;

        // Check for slide and jump move
        if (isValidPosition(position + direction) && board[position + direction] == ' ') {
            board[position + direction] = car;
            board[position] = ' ';
            return true;
        }
        if (isValidPosition(position + 2 * direction) && board[position + 2 * direction] == ' ' && board[position + direction] != ' ' && board[position + direction] != car) {
            board[position + 2 * direction] = car;
            board[position] = ' ';
            return true;
        }

        return false;
    }



    private static boolean canCarMove() {
        for (int i = 0; i < board.length; i++) {
            char car = board[i];
            if (car == 'C' || car == 'F') {
                int direction = (car == 'C') ? -1 : 1;

                // Check for slide and jump
                if (isValidPosition(i + direction) && board[i + direction] == ' ') {
                    return true;
                }

                if (isValidPosition(i + 2 * direction) && board[i + 2 * direction] == ' ' && board[i + direction] != ' ' && board[i + direction] != car) {
                    return true;
                }

            }

        }
        return false;
    }


    private static boolean isValidPosition(int position) {
        return position >= 0 && position < board.length;
    }


    private static boolean checkWin() {
        for (int i = 0; i < c; ++i) {
            if (board[i] != 'C') {
                return false;
            }
        }
        if (board[c] != ' ') return false;
        for (int j = c + 1; j < board.length; ++j) {
            if (board[j] != 'F') return false;
        }
        return true;
    }

    private static void showBoard() {
        for (char value : board) {
            System.out.print(" | " + value);
        }
        System.out.println(" |");
    }
}
