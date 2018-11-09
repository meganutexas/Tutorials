package userInput;

import java.util.Scanner;

public class RockPaperScissorsUpdated {
    final private static String PAPER = "paper";
    final private static String ROCK = "rock";
    final private static String SCISSORS = "scissors";

    final private static String YES = "y";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(determineWinner(scan));

        String answer;
        System.out.print("\nWould you like to play again? [y/n]: ");
        answer = scan.next();

        while (answer.equals(YES)) {
            System.out.println(determineWinner(scan));
            System.out.print("\nWould you like to play again? [y/n]: ");
            answer = scan.next();
        }
    }

    public static String determineWinner(Scanner scan) {
        System.out.print("Enter player 1's move: ");
        String player1 = scan.next();
        System.out.print("Enter player 2's move: ");
        String player2 = scan.next();

        if (player1.equals(player2)) {
            return "tie game";
        } else if (player1.equals(ROCK) && player2.equals(SCISSORS)) {
            return "player 1 wins - rock beats scissors";
        } else if (player2.equals(ROCK) && player1.equals(SCISSORS)) {
            return "player 2 wins - rock beats scissors";
        } else if (player1.equals(PAPER) && player2.equals(ROCK)) {
            return "player 1 wins - paper covers rock";
        } else if (player2.equals(PAPER) && player1.equals(ROCK)) {
            return "player 2 wins - paper covers rock";
        } else if (player1.equals(SCISSORS) && player2.equals(PAPER)) {
            return "player 1 wins - scissors cuts paper";
        } else {
            return "player 2 wins - scissors cuts paper";
        }
    }
}
