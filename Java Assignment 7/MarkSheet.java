//Consider a Student examination database system that prints the mark sheet ofstudents. Input the following from the command line.



import java.util.Scanner;

class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input student's name
            System.out.print("Enter student's name: ");
            String studentName = scanner.nextLine();

            // Input marks in six subjects
            int totalMarks = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = Integer.parseInt(scanner.nextLine());

                // Check if marks are within the range (0 to 50)
                if (marks < 0 || marks > 50) {
                    throw new RangeException("Marks for subject " + i + " should be between 0 and 50");
                }

                totalMarks += marks;
            }

            // Calculate percentage
            double percentage = (double) totalMarks / (6 * 50) * 100;

            // Print mark sheet
            System.out.println("\nMark Sheet");
            System.out.println("-----------");
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for marks. Please enter integer values.");
        } catch (RangeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
