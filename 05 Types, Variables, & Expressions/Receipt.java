public class Receipt {
    public static void main(String[] args) {
        double subtotal = 45.32;

        double taxPercent = 0.08; // 8%
        double tipPercent = 0.15; // 15%

        double totalWithTax = subtotal + (subtotal * taxPercent);

        double totalWithTip = totalWithTax + (totalWithTax * tipPercent);

        System.out.println("Your subtotal is: " + subtotal);
        System.out.println("Your total with tax is: " + totalWithTax);
        System.out.println("Final Total: " + totalWithTip);
    }
}
