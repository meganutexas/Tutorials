package typesVariablesAndExpressions;

public class AgeInformation {
    public static void main(String[] args) {
        int age = 43;

        int numDecades = age / 10;

        int yearsIntoDecade = age % 10;

        double wayTo100 = (double) age / 100;

        boolean over30 = true;

        System.out.println("I am " + age + " years old.");
        System.out.println("That's " + numDecades + " decades!");
        System.out.println("I am " + yearsIntoDecade + " years into my current decade.");
        System.out.println("I am " + wayTo100 + " of the way to 100 years old!");
        System.out.println("Am I over 30? " + over30 + "!");
    }
}
