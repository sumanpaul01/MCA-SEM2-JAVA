//Quiz management system...

import java.util.Scanner;

class NotCorrectException extends Exception {
    public NotCorrectException(String message) {
        super(message);
    }
}

public class QuizManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Questions
            String[] questions = {
                "What is the capital of France?",
                "What is the capital of Japan?",
                "What is the largest mammal?",
                "What is the chemical symbol for water?",
                "What is the tallest mountain in the world?"
            };

            // Answers
            String[] answers = {"Paris", "Tokyo", "Blue Whale", "H2O", "Mount Everest"};

            // Ask questions and get user answers
            for (int i = 0; i < questions.length; i++) {
                System.out.println("Question " + (i + 1) + ": " + questions[i]);
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();

                // Check if the answer is correct
                if (!userAnswer.equalsIgnoreCase(answers[i])) {
                    throw new NotCorrectException("Answer to question " + (i + 1) + " is not correct.");
                } else {
                    System.out.println("Good! The answer is correct.");
                }
            }
        } catch (NotCorrectException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
