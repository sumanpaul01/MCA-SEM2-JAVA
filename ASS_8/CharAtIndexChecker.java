import java.util.Scanner;

public class CharAtIndexChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        char character = getCharAtIndex(str, index);
        if (character != '\0')
            System.out.println("Character at index " + index + " is: " + character);
        else
            System.out.println("Invalid index.");
        scanner.close();
    }

    private static char getCharAtIndex(String str, int index) {
        if (index >= 0 && index < str.length())
            return str.charAt(index);
        else
            return '\0';
    }
}
