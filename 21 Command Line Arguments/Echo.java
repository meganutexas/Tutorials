package commandLineArguments;

public class Echo {
    public static void main(String[] args) {
        int length = args.length;

        if (length == 0) {
            throw new IllegalStateException(
                    "no command line arguments given"
            );
        }

        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }
}
