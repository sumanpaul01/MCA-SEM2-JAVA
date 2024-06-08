//Write a Java Program that Implement the Nested Try Statements

import java.util.Scanner;

public class NestedTryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String userInput = scanner.nextLine();
            
            // Attempt to parse the input into an integer
            int number = Integer.parseInt(userInput);

            try {
                // Attempt to perform division
                int result = number / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero in nested try block");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not an integer");
        } finally {
            scanner.close();
        }
    }
}
