import java.util.Scanner;

class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0.0;
    }

    public double volume() {
        return 0.0;
    }
}

class Box extends ThreeDObject {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    public double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    public double volume() {
        return (Math.PI * radius * radius * height) / 3.0;
    }
}

public class TestThreeDObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for Box:");
        System.out.print("Length: ");
        double boxLength = scanner.nextDouble();
        System.out.print("Width: ");
        double boxWidth = scanner.nextDouble();
        System.out.print("Height: ");
        double boxHeight = scanner.nextDouble();

        Box box = new Box(boxLength, boxWidth, boxHeight);

        System.out.println("\nEnter dimensions for Cube:");
        System.out.print("Side: ");
        double cubeSide = scanner.nextDouble();

        Cube cube = new Cube(cubeSide);

        System.out.println("\nEnter dimensions for Cylinder:");
        System.out.print("Radius: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double cylinderHeight = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        System.out.println("\nEnter dimensions for Cone:");
        System.out.print("Radius: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double coneHeight = scanner.nextDouble();

        Cone cone = new Cone(coneRadius, coneHeight);

        System.out.println("\nResults:");
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("\nCube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("\nCylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("\nCone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}
