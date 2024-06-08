import java.util.*;

public class multiple_of_10 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the interval
        System.out.print("Enter the starting number : ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number : ");
        int end = scanner.nextInt();

        // Print multiples of 10 within the interval
        System.out.println("Multiples of 10 within the interval [" + start + ", " + end + "]:");
        mul(start, end);

        scanner.close();
    }
    public static void mul(int start, int end) {
      // Ensure start is a multiple of 10
      if (start % 10 != 0) {
          start += 10 - (start % 10);
      }

      // Print multiples of 10 within the interval
      for (int i = start; i <= end; i += 10) {
          System.out.println(i);
      }
  }
}
