import java.util.Scanner;

public class UppercaseFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1)).append(" ");
            }
        }
        
        System.out.println("String with first letter of each word in uppercase:");
        System.out.println(result.toString().trim());
    }
}
