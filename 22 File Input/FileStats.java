package fileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) {
        File file = new File("moby_dick.txt");

        try {
            Scanner scan = new Scanner(file);

            int[] alphaStats = new int[26];
            int[] numStats = new int[10];

            getStats(scan, alphaStats, numStats);
            printStats(alphaStats, numStats);
        } catch (FileNotFoundException f) {
            System.out.println("File not found!");
        }
    }

    private static void getStats(Scanner scan, int[] alphaStats, int[] numStats) {
        while (scan.hasNext()) {
            String word = scan.next().toUpperCase();

            for (int i = 0; i < word.length(); ++i) {
                char current = word.charAt(i);

                // if an alpha
                if (current >= 'A' && current <= 'Z') {
                    int alphaIndex = current - 'A';
                    alphaStats[alphaIndex]++;
                }

                // if a num
                if (current >= '0' && current <= '9') {
                    int numCurrent = current - '0';
                    numStats[numCurrent]++;
                }
            }
        }
    }

    private static void printStats(int[] alphaStats, int[] numStats) {
        for (int i = 0; i < alphaStats.length; ++i) {
            char currentAlpha = (char) (i + 'A');
            System.out.println(currentAlpha + ": " + alphaStats[i]);
        }
        System.out.println();
        for (int i = 0; i < numStats.length; ++i) {
            char currentNum = (char) (i + '0');
            System.out.println(currentNum + ": " + numStats[i]);
        }
    }
}
