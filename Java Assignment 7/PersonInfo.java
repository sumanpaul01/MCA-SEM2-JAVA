//Write a program to input name and age of a person and throw a user-defined exception, if the entered age is negative.

import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get name from user
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            // Get age from user
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            // Check if age is negative
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }

            // Print person's information
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
