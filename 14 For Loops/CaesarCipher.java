package forLoops;

public class CaesarCipher {
    public static void main(String [] args) {
        System.out.println("AfTeR encoded: " +
                encode(3,"AfTeR"));
        System.out.println("XcQbO decoded: " +
                decode(3, "XcQbO"));
    }

    public static String encode(int shiftAmount, String originalWord) {
        String encodedWord = "";

        for (int index = 0; index < originalWord.length(); ++index) {
            char originalChar = originalWord.charAt(index);
            char encodedChar = (char) (originalChar - shiftAmount);

            char start = isUpperCase(originalChar) ? 'A' : 'a';
            char end = isUpperCase(originalChar) ? 'Z' : 'z';

            if (encodedChar < start) {
                encodedChar = (char) (start - encodedChar);
                encodedChar -= 1;
                encodedChar = (char) (end - encodedChar);
            }

            encodedWord += encodedChar;
        }

        return encodedWord;
    }

    public static String decode(int shiftAmount, String encodedWord) {
        String decodedWord = "";

        for (int index = 0; index < encodedWord.length(); ++index) {
            char encodedChar = encodedWord.charAt(index);
            char decodedChar = (char) (encodedChar + shiftAmount);

            char start = isUpperCase(encodedChar) ? 'A' : 'a';
            char end = isUpperCase(encodedChar) ? 'Z' : 'z';

            if (decodedChar > end) {
                decodedChar = (char) (decodedChar - end);
                decodedChar -= 1;
                decodedChar = (char) (start + decodedChar);
            }

            decodedWord += decodedChar;
        }

        return decodedWord;
    }

    private static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
