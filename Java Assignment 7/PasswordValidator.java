//Write a program to accept a password from the user and throw 'Authentication Failure' exception if the password is incorrect

import java.util.Scanner;

class AuthenticationFailureException extends Exception {
    public AuthenticationFailureException(String message) {
        super(message);
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get password from user
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Check if password is correct
            if (!isValidPassword(password)) {
                throw new AuthenticationFailureException("Authentication Failure: Incorrect password.");
            }

            System.out.println("Authentication successful!");
        } catch (AuthenticationFailureException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate password (dummy validation logic)
    private static boolean isValidPassword(String password) {
        // Dummy validation logic - check if password is 'password123'
        return password.equals("password123");
    }
}
