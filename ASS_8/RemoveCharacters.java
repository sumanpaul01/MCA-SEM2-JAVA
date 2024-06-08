import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first = scanner.nextLine();
        System.out.println("Enter the second string:");
        String second = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        for (char c : second.toCharArray()) {
            if (first.indexOf(c) == -1) {
                result.append(c);
            }
        }
        
        System.out.println("Resultant string after removal:");
        System.out.println(result.toString());
    }
}
