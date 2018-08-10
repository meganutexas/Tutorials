public class VariableAndExpressionDemo {
    public static void main(String[] args) {
        System.out.println(2 + 4 / 3 * 6);

        int result = 2 + 4 / 3 * 6; // result = 8
        System.out.println(result);

        System.out.println("Result: " + result);

        System.out.println("Result: " + result + 2 + 4);

        System.out.println("Result: " + (result + 2 + 4));

        System.out.println("Result: " + (result + 2 + 4) + " <- actually did the math");
    }
}
