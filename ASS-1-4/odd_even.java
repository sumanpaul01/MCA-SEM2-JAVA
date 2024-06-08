import java.util.*;

public class odd_even {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number :: ");
    int num1 = reader.nextInt();

    if (num1 % 2 == 0){
      System.out.println(num1 + " is even!" );
    }else{
      System.out.println(num1 + "is Odd!");
    }
  }
}
