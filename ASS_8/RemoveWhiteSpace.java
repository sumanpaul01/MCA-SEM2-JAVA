import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with white spaces: ");
        String str = scanner.nextLine();
        String stringWithoutSpaces = removeWhiteSpace(str);
        System.out.println("String without white spaces: " + stringWithoutSpaces);
        scanner.close();
    }

    private static String removeWhiteSpace(String str) {
        return str.replaceAll("\\s", "");
    }
}
