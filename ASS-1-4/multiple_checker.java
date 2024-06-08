//2.20
import java.util.Scanner;

public class multiple_checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers (m and n): ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (m % n == 0) {
            System.out.println(m + " is a multiple of " + n);
        } else {
            System.out.println(m + " is not a multiple of " + n);
        }

        scanner.close();
    }
}
