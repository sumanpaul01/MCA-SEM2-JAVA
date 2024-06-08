import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetsOfGivenLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the length of subsets: ");
        int length = scanner.nextInt();
        List<String> subsets = findAllSubsetsOfLength(str, length);
        System.out.println("All subsets of length " + length + " are:");
        for (String subset : subsets) {
            System.out.println(subset);
        }
        scanner.close();
    }

    private static List<String> findAllSubsetsOfLength(String str, int length) {
        List<String> subsets = new ArrayList<>();
        for (int i = 0; i <= str.length() - length; i++) {
            subsets.add(str.substring(i, i + length));
        }
        return subsets;
    }
}
