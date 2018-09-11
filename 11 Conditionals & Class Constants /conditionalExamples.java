package conditionalsAndClassConstants;

public class conditionalExamples {
    public static void main(String[] args) {
        System.out.println("Is 34 over 30? " + overThirty(34));
        System.out.println("Is 24 over 30? " + overThirty(24));
        System.out.println();
        System.out.print("2.75 ");
        printsRoundDirection(2.75);
        System.out.print("1.2 ");
        printsRoundDirection(1.2);
        System.out.println();
        System.out.println("-12 is a " + numberToLetterGrade(-12));
        System.out.println("12 is a " + numberToLetterGrade(12));
        System.out.println("62 is a " + numberToLetterGrade(62));
        System.out.println("72 is a " + numberToLetterGrade(72));
        System.out.println("82 is a " + numberToLetterGrade(82));
        System.out.println("92 is a " + numberToLetterGrade(92));
        System.out.println("A range: " + letterToNumberGradeRange('A'));
        System.out.println("B range: " + letterToNumberGradeRange('B'));
        System.out.println("C range: " + letterToNumberGradeRange('C'));
        System.out.println("D range: " + letterToNumberGradeRange('D'));
        System.out.println("F range: " + letterToNumberGradeRange('F'));
        System.out.println("E range: " + letterToNumberGradeRange('E'));
    }

    public static String overThirty(int num) {
        String answer = "no";

        if (num > 30) {
            answer = "yes";
        }

        return answer;
    }

    public static void printsRoundDirection(double num) {
        double decimalPart = num % 1;

        if (decimalPart >= .5) {
            System.out.println("would round up");
        } else {
            System.out.println("would round down");
        }
    }

    public static char numberToLetterGrade(int grade) {
        if (grade < 0) {
            return 'I';
        } else if (grade < 60) {
            return 'F';
        } else if (grade < 70) {
            return 'D';
        } else if (grade < 80) {
            return 'C';
        } else if (grade < 90) {
            return 'B';
        } else { // anything 90+
            return 'A';
        }
    }

    public static String letterToNumberGradeRange(char grade) {
        String letterGrade;

        switch (grade) {
            case 'A':
                letterGrade = "90 - 100";
                break;
            case 'B':
                letterGrade = "80 - 89";
                break;
            case 'C':
                letterGrade = "70 - 79";
                break;
            case 'D':
                letterGrade = "60 - 69";
                break;
            case 'F':
                letterGrade = "0 - 59";
                break;
            default:
                letterGrade = "NOT A VALID GRADE";
        }

        return letterGrade;
    }
}
