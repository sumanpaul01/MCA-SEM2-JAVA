//2.10
import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find and display the HCF
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    public static int findHCF(int num1, int num2) {
        // Initialize variables
        int small = Math.min(num1, num2);
        int hcf = 1;

        // Find the HCF
        for (int i = 1; i <= small; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }
}
