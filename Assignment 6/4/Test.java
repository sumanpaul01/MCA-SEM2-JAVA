/*Write a program to create a class named Vehicle having protected instance variables 
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a 
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having 
individual private instance variables routeNumber in Bus and manufacturerName in Car 
and both of them having showData ( ) method showing all details of Bus and Car 
respectively with content of the super class’s showData ( ) method.*/

// Parent class Vehicle
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    // Constructor
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to show vehicle data
    public void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

// Subclass Bus
class Bus extends Vehicle {
    private String routeNumber;

    // Constructor
    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    // Method to show bus data
    public void showData() {
        super.showData(); // invoking superclass's showData() method
        System.out.println("Route Number: " + routeNumber);
    }
}

// Subclass Car
class Car extends Vehicle {
    private String manufacturerName;

    // Constructor
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    // Method to show car data
    public void showData() {
        super.showData(); // invoking superclass's showData() method
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        // Creating objects of Bus and Car
        Bus bus = new Bus("B123", 60, "Yellow", "John", "123A");
        Car car = new Car("C456", 100, "Red", "Alice", "Toyota");

        // Showing data of Bus and Car
        System.out.println("Details of Bus:");
        bus.showData();
        System.out.println();

        System.out.println("Details of Car:");
        car.showData();
    }
}
