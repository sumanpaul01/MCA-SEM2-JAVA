import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the word to search for:");
        String word = scanner.nextLine();

        boolean found = input.contains(word);

        if (found) {
            System.out.println("Word '" + word + "' found in the string.");
        } else {
            System.out.println("Word '" + word + "' not found in the string.");
        }
    }
}
