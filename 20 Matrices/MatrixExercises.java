package matrices;

import java.util.Arrays;

public class MatrixExercises {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6}
        };

        System.out.println("The max is: " + maxValueInMatrix(mat));
        System.out.println("The col sum are: " + Arrays.toString(colSums(mat)));
        System.out.println();
        printMatrix(mat);
        System.out.println();
        printInvertedMatrix(mat);
    }

    public static int maxValueInMatrix(int[][] mat) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                int current = mat[row][col];

                if (max < current) {
                    max = current;
                }
            }
        }

        return max;
    }

    public static int[] colSums(int[][] mat) {
        int[] colSums = new int[mat[0].length];

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                int current = mat[row][col];
                colSums[col] += current;
            }
        }

        return colSums;
    }

    public static void printMatrix(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void printInvertedMatrix(int[][] mat) {
        for (int col = 0; col < mat[0].length; col++) {
            for (int row = 0; row < mat.length; ++row) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
