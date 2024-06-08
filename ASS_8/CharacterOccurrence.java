import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to search for:");
        char target = scanner.next().charAt(0);

        int frequency = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                frequency++;
                System.out.println("Character '" + target + "' found at position: " + i);
            }
        }

        if (frequency == 0) {
            System.out.println("Character '" + target + "' not found in the string.");
        } else {
            System.out.println("Frequency of character '" + target + "': " + frequency);
        }
    }
}
