// Write a program called Factorial.java that computes factorials an.....

import java.util.Scanner;

public class Factorial {
    private static long[] factorials;

    public static void computeFactorials(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }

        if (n >= factorials.length) {
            throw new IllegalArgumentException("Result will overflow");
        }

        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for which you want to find the factorial: ");
        int x = scanner.nextInt();
        scanner.close();

        // Initialize the array to store factorials
        factorials = new long[21]; // Factorials up to 20 can be stored in long type

        try {
            computeFactorials(x);

            // Print the factorials
            System.out.println("Factorials:");
            for (int i = 0; i <= x; i++) {
                System.out.println(i + "! = " + factorials[i]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
