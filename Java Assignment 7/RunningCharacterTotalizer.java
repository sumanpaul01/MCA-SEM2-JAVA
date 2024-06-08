// Write a class that keeps a running total of all characters passed to it (one at a time) and throws an exception if it is passed a non-alphabetic character. 

import java.util.Scanner;
class NonAlphabeticCharacterException extends Exception {
    public NonAlphabeticCharacterException(String message) {
        super(message);
    }
}

public class RunningCharacterTotalizer {
    private int total;

    public RunningCharacterTotalizer() {
        this.total = 0;
    }

    public void addCharacter(char ch) throws NonAlphabeticCharacterException {
        if (Character.isLetter(ch)) {
            total += Character.toLowerCase(ch) - 'a' + 1; // Converting character to lowercase and calculating its position in the alphabet
        } else {
            throw new NonAlphabeticCharacterException("Non-alphabetic character detected: " + ch);
        }
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        RunningCharacterTotalizer totalizer = new RunningCharacterTotalizer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter characters (type 'exit' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                char ch = input.charAt(0);
                totalizer.addCharacter(ch);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: No character entered.");
            } catch (NonAlphabeticCharacterException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Total of alphabetic characters: " + totalizer.getTotal());
    }
}
