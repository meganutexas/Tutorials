package conditionalsAndClassConstants;

public class RockPaperScissors {
    final private static String PAPER = "paper";
    final private static String ROCK = "rock";
    final private static String SCISSORS = "scissors";

    public static void main(String[] args) {
        System.out.println(determineWinner(PAPER, PAPER));
        System.out.println(determineWinner(ROCK, SCISSORS));
        System.out.println(determineWinner(SCISSORS, ROCK));
        System.out.println(determineWinner(PAPER, ROCK));
        System.out.println(determineWinner(ROCK, PAPER));
        System.out.println(determineWinner(SCISSORS, PAPER));
        System.out.println(determineWinner(PAPER, SCISSORS));
    }

    public static String determineWinner(String player1,
                                         String player2) {
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
