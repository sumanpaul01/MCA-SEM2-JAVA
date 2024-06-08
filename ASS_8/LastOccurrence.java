import java.util.Scanner;

public class LastOccurrence{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the substring to search for:");
        String substring = scanner.nextLine();

        int lastIndex = input.lastIndexOf(substring);

        if (lastIndex != -1) {
            System.out.println("Last occurrence of substring is at index: " + lastIndex);
        } else {
            System.out.println("Substring not found in the string.");
        }
    }
}
