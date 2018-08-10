package stringsAndPrintf;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.printf("%4dx\n", 5);
        System.out.printf("%-4dx\n", 5);

        System.out.printf("%.2f\n", 5.674329);
        System.out.printf("%6.2fx\n", 5.674329);
        System.out.printf("%-6.2fx\n", 5.674329);

        System.out.printf("%20sx\n", "testing");
        System.out.printf("%-20sx\n", "testing");
    }
}
