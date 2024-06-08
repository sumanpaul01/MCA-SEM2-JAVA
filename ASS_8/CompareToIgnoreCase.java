import java.util.Scanner;

public class CompareToIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        int result = str1.compareToIgnoreCase(str2);

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println("First string is lexicographically less than second string.");
        } else {
            System.out.println("First string is lexicographically greater than second string.");
        }
    }
}
