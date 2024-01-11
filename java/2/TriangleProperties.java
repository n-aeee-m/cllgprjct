import java.util.Scanner;

public class TriangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.println("Enter the sides of the triangle:");
        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        // Check for equilateral, isosceles, or scalene triangle
        String triangleType = checkTriangleType(side1, side2, side3);
        System.out.println("Triangle type: " + triangleType);

        // Calculate the area of the triangle
        double area = calculateArea(side1, side2, side3);
        System.out.println("Area of the triangle: " + area);

        scanner.close();
    }

    // Method to check the type of triangle
    public static String checkTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral triangle";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }

    // Method to calculate the area of the triangle using Heron's formula
    public static double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2; // Calculate semi-perimeter
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
        return area;
    }
}
