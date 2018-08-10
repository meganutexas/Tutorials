package parametersReturnValuesAndMathMethods;

public class AgeInformationWithMethods {
    public static void main(String[] args) {
        printAgeInformation(43);
        printAgeInformation(32);
    }

    public static void printAgeInformation(int age) {
        boolean over30 = true;

        System.out.println("I am " + age + " years old.");
        printNumDecades(age);
        printYearsIntoDecade(age);
        printWayTo100(age);
        printWayToTargetAge(age, 50);
        System.out.println("Am I over 30? " + over30 + "!");
    }

    public static void printNumDecades(int age) {
        int numDecades = age / 10;
        System.out.println("That's " + numDecades + " decades!");
    }

    public static void printYearsIntoDecade(int age) {
        int yearsIntoDecade = age % 10;
        System.out.println("I am " + yearsIntoDecade + " years into my current decade.");
    }

    public static void printWayTo100(int age) {
        printWayToTargetAge(age, 100);
    }

    public static void printWayToTargetAge(int age, int targetAge) {
        double wayToTarget = (double) age / targetAge;
        System.out.println("I am " + wayToTarget + " of the way to " + targetAge + " years old!");
    }
}
