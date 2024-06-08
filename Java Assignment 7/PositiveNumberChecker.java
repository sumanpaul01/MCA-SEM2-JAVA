//Write a program to throw user defined exception if the given number is not positive.

import java.util.Scanner;

class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException(String message) {
        super(message);
    }
}

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get number from user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if number is positive
            if (number <= 0) {
                throw new NonPositiveNumberException("Number must be positive.");
            }

            System.out.println("Entered number is positive: " + number);
        } catch (NonPositiveNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


