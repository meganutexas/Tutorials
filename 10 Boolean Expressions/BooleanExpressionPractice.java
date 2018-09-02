package booleanLogic;

public class BooleanExpressionPractice {
    public static void main(String[] args) {
        System.out.println("starts doesContain s: " + doesContain("starts", 's'));
        System.out.println("walrus doesContain x: " + doesContain("walrus",  'x'));
        System.out.println("\n7 is odd: " + isOdd(7));
        System.out.println("38 is odd: " + isOdd(38));
        System.out.println("\n32.7 would round up: " + wouldRoundUp(32.7));
        System.out.println("15.2 would round up: " + wouldRoundUp(15.2));
        System.out.println("\n12 is a common multiple of 2 and 3: " + isCommonMultipleOf2And3(12));
        System.out.println("31 is a common multiple of 2 and 3: " + isCommonMultipleOf2And3(31));
        System.out.println("\n\"hello world\" is multiple words: " + isMultipleWords("hello word"));
        System.out.println("\"helloworld\" is multiple words: " + isMultipleWords("helloworld"));
        System.out.println("\n12453 has 4 in hundreds place: " + has4In100sPlace(12453));
        System.out.println("6785 has 4 in hundreds place: " + has4In100sPlace(6785));
    }

    public static boolean doesContain(String word,
                                      char letter) {
        return word.indexOf(letter) != -1;
    }

    public static boolean isOdd(int num) {
        return (num % 2) == 1;
    }

    public static boolean wouldRoundUp(double num) {
        return (num % 1) >= 0.5;
    }

    public static boolean isCommonMultipleOf2And3(int num) {
        return !isOdd(num) && (num % 3 == 0);
    }

    public static boolean isMultipleWords(String s) {
        return doesContain(s, ' ');
    }

    public static boolean has4In100sPlace(int num) {
        int hundredsPlace = (num / 100) % 10;

        return hundredsPlace == 4;
    }
}
