import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to search for:");
        char ch = scanner.next().charAt(0);
        
        int firstIndex = input.indexOf(ch);
        int lastIndex = input.lastIndexOf(ch);
        
        if (firstIndex == -1) {
            System.out.println("Character '" + ch + "' not found in the string.");
        } else {
            System.out.println("First occurrence of '" + ch + "' at index: " + firstIndex);
            System.out.println("Last occurrence of '" + ch + "' at index: " + lastIndex);
        }
    }
}
