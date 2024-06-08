import java.util.*;
public class fibonacci {
  public static void main(String[] args) {
    Scanner reader =  new Scanner(System.in);
    System.out.print("Enter a number :: ");
    int num =  reader.nextInt();
    System.out.print(num + " Fibonacci series:: ");
    fibo(num);
  }
  public static void fibo (int n){
    int first  = 0, second = 1;
    for (int i = 1; i<=n; i++){
      System.out.print(first + " ");
      int temp = first+second;
      first = second;
      second = temp;
    }
  }
}
