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

    public static double calculateFenceLength(double length,
                                              double width) {
        return length + (2 * width);
    }

    public static double estimateBackyardFenceCost(double fenceLength) {
        return fenceLength * 12.5;
    }

    public static double estimateFrontYardFenceCost(double fenceLength) {
        return (fenceLength * 6.25) + 50;
    }

    public static double estimateBathroomCost(double length,
                                              double width) {
        double area = calculateArea(length, width);
        int numberOfBathrooms = 1 + ((int) (area / 1000));
        return numberOfBathrooms * 800;
    }

    public static void printEstimateOfHouse(int length,
                                            int width) {
        double lengthOfHouse = length;
        double widthOfHouse = (double) width / 2;

        double costOfRoof = estimateRoofCost(lengthOfHouse, widthOfHouse);
        double costOfFloor = estimateFloorCost(lengthOfHouse, widthOfHouse);

        double widthOfFence = widthOfHouse / 2;
        double fenceLength = calculateFenceLength(lengthOfHouse, widthOfFence);
        double costOfBackyardFence = estimateBackyardFenceCost(fenceLength);
        double costOfFrontYardFence = estimateFrontYardFenceCost(fenceLength);
        double costOfBathrooms = estimateBathroomCost(lengthOfHouse, widthOfHouse);

        double costOfHouse = costOfRoof + costOfFloor + costOfBackyardFence +
                costOfFrontYardFence + costOfBathrooms;

        System.out.println("Roof estimate: $" + costOfRoof);
        System.out.println("Floor estimate: $" + costOfFloor);
        System.out.println("Backyard fence estimate: $" + costOfBackyardFence);
        System.out.println("Front yard fence estimate: $" + costOfFrontYardFence);
        System.out.println("Bathroom estimate: $" + costOfBathrooms);
        System.out.println("Total house estimate: $" + costOfHouse);
    }
}
