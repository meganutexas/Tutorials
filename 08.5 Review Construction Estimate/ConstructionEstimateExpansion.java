public class ConstructionEstimateExpansion {
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

    public static double fenceLength(double length,
                                     double width) {
        return 2 * width + length;
    }

    public static double estimateBackyardFence(double length,
                                               double width) {
        return fenceLength(length, width) * 12.5;
    }

    public static double estimateBathroomCost(double length,
                                              double width) {
        int numberExtraBathrooms = (int) (calculateArea(length, width) / 1000);
        return (1 + numberExtraBathrooms) * 800;
    }

    public static double estimateFrontYardFenceCost(double length,
                                                    double width) {
        double fenceCost = fenceLength(length, width) * 6.25;
        return fenceCost + 50;
    }

    public static void printEstimateOfHouse(int length,
                                            int width) {
        double lengthOfHouse = length;
        double widthOfHouse = (double) width / 2;

        double costOfRoof = estimateRoofCost(lengthOfHouse, widthOfHouse);
        double costOfFloor = estimateFloorCost(lengthOfHouse, widthOfHouse);
        double costOfBackyardFence = estimateBackyardFence(lengthOfHouse, widthOfHouse);
        double costOfBathrooms = estimateBathroomCost(lengthOfHouse, widthOfHouse);
        double costOfFrontYardFence = estimateFrontYardFenceCost(lengthOfHouse, widthOfHouse);
        double costOfHouse = costOfRoof + costOfFloor + costOfBackyardFence + costOfBathrooms + costOfFrontYardFence;

        System.out.println("Roof estimate: $" + costOfRoof);
        System.out.println("Floor estimate: $" + costOfFloor);
        System.out.println("Backyard fence estimate: $" + costOfBackyardFence);
        System.out.println("Bathroom estimate: $" + costOfBathrooms);
        System.out.println("Front yard fence estimate: $" + costOfFrontYardFence);
        System.out.println("Total house estimate: $" + costOfHouse);
    }
}
