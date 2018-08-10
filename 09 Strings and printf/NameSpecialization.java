package stringsAndPrintf;

public class NameSpecialization {
    public static void main(String[] args) {
        String name = "Megan Avery";

        int spaceIndex = name.indexOf(' ');
        String firstName = name.substring(0, spaceIndex);

        String lastName = name.substring(spaceIndex + 1);

        String firstNameCapitalized = firstName.toUpperCase() + " " + lastName;
        String lastNameCapitalized = firstName + " " + lastName.toUpperCase();

        String nameWithCapitalizedVowels = capitalizedVowels(name);

        boolean matchingFirstLetters = firstName.substring(0, 1)
                .equals(lastName.substring(0, 1));

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name Capitalized: " + firstNameCapitalized);
        System.out.println("Last Name Capitalized: " + lastNameCapitalized);
        System.out.println("Capitalized Vowels: " + nameWithCapitalizedVowels);
        System.out.println("First Name Length: " + firstName.length());
        System.out.println("Last Name Length: " + lastName.length());
        System.out.println("Full Name Length: " + (name.length() - 1));
        System.out.println("Both Names Same Beginning: " + matchingFirstLetters);
    }

    public static String capitalizedVowels(String name) {
        name = name.replace('a', 'A');
        name = name.replace('e', 'E');
        name = name.replace('i', 'I');
        name = name.replace('o', 'O');
        name = name.replace('u', 'U');

        return name;
    }
}
