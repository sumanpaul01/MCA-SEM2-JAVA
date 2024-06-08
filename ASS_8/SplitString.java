import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the delimiter:");
        String delimiter = scanner.nextLine();
        
        String[] substrings = input.split(delimiter);
        
        System.out.println("Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
