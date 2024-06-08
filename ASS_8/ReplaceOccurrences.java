import java.util.Scanner;

public class ReplaceOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the string to replace:");
        String toReplace = scanner.nextLine();
        System.out.println("Enter the replacement string:");
        String replacement = scanner.nextLine();
        
        String replacedString = input.replaceAll(toReplace, replacement);
        
        System.out.println("Replaced string:");
        System.out.println(replacedString);
    }
}
