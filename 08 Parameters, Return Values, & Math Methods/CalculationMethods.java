package parametersReturnValuesAndMathMethods;

public class CalculationMethods {
    public static void main(String[] args) {
        double averageOf2Numbers = average(7, 5);
        System.out.println("Average of 7 & 5: " + averageOf2Numbers);

        System.out.println("Average of 7, 5, & 3: " + average(7, 5, 3));

        System.out.println("Perimeter of rectangle: " + perimeter(3, 4));

        System.out.println("Area of rectangle: " + area(3,4));

        System.out.println("Circumference with radius 4: " + circumference(4));

        System.out.println("Area of circle with radius 4: " + circleArea(4));
    }

    public static double average(double a, double b) {
        double sum = a + b;
        double average = sum / 2;

        return average;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static int perimeter(int height, int width) {
        return (2 * height) + (2 * width);
    }

    public static int area(int height, int width) {
        return height * width;
    }

    public static double circumference(int radius) {
        // 2 * pi * radius
        return 2 * Math.PI * radius;
    }

    public static double circleArea(int radius) {
        // pi * radius^2
        return Math.PI * Math.pow(radius, 2);
    }
}
