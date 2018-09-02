package booleanLogic;

public class BooleanLogicWalkthrough {
    public static void main(String[] args) {
        boolean fourIsEven = isEven(4);
        boolean eightySevenIsEven = isEven(87);

        System.out.println("isEven with 4: " + fourIsEven);
        System.out.println("isEven with 87: " + eightySevenIsEven);

        boolean isUpperCaseTrue = isUpperCase('A');
        boolean isUpperCaseFalse = isUpperCase('g');

        System.out.println("\nisUpperCase with A: " + isUpperCaseTrue);
        System.out.println("isUpperCase with g: " + isUpperCaseFalse);

        boolean eIsVowel = isVowel('E');
        boolean hisVowel = isVowel('h');

        System.out.println("\nisVowel with E: " + eIsVowel);
        System.out.println("isVowel with h: " + hisVowel);

        boolean oIsVowel = isVowelDeMorgans('o');
        boolean tIsVowel = isVowelDeMorgans('T');

        System.out.println("\nisVowelDeMorgans with o: " + oIsVowel);
        System.out.println("isVowelDeMorgans with T: " + tIsVowel);

        boolean oneHundredAndThirtyFour = isBetween100And200(134);
        boolean fiftySix = isBetween100And200(56);

        System.out.println("\nisBetween100And200 with 134: " + oneHundredAndThirtyFour);
        System.out.println("isBetween100And200 with 56: " + fiftySix);

        boolean starsMatches = startMatchesEnd("stars");
        boolean waterfallMatches = startMatchesEnd("waterfall");

        System.out.println("\nstartMatchesEnd with stars: " + starsMatches);
        System.out.println("startMatchesEnd with waterfall: " + waterfallMatches);
    }

    public static boolean isEven(int num) {
        return (num % 2) == 0;
    }

    public static boolean isUpperCase(char letter) {
        return (letter >= 'A') && (letter <= 'Z');
    }

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' ||
                letter == 'i' || letter == 'o' ||
                letter == 'u' || letter == 'A' ||
                letter == 'E' || letter == 'I' ||
                letter == 'O' || letter == 'U';
    }

    public static boolean isVowelDeMorgans(char letter) {
        return !(letter != 'a' && letter != 'e' &&
                letter != 'i' && letter != 'o' &&
                letter != 'u' && letter != 'A' &&
                letter != 'E' && letter != 'I' &&
                letter != 'O' && letter != 'U');
    }

    public static boolean isBetween100And200(double num) {
        return (num > 100) && (num < 200);
    }

    public static boolean startMatchesEnd(String word) {
        String start = word.substring(0, 1);
        String end = word.substring(word.length()-1);

        return start.equals(end);
    }
}
