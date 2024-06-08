import java.util.*;
public class leap_year {
  public static void main(String[] args) {
    Scanner reader =  new Scanner(System.in);
    System.out.print("Enter a Year :: ");

    int year = reader.nextInt();

    boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = (year % 400 == 0);
            } else {
                leap = true;
            }
        }

        if (leap) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
        
        
    }
}
