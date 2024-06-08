import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the substring to replace:");
        String toReplace = scanner.nextLine();
        System.out.println("Enter the replacement substring:");
        String replacement = scanner.nextLine();

        String replacedString = input.replace(toReplace, replacement);

        System.out.println("String after replacement:");
        System.out.println(replacedString);
    }
}
