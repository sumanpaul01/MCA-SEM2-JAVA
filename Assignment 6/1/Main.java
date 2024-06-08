/*Design an abstract class having two methods. Create Rectangle and Triangle classes by 
inheriting the shape class and override the above methods to suitably implement for 
Rectangle and Triangle class.*/

abstract class Shape {
    // Abstract method for calculating area
    public abstract double calculateArea();
    
    // Abstract method for calculating perimeter
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Override method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // Override method to calculate perimeter for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // Override method to calculate area for Triangle (using Heron's formula)
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    // Override method to calculate perimeter for Triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(5, 10);
        
        // Calculating and printing area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        
        // Calculating and printing perimeter of the rectangle
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
        
        // Creating a Triangle object
        Triangle triangle = new Triangle(3, 4, 5);
        
        // Calculating and printing area of the triangle
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        
        // Calculating and printing perimeter of the triangle
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
    }
}
