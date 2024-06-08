import java.util.Scanner;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String upperCase = input.toUpperCase();
        
        System.out.println("String in upper case:");
        System.out.println(upperCase);
    }
}
