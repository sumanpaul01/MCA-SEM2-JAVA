import java.util.Scanner;

public class VowelConsecutiveOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        boolean hasConsecutiveVowels = checkConsecutiveVowels(input);
        
        if (hasConsecutiveVowels) {
            System.out.println("Consecutive occurrence of vowels found.");
        } else {
            System.out.println("No consecutive occurrence of vowels found.");
        }
    }
    
    public static boolean checkConsecutiveVowels(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            if (isVowel(current) && isVowel(next)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
