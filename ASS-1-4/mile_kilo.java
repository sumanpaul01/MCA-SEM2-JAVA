import java.util.*;
public class mile_kilo {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter Distance in mile:: ");
    double dist = reader.nextDouble();

    double kilo = dist*1.609;

    System.out.print(dist + " mile = " + kilo +"km.");
  }
}
