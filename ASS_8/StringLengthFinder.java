import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int length = findStringLength(str);
        System.out.println("Length of the string is: " + length);
        scanner.close();
    }

    private static int findStringLength(String str) {
        return str.length();
    }
}
