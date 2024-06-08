//Write a program to throw a user-defined exception "String Mismatch Exception", if two strings are not equal (ignore the case)

import java.util.Scanner;

class StringMismatchException extends Exception {
    public StringMismatchException(String message) {
        super(message);
    }
}

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get first string from user
            System.out.print("Enter the first string: ");
            String firstString = scanner.nextLine();

            // Get second string from user
            System.out.print("Enter the second string: ");
            String secondString = scanner.nextLine();

            // Check if the two strings are equal (ignoring case)
            if (!firstString.equalsIgnoreCase(secondString)) {
                throw new StringMismatchException("String mismatch exception: The two strings are not equal (ignoring case).");
            }

            System.out.println("The two strings are equal (ignoring case).");
        } catch (StringMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

