public class ConstructionEstimate {
    public static void main(String[] args) {
        printEstimateOfHouse(100, 75);
        System.out.println();
        printEstimateOfHouse(200, 125);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double estimateRoofCost(double length,
                                          double width) {
        double area = calculateArea(length, width);
        return area * 3.5;
    }

    public static double estimateFloorCost(double length,
                                           double width) {
        double areaOfFloor = calculateArea(length, width) * .9;
        return areaOfFloor * 7.5;
    }

    public static void printEstimateOfHouse(int length,
                                            int width) {
        double lengthOfHouse = length;
        double widthOfHouse = (double) width / 2;

        double costOfRoof = estimateRoofCost(lengthOfHouse, widthOfHouse);
        double costOfFloor = estimateFloorCost(lengthOfHouse, widthOfHouse);
        double costOfHouse = costOfRoof + costOfFloor;

        System.out.println("Roof estimate: $" + costOfRoof);
        System.out.println("Floor estimate: $" + costOfFloor);
        System.out.println("Total house estimate: $" + costOfHouse);
    }
}
