import java.util.*;;
public class course_cond {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter number of students:: ");
    int num = reader.nextInt();
    for(int i = 1; i <= num ; i++){
      System.out.println("Enter marks for student " + i + ":");
      System.out.print("Math::  ");
      int num1 = reader.nextInt();
      System.out.print("Physics :: ");
      int num2 = reader.nextInt();
      System.out.print("Chemistry :: ");
      int num3 = reader.nextInt();
      int total = num1+num2;
      if ((num1>=60 && num2>= 50 && num3>=40)&&( total>= 150)){
        System.out.println("Eligable!");
      }else{
        System.out.println("Not Eligable!");
      }
    }
  }
}
