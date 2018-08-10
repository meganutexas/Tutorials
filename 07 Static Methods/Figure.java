package staticMethods;

public class Figure {
    public static void main(String[] args) {
        egg();
        teaCup();
        stopSign();
        hat();
    }

    public static void egg() {
        eggTop();
        eggBottom();
        System.out.println("");
    }

    public static void teaCup() {
        eggBottom();
        breakLine();
    }

    public static void stopSign() {
        eggTop();
        System.out.println("|  STOP  |");
        eggBottom();
        System.out.println("");
    }

    public static void hat() {
        eggTop();
        breakLine();
    }

    public static void eggTop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void eggBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void breakLine() {
        System.out.println("+--------+");
    }
}
