package staticMethods;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        firstStanza();
        secondStanza();
        thirdStanza();
        fourthStanza();
        fifthStanza();
        sixthStanza();
        seventhStanza();
        eighthStanza();
        ninthStanza();
        tenthStanza();
        eleventhStanza();
        twelvethStanza();
    }

    public static void firstStanza() {
        System.out.println("On the first day of christmas my true love sent to me");
        firstStanzaBody();
    }

    public static void firstStanzaBody() {
        System.out.println("A partridge in a pear tree\n");
    }

    public static void secondStanza() {
        System.out.println("On the second day of christmas my true love sent to me");
        secondStanzaBody();
    }

    public static void secondStanzaBody() {
        System.out.println("Two turtle doves, and");
        firstStanzaBody();
    }

    public static void thirdStanza() {
        System.out.println("On the third day of christmas my true love sent to me");
        thirdStanzaBody();
    }

    public static void thirdStanzaBody() {
        System.out.println("Three french hens");
        secondStanzaBody();
    }

    public static void fourthStanza() {
        System.out.println("On the fourth day of christmas my true love sent to me");
        fourthStanzaBody();
    }

    public static void fourthStanzaBody() {
        System.out.println("Four colly birds");
        thirdStanzaBody();
    }

    public static void fifthStanza() {
        System.out.println("On the fifth day of christmas my true love sent to me");
        fifthStanzaBody();
    }

    public static void fifthStanzaBody() {
        System.out.println("Five gold rings");
        fourthStanzaBody();
    }

    public static void sixthStanza() {
        System.out.println("On the sixth day of christmas my true love sent to me");
        sixthStanzaBody();
    }

    public static void sixthStanzaBody() {
        System.out.println("Six geese a-laying");
        fifthStanzaBody();
    }

    public static void seventhStanza() {
        System.out.println("On the seventh day of christmas my true love sent to me");
        seventhStanzaBody();
    }

    public static void seventhStanzaBody() {
        System.out.println("Seven swans a-swimming");
        sixthStanzaBody();
    }

    public static void eighthStanza() {
        System.out.println("On the eighth day of christmas my true love sent to me");
        eighthStanzaBody();
    }

    public static void eighthStanzaBody() {
        System.out.println("Eight maids a-milking");
        seventhStanzaBody();
    }

    public static void ninthStanza() {
        System.out.println("On the nineth day of christmas my true love sent to me");
        ninthStanzaBody();
    }

    public static void ninthStanzaBody() {
        System.out.println("Nine ladies dancing");
        eighthStanzaBody();
    }

    public static void tenthStanza() {
        System.out.println("On the tenth day of christmas my true love sent to me");
        tenthStanzaBody();
    }

    public static void tenthStanzaBody() {
        System.out.println("Ten lords a-leaping");
        ninthStanzaBody();
    }

    public static void eleventhStanza() {
        System.out.println("On the eleventh day of christmas my true love sent to me");
        eleventhStanzaBody();
    }

    public static void eleventhStanzaBody() {
        System.out.println("Eleven pipers piping");
        tenthStanzaBody();
    }

    public static void twelvethStanza() {
        System.out.println("On the twelth day of christmas my true love sent to me");
        twelvethStanzaBody();
    }

    public static void twelvethStanzaBody() {
        System.out.println("Twelve drummers drumming");
        eleventhStanzaBody();
    }

}
