package expectionsAndAssertions;

public class ReceiptWithMethodsWithPreconditions {
    public static void main(String[] args) {
        printReceipt(1005);
    }

    public static void printReceipt(double subtotal) {
        assert subtotal < 1000 : "subtotal in print receipt too big";
        double totalWithTax = calculateTotalWithTax(subtotal);
        double totalWithTip = calculateTotalWithTip(totalWithTax);

        System.out.println("Your subtotal is: " + subtotal);
        System.out.println("Your total with tax is: " + totalWithTax);
        System.out.println("Final Total: " + totalWithTip);
    }

    public static double calculateTotalWithTax(double subtotal) {
        assert subtotal < 1000 : "subtotal in calculate total with tax too big";
        double taxPercent = 0.08; // 8%
        double totalWithTax = subtotal + (subtotal * taxPercent);

        return totalWithTax;
    }

    public static double calculateTotalWithTip(double totalWithTax) {
        assert totalWithTax < 1000 : "subtotal in calculate total with tip too big";
        double tipPercent = 0.15; // 15%

        return totalWithTax + (totalWithTax * tipPercent);
    }
}
