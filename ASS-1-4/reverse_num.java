import java.util.*;
public class reverse_num {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number:: ");
    int num = reader.nextInt();
    int reversenum = reverse(num);
    System.out.println("Reversed number :: "+reversenum);
  }
  public static int reverse(int n){
    int reversenum = 0;

    while (n!=0) {
      int digit = n%10;
      reversenum = reversenum*10+digit;
      n= n/10;
    }
    return reversenum;
  }
}
