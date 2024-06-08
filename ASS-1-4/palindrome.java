//2.14
import java.util.*;
public class palindrome {
  public static void main(String[] args) {
    Scanner read  = new Scanner(System.in);
    System.out.print("Enter a number :: ");
    int num = read.nextInt();
    boolean palin = check(num);
    if (palin) {
      System.out.println(num+ " is a palindrome!");
    }else{
      System.out.println(num+ " is not a palindrome!");

    }
  }
  public static boolean check (int n){
    int temp = n;
    int rev = 0;
    while (n!=0) {
      int digit = n%10;
      rev = rev*10+digit;
      n = n/10;
    }
    return temp==rev;
  }
}
