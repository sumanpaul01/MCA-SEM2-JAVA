/*Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and 
Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume( 
). Override these two methods in each of the derived classes to calculate the volume 
and whole surface area of each type of three-dimensional objects. The dimensions of 
the objects are to be taken from the users and passed through the respective 
constructors of each derived class. Write a main method to test these classes.*/

import java.util.Scanner;

class ThreeDObject {
    // Methods to be overridden by subclasses
    public double wholeSurfaceArea() {
        return 0.0;
    }

    public double volume() {
        return 0.0;
    }
}

class Box extends ThreeDObject {
    public double length;
    public double width;
    public double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cube extends Box {
    public Cube(double side) {
        super(side, side, side);
    }
}

class Cylinder extends ThreeDObject {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends Cylinder {
    public Cone(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for Box (length width height):");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box volume: " + box.volume());
        System.out.println("Box surface area: " + box.wholeSurfaceArea());

        System.out.println("Enter side length for Cube:");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface area: " + cube.wholeSurfaceArea());

        System.out.println("Enter dimensions for Cylinder (radius height):");
        double radius = scanner.nextDouble();
        height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surface area: " + cylinder.wholeSurfaceArea());

        System.out.println("Enter dimensions for Cone (radius height):");
        radius = scanner.nextDouble();
        height = scanner.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Cone volume: " + cone.volume());
        System.out.println("Cone surface area: " + cone.wholeSurfaceArea());

        scanner.close();
    }
}
