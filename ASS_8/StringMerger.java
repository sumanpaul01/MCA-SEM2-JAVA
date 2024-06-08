import java.util.Scanner;

public class StringMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        String merged = mergeStrings(first, second);
        System.out.println("Merged string: " + merged);
        scanner.close();
    }

    private static String mergeStrings(String first, String second) {
        return first + second;
    }
}
