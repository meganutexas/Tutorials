package whileLoops;

public class WhileLoopExercises {
    public static void main(String[] args) {
        printCountDown(3);
        System.out.println();
        System.out.println(getPower(2, 8));
        System.out.println();
        printEvens(6);
        System.out.println();
        printEvens(9);
        System.out.println();
        printEvens(16);
        System.out.println();
        printHourGlass(2);
    }

    public static void printCountDown(int startNum) {
        int i = startNum;
        while (i >= 1) {
            System.out.println(i + "...");
            --i;
        }
        System.out.println("Lift off!");
    }

    public static int getPower(int base, int answer) {
        int power = 0;

        while (answer > 1) {
            ++power;
            answer = answer / base;
        }

        return power;
    }

    public static void printEvens(int num) {
        while (num % 2 == 0 && num != 0) {
            System.out.println("even");
            num /= 2;
        }
    }

    public static void printHourGlass(int height) {
        printHourGlassTop();
        int i = 0;
        while (i < height) {
            System.out.println("\\    /");
            System.out.println("/    \\");
            ++i;
        }
        printHourGlassTop();
    }

    public static void printHourGlassTop() {
        System.out.println("+----+");
    }
}
