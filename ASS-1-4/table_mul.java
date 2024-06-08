import java.util.*;
public class table_mul {
  public static void main(String[] args) {
    Scanner reader  = new Scanner(System.in);
    System.out.print("Enter number:: ");
    int num =  reader.nextInt();
    table(num);
  }
  public static void table(int n){
    System.out.println("Multiplication table " + n + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + (n * i));
      
    }
  }
  
}
