import java.util.Scanner;

public class CharactersASCIIInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("Characters and corresponding ASCII values:");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int asciiValue = (int) c;
            System.out.println("'" + c + "': " + asciiValue);
        }
    }
}
