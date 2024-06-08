import java.util.Scanner;

public class LastIndexOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the word to search for:");
        String word = scanner.nextLine();
        
        int lastIndex = input.lastIndexOf(word);
        
        if (lastIndex != -1) {
            System.out.println("Last index of '" + word + "' in the string: " + lastIndex);
        } else {
            System.out.println("Word '" + word + "' not found in the string.");
        }
    }
}
