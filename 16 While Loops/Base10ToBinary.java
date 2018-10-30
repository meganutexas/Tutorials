package whileLoops;

public class Base10ToBinary {
    public static void main(String[] args) {
        System.out.println(convertToBinary(8));
        System.out.println(convertToBinary(45));
        System.out.println(convertToBinary(0));

    }

    public static String convertToBinary(int num) {
        String answer = "";

        int remainder = num % 2;
        answer += remainder;

        num /= 2;

        while (num != 0) {
            remainder = num %2;
            answer = remainder + answer;

            num /= 2;
        }

        return answer;
    }
}
