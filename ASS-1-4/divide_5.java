import java.util.*;
public class divide_5 {
  public static void main(String[] args) {
    Scanner reader =  new Scanner(System.in);
    System.out.print("Enter a number::  ");
    int num = reader.nextInt();
    if (num%5 == 0) {
      System.out.println("Number is divisible!");
    }else{
      System.out.println("Number is not divisible!");
    }
  }
}
