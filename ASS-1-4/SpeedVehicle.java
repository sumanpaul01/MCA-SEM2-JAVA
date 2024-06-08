class Vehicle {
    protected int numberOfWheels;
    protected int speed;

    public Vehicle(int numberOfWheels, int speed) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int numberOfPassengers;

    public Car(int numberOfWheels, int speed, int numberOfPassengers) {
        super(numberOfWheels, speed);
        this.numberOfPassengers = numberOfPassengers;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}

class Truck extends Vehicle {
    private int loadLimit;

    public Truck(int numberOfWheels, int speed, int loadLimit) {
        super(numberOfWheels, speed);
        this.loadLimit = loadLimit;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Limit: " + loadLimit + " tons");
    }
}

public class SpeedVehicle {
    public static void main(String[] args) {
        Car myCar = new Car(4, 120, 5);
        Truck myTruck = new Truck(6, 80, 10);
        System.out.println("Car Information:");
        myCar.displayInfo();
        System.out.println("\nTruck Information:");
        myTruck.displayInfo();
        if (myCar.getSpeed() > myTruck.getSpeed()) {
            System.out.println("\nCar is faster than Truck.");
        } else if (myCar.getSpeed() < myTruck.getSpeed()) {
            System.out.println("\nTruck is faster than Car.");
        } else {
            System.out.println("\nCar and Truck have the same speed.");
        }
    }
}
