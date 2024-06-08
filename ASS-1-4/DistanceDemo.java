class Distance {
  protected double distanceMiles;
  public Distance(double distanceMiles) {
      this.distanceMiles = distanceMiles;
  }
  public void travelTime() {
      double speedMilesPerHour = 60.0;
      double timeHours = distanceMiles / speedMilesPerHour;
      System.out.println("Time taken to cover " + distanceMiles + " miles at 60 miles per hour: " + timeHours + " hours");
  }
}
class DistanceMKS extends Distance {
  public DistanceMKS(double distanceMiles) {
      super(distanceMiles);
  }
  public void travelTime() {
      double speedKilometersPerSecond = 100.0 / 3600.0; // converting speed from km per second to km per hour
      double distanceKilometers = distanceMiles * 1.60934; // converting distance from miles to kilometers
      double timeSeconds = distanceKilometers / speedKilometersPerSecond;
      System.out.println("Time taken to cover " + distanceMiles + " miles at 100 km per second: " + timeSeconds + " seconds");
  }
}
public class DistanceDemo {
  public static void main(String[] args) {
      Distance distanceObj = new Distance(100);
      System.out.println("Using base class Distance:");
      distanceObj.travelTime();
      DistanceMKS distanceMKSObj = new DistanceMKS(100);
      System.out.println("\nUsing derived class DistanceMKS:");
      distanceMKSObj.travelTime();
  }
}

