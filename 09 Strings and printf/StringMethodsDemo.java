package stringsAndPrintf;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String s = "hello world!";

        int indexOfW = s.indexOf("w");
        int indexOfEllo = s.indexOf("ello");

        System.out.println("Index of w: " + indexOfW);
        System.out.println("Index of ello: " + indexOfEllo);

        System.out.println("Length: " + s.length());

        s = s.replace("e", "E");
        System.out.println("After replace: " + s);

        System.out.println("Substring demo: " +
                s.substring(3, 7));
        System.out.println("Substring only begin index: "
                + s.substring(5));

        System.out.println("Uppercase version of s: " + s.toUpperCase());

        System.out.println("Char at 4: " + s.charAt(4));
        // System.out.println("Char at 13: " + s.charAt(13)); <- throws out of bounds error

        System.out.println("S equals itself: " + s.equals(s));

        String nullString = null;
        // nullString.toUpperCase(); <- throws a null pointer exception
    }
}
