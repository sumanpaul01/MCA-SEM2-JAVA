import java.util.*;

public class max_3 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter 1st number = ");
    int num1 = reader.nextInt();
    System.out.print("Enter 2nd number = ");
    int num2 = reader.nextInt();
    System.out.print("Enter 3rd number = ");
    int num3 = reader.nextInt();

    if(num1>num2 && num1>num3){
      System.out.println(num1 + " is Greater from "+ num2 +" "+ num3);
    }else if (num2>num1 && num2>num3){
      System.out.println(num2 + " is Greater from "+ num1 +" "+ num3);
    }else {
      System.out.println(num3 + " is Greater from "+ num1 +" "+ num2);

    }
  }
}
