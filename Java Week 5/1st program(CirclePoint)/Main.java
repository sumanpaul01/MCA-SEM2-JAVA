/*Create a “circle” class & a “point” class. The coordinates of the circle are given and used within the “circle” class as object of the “point” class. Display the area of circle.*/
class Point {
    private double x;
    private double y;
    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
class Circle {
    private Point center;
    private double radius;
    // Constructor
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    // Calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Getters
    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a Point object to represent the center of the circle
        Point center = new Point(3.0, 4.0);
        // Create a Circle object with the given center and radius
        Circle circle = new Circle(center, 5.0);
        // Calculate and display the area of the circle
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}