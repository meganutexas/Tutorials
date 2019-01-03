package commandLineArguments;

public class Average {
    public static void main(String[] args) {
        int length = args.length;

        if (length == 0) {
            throw new IllegalStateException(
                    "no command line arguments given"
            );
        }

        double sum = 0;
        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (Exception e) {
                System.out.println("Given an argument that wasn't a number");
                throw new IllegalStateException("Non number CLA");
            }
        }

        double average = sum / length;

        System.out.println("Average of CLAs: " + average);
    }
}
