package forLoops;

public class ForLoopExercises {
    public static void main(String[] args) {
        printHourGlass(2);
        printHourGlass(4);

        printCountDown(3);

        System.out.println(power(2, 3));
        System.out.println(power(2, 0));

        System.out.println(getRange('A', 'E'));
    }

    public static void printHourGlass(int height) {
        printHourGlassLine();

        for (int i = 0; i < height; ++i) {
            System.out.println("\\    /");
            System.out.println("/    \\");
        }

        printHourGlassLine();
    }

    public static void printHourGlassLine() {
        System.out.println("+----+");
    }

    public static void printCountDown(int start) {
        for (int i = start; i >= 1; --i) {
            System.out.println(i + "...");
        }
        System.out.println("Lift off!");
    }

    public static int power(int base, int exponent) {
        int answer = 1;

        for (int i = 1; i <= exponent; ++i) {
            answer *= base;
        }

        return answer;
    }

    public static String getRange(char start, char stop) {
        String answer = start + "";

        for (int i = start + 1; i <= stop; ++i) {
            answer += ", " + ((char) i);
        }

        return answer;
    }

    // decrypt(encrypt("word"))

}
