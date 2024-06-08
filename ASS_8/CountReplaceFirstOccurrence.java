import java.util.Scanner;

public class CountReplaceFirstOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();
        System.out.println("Enter the string to replace:");
        String toReplace = scanner.nextLine();
        System.out.println("Enter the replacement string:");
        String replacement = scanner.nextLine();
        
        int count = 0;
        int index = input.indexOf(toReplace);
        if (index != -1) {
            count++;
            input = input.substring(0, index) + replacement + input.substring(index + toReplace.length());
        }
        
        System.out.println("String after replacing first occurrence:");
        System.out.println(input);
        System.out.println("Number of replacements made: " + count);
    }
}
