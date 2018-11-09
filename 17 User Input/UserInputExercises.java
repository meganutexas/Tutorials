package userInput;

import java.util.Scanner;

public class UserInputExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //printTaller(scan);
        //System.out.println(areDistinct(scan));
        //System.out.println(timeAndMoneyForLunch(scan));
        System.out.println(isPalindrome(scan));
    }

    public static void printTaller(Scanner scan) {
        System.out.print("Enter 2 heights in inches: ");
        int height1 = scan.nextInt();
        int height2 = scan.nextInt();

        if (height1 > height2) {
            System.out.println("Person 1 is taller");
        } else if (height2 > height1) {
            System.out.println("Person 2 is taller");
        } else {
            System.out.println("Person 1 and Person 2 are " +
                    "the same height");
        }
    }

    public static boolean areDistinct(Scanner scan) {
        System.out.print("Enter 3 numbers: ");
        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();

        return !(one == two || two == three || one == three);
    }

    public static boolean timeAndMoneyForLunch(Scanner scan) {
        System.out.print("Enter distance to restaurant: ");
        double distance = scan.nextDouble();
        System.out.print("Enter walking speed; ");
        double speed = scan.nextDouble();
        System.out.print("Enter time to finish meal: ");
        double eatingTime = scan.nextDouble();
        System.out.print("Enter time available: ");
        double timeAvailable = scan.nextDouble();
        System.out.print("Enter cost of meal: ");
        double cost = scan.nextDouble();
        System.out.print("Enter money available: ");
        double money = scan.nextDouble();

        double totalTime = (distance / speed) + eatingTime;

        return totalTime <= timeAvailable && cost <= money;
    }

    public static boolean isPalindrome(Scanner scan) {
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        word = word.replace(" ", "");

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            ++start;
            --end;
        }

        return true;
    }
}
