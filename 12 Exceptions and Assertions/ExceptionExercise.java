package expectionsAndAssertions;

public class ExceptionExercise {
    public static void main(String[] args) {
        throwsNullPointer();
        throwsIllegalArgument();
        throwsIndexOutOfBounds();
        throwsArithmeticException();
    }

    public static void throwsNullPointer() {
        try {
            String s = null;
            s.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    public static void throwsIllegalArgument() {
        try {
            throw new IllegalArgumentException("thrown intentionally");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public static void throwsIndexOutOfBounds() {
        try {
            String s = "Jobby";
            char c = s.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

    public static void throwsArithmeticException() {
        try {
            int blackHole = 2/0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
