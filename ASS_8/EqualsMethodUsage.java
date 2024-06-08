import java.util.Scanner;

public class EqualsMethodUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        boolean areEqual = useEqualsMethod(first, second);
        if (areEqual)
            System.out.println("Both strings are equal.");
        else
            System.out.println("Strings are not equal.");
        scanner.close();
    }

    private static boolean useEqualsMethod(String first, String second) {
        return first.equals(second);
    }
}
