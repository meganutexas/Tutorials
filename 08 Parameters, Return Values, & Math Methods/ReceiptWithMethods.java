package parametersReturnValuesAndMathMethods;

public class ReceiptWithMethods {
    public static void main(String[] args) {
        printReceipt(45.32);
    }

    public static void printReceipt(double subtotal) {
        double totalWithTax = calculateTotalWithTax(subtotal);
        double totalWithTip = calculateTotalWithTip(totalWithTax);

        System.out.println("Your subtotal is: " + subtotal);
        System.out.println("Your total with tax is: " + totalWithTax);
        System.out.println("Final Total: " + totalWithTip);
    }

    public static double calculateTotalWithTax(double subtotal) {
        double taxPercent = 0.08; // 8%
        double totalWithTax = subtotal + (subtotal * taxPercent);

        return totalWithTax;
    }

    public static double calculateTotalWithTip(double totalWithTax) {
        double tipPercent = 0.15; // 15%

        return totalWithTax + (totalWithTax * tipPercent);
    }
}
