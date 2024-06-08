import java.util.*;

public class circle {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter radius:: ");
    double r = reader.nextDouble();
    double peri = 2*3.14*r;
    double area = 3.14*r*r;
    System.out.println("Perimeter of Circle is :: " +peri);    
    System.out.println("Area of Circle is :: " +area);    
  }
}
