package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        //printPowers(2, 4);

        //Scanner scan = new Scanner(System.in);
        //printLargestAndSmallest(scan);

        printFibonacci();
    }

    public static void printPowers(int base,
                                   int power) {
        int value = 1;

        int[] powers = new int[power + 1];

        for (int i = 0; i <= power; ++i) {
            powers[i] = value;
            value *= base;

            // (int) Math.pow(base, i);
        }

        System.out.println(Arrays.toString(powers));
    }

    public static void printLargestAndSmallest(
            Scanner scan) {
        System.out.print("Enter 4 numbers: ");
        int[] nums = new int[4];

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = scan.nextInt();
        }

        Arrays.sort(nums);

        System.out.println("Largest: " + nums[nums.length - 1]);
        System.out.println("Smallest: " + nums[0]);
    }

    public static void printFibonacci() {
        int[] fibs = new int[8];

        fibs[0] = 1;
        fibs[1] = 1;

        for (int i = 2; i < fibs.length; ++i) {
            fibs[i] = fibs[i - 2] + fibs[i - 1];
        }

        System.out.println(Arrays.toString(fibs));
    }
}
