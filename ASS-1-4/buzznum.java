import java.util.*;
public class buzznum {
  public static void main(String[] args) {
    Scanner reader =  new Scanner(System.in);
    System.out.print("Enter a Number:: ");
    int num =  reader.nextInt();

    boolean buzz = (num%7 == 0 || num%10 == 7);

    if (buzz){
      System.out.println(num+ " is Buzz Number!");
    }else{
      System.out.println(num+ " is not a Buzz Number!");
    }
  }
  
}
