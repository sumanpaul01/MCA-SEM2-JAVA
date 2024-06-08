import java.util.Scanner;

public class CompareToMethodUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        int comparisonResult = useCompareToMethod(first, second);
        if (comparisonResult == 0)
            System.out.println("Both strings are equal.");
        else if (comparisonResult < 0)
            System.out.println("First string is lexicographically smaller than the second string.");
        else
            System.out.println("First string is lexicographically greater than the second string.");
        scanner.close();
    }

    private static int useCompareToMethod(String first, String second) {
        return first.compareTo(second);
    }
}
