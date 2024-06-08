//Write an application that displays a series of at least five student ID numbers (that you have stored in an array) and asks the user to enter a numeric test score for the student....

import java.util.Scanner;

class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);
    }
}

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_STUDENTS = 5;
        int[] studentIDs = {101, 102, 103, 104, 105};
        int[] scores = new int[NUM_STUDENTS];

        try {
            // Get scores for each student
            for (int i = 0; i < NUM_STUDENTS; i++) {
                System.out.print("Enter test score for student with ID " + studentIDs[i] + ": ");
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    throw new ScoreException("Invalid score entered. Score must be between 0 and 100.");
                }
                scores[i] = score;
            }
        } catch (ScoreException e) {
            System.out.println("Error: " + e.getMessage() + " Setting score to 0 for the student.");
            // Set score to 0 for the student
            for (int i = 0; i < NUM_STUDENTS; i++) {
                scores[i] = 0;
            }
        } finally {
            scanner.close();
        }

        // Display student IDs and scores
        System.out.println("Student IDs and Scores:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Student ID: " + studentIDs[i] + ", Score: " + scores[i]);
        }
    }
}


