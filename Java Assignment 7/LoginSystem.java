//user name less than 6 characters and password does not match

import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get username
            System.out.print("Enter username (minimum 6 characters): ");
            String username = scanner.nextLine();

            // Get password
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Check username length
            if (username.length() < 6) {
                throw new InvalidCredentialsException("Username should be at least 6 characters long.");
            }

            // Check password
            if (!password.equals("password123")) {
                throw new InvalidCredentialsException("Password does not match.");
            }

            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
