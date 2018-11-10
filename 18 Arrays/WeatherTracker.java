package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] temps = getTemps(scan);
        System.out.println("Average temp was: " + getAverageTemp(temps));
        printTwoColdestAndHottestDays(temps);
    }

    public static int[] getTemps(Scanner scan) {
        System.out.print("Enter days to keep track of the weather: ");
        int[] temps = new int[scan.nextInt()];

        for (int i = 0; i < temps.length; ++i) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scan.nextInt();
        }

        return temps;
    }

    public static double getAverageTemp(int[] temps) {
        double sum = 0.0;

        for (int i = 0; i < temps.length; ++i) {
            sum += temps[i];
        }

        return sum / temps.length;
    }

    public static void printTwoColdestAndHottestDays(int[] temps) {
        Arrays.sort(temps);
        int length = temps.length;

        if (length == 1) {
            System.out.println("Only one day at: " + temps[0]);
        } else {
            System.out.println("2 coldest days: " + temps[0] +
                    " " + temps[1]);

            System.out.println("2 hottest days: " + temps[length-2] +
                    " " + temps[length - 1]);
        }
    }
}
