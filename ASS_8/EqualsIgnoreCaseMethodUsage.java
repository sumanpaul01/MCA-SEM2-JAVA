import java.util.Scanner;

public class EqualsIgnoreCaseMethodUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        boolean areEqualIgnoreCase = useEqualsIgnoreCaseMethod(first, second);
        if (areEqualIgnoreCase)
            System.out.println("Both strings are equal ignoring case.");
        else
            System.out.println("Strings are not equal ignoring case.");
        scanner.close();
    }

    private static boolean useEqualsIgnoreCaseMethod(String first, String second) {
        return first.equalsIgnoreCase(second);
    }
}
