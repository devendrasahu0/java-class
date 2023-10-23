public class RectangleCalculator {

    // Function to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    // Function to calculate the perimeter of a rectangle
    public static double calculateRectanglePerimeter(double length, double width) {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public static void main(String[] args) {
        double length = 5.0; // Length of the rectangle
        double width = 3.0;  // Width of the rectangle

        // Calculate area and perimeter using the functions
        double area = calculateRectangleArea(length, width);
        double perimeter = calculateRectanglePerimeter(length, width);

        System.out.println("Length of the rectangle: " + length);
        System.out.println("Width of the rectangle: " + width);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
