import java.util.Scanner;

public class StringComparer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        boolean isEqual = compareStrings(first, second);
        if (isEqual)
            System.out.println("Both strings are equal.");
        else
            System.out.println("Strings are not equal.");
        scanner.close();
    }

    private static boolean compareStrings(String first, String second) {
        return first.equals(second);
    }
}
