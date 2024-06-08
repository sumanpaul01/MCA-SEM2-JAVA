import java.util.Scanner;

public class IndexOfCharacterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character/string to search for:");
        String search = scanner.nextLine();
        
        int index = input.indexOf(search);
        
        if (index != -1) {
            System.out.println("Index of '" + search + "' in the string: " + index);
        } else {
            System.out.println("'" + search + "' not found in the string.");
        }
    }
}
