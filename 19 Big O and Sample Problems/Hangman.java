package bigOAndSampleProblems;

import java.util.Scanner;

public class Hangman {
    private static final String ANSWER = "Hello World";
    private static final int WRONG_GUESSES = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Hangman!\n");
        System.out.print("Enter a letter: ");
        String guess = scan.next(); // is a single letter String
        checkGuessIsSingleLetter(guess);
        playHangman(guess, scan);

    }

    public static void playHangman(String guess, Scanner scan) {
        String[] guessTracker = getAlphabet();
        String correctGuesses = "";

        // checking for correct guess or not
        char guessChar = guess.charAt(0);
        char toSubtract = isLowerCase(guessChar) ? 'a' : 'A';
        if (contains(ANSWER, guess)) {
            correctGuesses += guess;
            guessTracker[guessChar - toSubtract] = "1";
        } else {
            System.out.println("The world does not contain a " + guess + ", try again");
            guessTracker[guessChar - toSubtract] = "0";
        }

        String asterisksAdd = insertAsterisksForMissingLetters(correctGuesses);

        // while haven't won and having lost yet
        while (countAskerisks(asterisksAdd) > 0 &&
                countWrongGuesses(guessTracker) < WRONG_GUESSES) {
            System.out.println("Word so far: " + asterisksAdd);

            System.out.print("\nEnter a letter: ");
            guess = scan.next(); // single letter String
            checkGuessIsSingleLetter(guess);

            // checking for correct guess or not
            guessChar = guess.charAt(0);
            toSubtract = isLowerCase(guessChar) ? 'a' : 'A';
            if (alreadyGuessed(guessTracker, guessChar)) {
                System.out.println("Already guessed that letter, try again");
            } else {
                if (contains(ANSWER, guess)) {
                    correctGuesses += guess;
                    guessTracker[guessChar - toSubtract] = "1";
                } else {
                    System.out.println("The world does not contain a " + guess + ", try again");
                    guessTracker[guessChar - toSubtract] = "0";
                }

                asterisksAdd = insertAsterisksForMissingLetters(correctGuesses);
            }
        }

        if (countAskerisks(asterisksAdd) == 0) {
            System.out.println("\nYOU WON!");
        } else {
            System.out.println("\nYou lost :(");
        }
    }

    public static void checkGuessIsSingleLetter(String guess) {
        if (guess.length() != 1) {
            throw new IllegalArgumentException("Guess can only be one letter long");
        }
    }

    public static boolean alreadyGuessed(String[] guessTracker, char guessChar) {
        char toSubract = isLowerCase(guessChar) ? 'a' : 'A';
        String guessFromTracker = guessTracker[guessChar - toSubract];

        if (guessFromTracker.equals("0") || guessFromTracker.equals("1")) {
            return true;
        }

        return false;
    }

    // assumption: toCheck is a single character string
    public static boolean contains(String base, String toCheck) {
        for (int i = 0; i < base.length(); ++i) {
            String currentBase = base.substring(i, i+1);
            if (currentBase.equalsIgnoreCase(toCheck)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isLowerCase(char guessChar) {
        return guessChar >= 'a' && guessChar <= 'z';
    }

    public static String[] getAlphabet() {
        String[] alphabet = new String[26];

        for (int i = 'A'; i <= 'Z'; ++i) {
            alphabet[i - 'A'] = ((char) i) + "";
        }

        return alphabet;
    }

    public static String insertAsterisksForMissingLetters(String correctGuesses) {
        String asterisksAdded = "";

        for (int i = 0; i < ANSWER.length(); ++i) {
            String current = ANSWER.substring(i, i+1);
            if (contains(correctGuesses, current) ||
                    current.equals(" ")) {
                asterisksAdded += current;
            } else {
                asterisksAdded += "*";
            }
        }

        return asterisksAdded;
    }

    public static int countWrongGuesses(String[] getAlphabet) {
        int count = 0;

        for (int i = 0; i < getAlphabet.length; ++i) {
            if (getAlphabet[i].equals("0")) {
                ++count;
            }
        }

        return count;
    }

    public static int countAskerisks(String askerisksAdded) {
        int count = 0;

        for (int i = 0; i < askerisksAdded.length(); ++i) {
            if (askerisksAdded.charAt(i) == '*') {
                ++count;
            }
        }

        return count;
    }
}
