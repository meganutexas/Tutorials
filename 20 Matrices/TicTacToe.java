package matrices;

import javax.swing.text.PlainDocument;
import java.util.Scanner;

public class TicTacToe {
    private final static int BOARD_DIM = 3;

    private final static char PLAYER_1 = 'O';
    private final static char PLAYER_2 = 'X';

    private final static char BASE_CHECKER = '_';

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] board = new char[BOARD_DIM][BOARD_DIM];
        setUpBoard(board);

        int move = 0;

        char checker = PLAYER_1;
        while (!checkForWin(PLAYER_1, board) &&
                !checkForWin(PLAYER_2, board) &&
                !boardFull(board)) {
            printBoard(board);

            System.out.print("Enter row then column for move: ");
            int row = scan.nextInt();
            int col = scan.nextInt();

            try {
                if (board[row][col] == BASE_CHECKER) {
                    board[row][col] = checker;
                    move++;
                    checker = move % 2 == 0 ? PLAYER_1 : PLAYER_2;
                } else {
                    System.out.println("Oops! That spot is already taken, try again.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Your row and column must be between " +
                        "0 and " + (BOARD_DIM - 1) + " inclusive.");
            }
        }

        printBoard(board);
        System.out.println();
        printWinner(board);
    }

    private static void printWinner(char[][] board) {
        if (checkForWin(PLAYER_1, board)) {
            System.out.println(PLAYER_1 + "s won!");
        } else if (checkForWin(PLAYER_2, board)) {
            System.out.println(PLAYER_2 + "s won!");
        } else {
            System.out.println("Cat's game!");
        }
    }

    public static void setUpBoard(char[][] board) {
        for (int row = 0; row < BOARD_DIM; ++row) {
            for (int col = 0; col < BOARD_DIM; ++col) {
                board[row][col] = BASE_CHECKER;
            }
        }
    }

    public static boolean checkForWin(char checker, char[][] board) {
        for (int row = 0; row < BOARD_DIM; row++) {
            char[] currentRow = board[row];

            if (currentRow[0] == checker &&
                    currentRow[1] == checker &&
                    currentRow[2] == checker) {
                return true;
            }
        }

        for (int col = 0; col < BOARD_DIM; ++col) {
            if (board[0][col] == checker &&
                    board[1][col] == checker &&
                    board[2][col] == checker) {
                return true;
            }
        }

        if (board[0][0] == checker &&
                board[1][1] == checker &&
                board[2][2] == checker) {
            return true;
        }

        if (board[0][2] == checker &&
                board[1][1] == checker &&
                board[2][0] == checker) {
            return true;
        }

        return false;
    }

    public static boolean boardFull(char[][] board) {
        for (int row = 0; row < BOARD_DIM; ++row) {
            for (int col = 0; col < BOARD_DIM; ++col) {
                if (board[row][col] == BASE_CHECKER) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for (int row = 0; row < BOARD_DIM; row++) {
            for (int col = 0; col < BOARD_DIM; ++col) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
