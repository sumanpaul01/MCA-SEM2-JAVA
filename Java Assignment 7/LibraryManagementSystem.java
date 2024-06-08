//Library Management System

import java.util.Scanner;

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Predefined array of books
        String[] library = {"Java Programming", "Python Crash Course", "Data Structures and Algorithms", "Introduction to Algorithms"};

        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the book you are searching for: ");
        String bookName = scanner.nextLine();

        try {
            // Search for the book in the library
            boolean bookFound = false;
            for (String book : library) {
                if (book.equalsIgnoreCase(bookName)) {
                    System.out.println("Book Found: " + book);
                    bookFound = true;
                    break;
                }
            }

            // If book is not found, throw BookNotFoundException
            if (!bookFound) {
                throw new BookNotFoundException("Book '" + bookName + "' not found in the library.");
            }
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
