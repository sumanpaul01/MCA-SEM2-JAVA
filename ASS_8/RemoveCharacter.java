import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.nextLine().charAt(0);

        String result = input.replaceAll(String.valueOf(charToRemove), "");

        System.out.println("String after removing '" + charToRemove + "':");
        System.out.println(result);
    }
}
