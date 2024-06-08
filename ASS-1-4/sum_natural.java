import java.util.*;
public class sum_natural {
  public static void main(String[] args) {
    Scanner reader =  new Scanner(System.in);
    System.out.print("Enter the range of natural number::  ");
    int num = reader.nextInt();
    int sum = total(num);
  System.out.println("Sum is :: "+sum);
}
public static int total(int num){
  int sum = 0;
  for(int i = 0; i<=num ; i++){
    sum= sum+i;
  }
  return sum;
}
}