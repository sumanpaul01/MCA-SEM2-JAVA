//2.12
import java.util.*;
public class count_digit {
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    System.out.print("Enter an integer::");
    int num = read.nextInt();
    int count = 0;
    int temp  = num;
    while (temp!=0) {
      temp = temp/10;
      count ++;
    }
    System.out.println("Number of Digits:: " +count);
  }
  
}
