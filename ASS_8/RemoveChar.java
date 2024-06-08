import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first = scanner.nextLine();
        System.out.println("Enter the second string:");
        String second = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < second.length(); i++) {
            char currentChar = second.charAt(i);
            if (first.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }
        
        System.out.println("Resultant string after removal:");
        System.out.println(result.toString());
    }
}
