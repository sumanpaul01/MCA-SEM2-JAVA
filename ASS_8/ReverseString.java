import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string:");
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
