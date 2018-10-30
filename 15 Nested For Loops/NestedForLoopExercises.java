package nestedForLoops;

public class NestedForLoopExercises {
    public static void main(String[] args) {
        printStarSquare(4);
        System.out.println();
        printHourGlass(2, 4);
        System.out.println();
        printNumberTriangle(5);
        System.out.println();
        printPlusesAndPeriods(4, 5);
    }

    public static void printStarSquare(int sideLength) {
        for (int outer = 0; outer < sideLength; ++outer) {
            for (int inner = 0; inner < sideLength; ++inner) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHourGlass(int height,
                                      int width) {
        printHourGlassTop(width);

        for (int outer = 0; outer < height; ++outer) {
            System.out.print("\\");
            for (int inner = 0; inner < width; ++inner) {
                System.out.print(" ");
            }
            System.out.print("/\n/");
            for (int inner = 0; inner < width; ++inner) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        printHourGlassTop(width);
    }

    public static void printHourGlassTop(int width) {
        System.out.print("+");
        for (int i = 0; i < width; ++i) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void printNumberTriangle(int height) {
        for (int outer = 1; outer <= height; ++outer) {
            for (int inner = 1; inner <= outer; ++inner) {
                System.out.print(outer);
            }
            System.out.println();
        }
    }

    public static void printPlusesAndPeriods(int height,
                                             int width) {
        for (int outer = 1; outer <= height; ++outer) {
            for (int inner = 1; inner <= width; ++inner) {
                if (inner % 2 == 1) {
                    System.out.print(".");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
