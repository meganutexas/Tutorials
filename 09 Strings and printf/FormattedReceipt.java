package stringsAndPrintf;

public class FormattedReceipt {
    public static void main(String[] args) {
        double subtotal = 45.32;

        double taxPercent = 0.08; // 8%
        double tipPercent = 0.15; // 15%

        double totalWithTax = subtotal + (subtotal * taxPercent);

        double tipAmount = totalWithTax * tipPercent;
        double totalWithTip = totalWithTax + tipAmount;

        String name = "Megan";

        System.out.println("Mr/Mrs." + name + " your totals are:\n");
        System.out.printf("%-20s$%6.2f\n", "Subtotal: ", subtotal);
        System.out.printf("%-20s$%6.2f\n", "Subtotal with tax: ", totalWithTax);
        System.out.printf("%-20s$%6.2f\n\n", "Tip: ", tipAmount);
        System.out.printf("%-20s$%6.2f", "Total: ", totalWithTip);
    }
}
