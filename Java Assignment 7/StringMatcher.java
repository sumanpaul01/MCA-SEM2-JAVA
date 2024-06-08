//Define an exception called “NoMatchFoundException” that is thrown when a string is not equal to “University”. Write a program that uses this exception


import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class StringMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("University")) {
                throw new NoMatchFoundException("String does not match 'University'.");
            } else {
                System.out.println("String matches 'University'.");
            }
        } catch (NoMatchFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
