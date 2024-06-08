/*Define a class called circle that contains:
• Two private instance variables: radius (of type double) and color (of type String),
• Initialize the variables radius and color with default value of 1.0 and "red", respectively using default constructor.
• Include a second constructor that will use the default value for color and sets the
radius to the value passed as parameter.
• Two public methods: getRadius() and getArea() for returning the radius and area of
the circle
• Invoke the above methods and constructors in the main. */
class Circle {
    private double radius;
    private String color;
    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    // Method to get the radius
    public double getRadius() {
        return radius;
    }
    // Method to calculate and return the area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a Circle object using default constructor
        Circle circle1 = new Circle();

        // Create a Circle object using constructor with radius parameter
        Circle circle2 = new Circle(2.5);

        // Display details of circle1
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());

        // Display details of circle2
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
    }
}