import java.util.*;
public class grade {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter Percentage :: ");
    double percent = reader.nextDouble();

    char grade;

    if (percent>=90) {
      grade = 'A';
    }else if (percent>=80) {
      grade = 'B';
      
    }else if (percent>=70) {
      grade = 'C';
      
    }else if (percent>=60) {
      grade = 'D';
      
    }else if (percent>=40) {
      grade = 'E';
    }else{
      grade = 'F';
    }
    System.out.println("Grade :: " + grade);
  }
  
}
