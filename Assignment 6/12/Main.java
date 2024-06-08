/*Implement the below Diagram*/

// Vehicle class
class Vehicle {
    private int id;
    private String name;
    private String licenseNumber;

    public Vehicle(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}

// Two-wheeler class
class TwoWheeler extends Vehicle {
    private String steeringHandle;

    public TwoWheeler(int id, String name, String licenseNumber, String steeringHandle) {
        super(id, name, licenseNumber);
        this.steeringHandle = steeringHandle;
    }

    // Getter and setter for steeringHandle
    public String getSteeringHandle() {
        return steeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        this.steeringHandle = steeringHandle;
    }
}

// Four-wheeler class
class FourWheeler extends Vehicle {
    private String steeringWheel;

    public FourWheeler(int id, String name, String licenseNumber, String steeringWheel) {
        super(id, name, licenseNumber);
        this.steeringWheel = steeringWheel;
    }

    // Getter and setter for steeringWheel
    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Creating instances of TwoWheeler and FourWheeler
        TwoWheeler bike = new TwoWheeler(1, "Bike", "123ABC", "Handle");
        FourWheeler car = new FourWheeler(2, "Car", "456DEF", "Wheel");

        // Displaying vehicle details
        System.out.println("Bike Details:");
        System.out.println("ID: " + bike.getId());
        System.out.println("Name: " + bike.getName());
        System.out.println("License Number: " + bike.getLicenseNumber());
        System.out.println("Steering Handle: " + bike.getSteeringHandle());

        System.out.println("\nCar Details:");
        System.out.println("ID: " + car.getId());
        System.out.println("Name: " + car.getName());
        System.out.println("License Number: " + car.getLicenseNumber());
        System.out.println("Steering Wheel: " + car.getSteeringWheel());
    }
}
