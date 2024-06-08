public class TestVehicle {
  
}
class Vehicle {
  protected String regnNumber;
  protected int speed;
  protected String color;
  protected String ownerName;

  public Vehicle(String regnNumber, int speed, String color, String ownerName) {
      this.regnNumber = regnNumber;
      this.speed = speed;
      this.color = color;
      this.ownerName = ownerName;
  }

  public void showData() {
      System.out.println("This is a vehicle class");
      System.out.println("Registration Number: " + regnNumber);
      System.out.println("Speed: " + speed);
      System.out.println("Color: " + color);
      System.out.println("Owner Name: " + ownerName);
  }
}

class Bus extends Vehicle {
  private String routeNumber;

  public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
      super(regnNumber, speed, color, ownerName);
      this.routeNumber = routeNumber;
  }

  public void showData() {
      super.showData();
      System.out.println("This is a Bus");
      System.out.println("Route Number: " + routeNumber);
  }
}

class Car extends Vehicle {
  private String manufacturerName;

  public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
      super(regnNumber, speed, color, ownerName);
      this.manufacturerName = manufacturerName;
  }

  public void showData() {
      super.showData();
      System.out.println("This is a Car");
      System.out.println("Manufacturer Name: " + manufacturerName);
  }
}
public class vehicleTest {
  public static void main(String[] args) {
      Bus myBus = new Bus("123", 60, "Blue", "John Doe", "Route 1");
      Car myCar = new Car("456", 80, "Red", "Jane Doe", "Toyota");

      System.out.println("Details of Bus:");
      myBus.showData();

      System.out.println("\nDetails of Car:");
      myCar.showData();
  }
}
