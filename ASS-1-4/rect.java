import java.util.*;

public class rect {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter Length::");
    int len = reader.nextInt();
    System.out.print("Enter Width::");
    int wid = reader.nextInt();
    double peri = 2*(len+wid);
    double area = len*wid;
    System.out.println("Perimeter of rectangle is::  "+peri);
    System.out.println("Area of rectangle is::  "+area);
  }
}
