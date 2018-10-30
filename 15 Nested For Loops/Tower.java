package nestedForLoops;

public class Tower {
    public static void main(String[] args) {
        printTower(4, 3);
        System.out.println();
        printTower(3, 4);
    }

    public static void printTower(int height,
                                  int width) {
        printLine(width);
        for (int outer = 0; outer < height; ++outer) {
            System.out.print("|-");
            for (int inner = 0; inner < width; ++inner) {
                System.out.print("x-");
            }
            System.out.println("|");
            printLine(width);
        }
    }

    public static void printLine(int width) {
        int finalWidth = (width * 2) + 3;
        for (int i = 0; i < finalWidth; ++i) {
            System.out.print("-");
        }
        System.out.println();
    }
}
