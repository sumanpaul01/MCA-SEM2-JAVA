import java.util.Scanner;

public class CheckCharactersInSecondString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first = scanner.nextLine();
        System.out.println("Enter the second string:");
        String second = scanner.nextLine();
        
        boolean allPresent = true;
        for (char c : first.toCharArray()) {
            if (second.indexOf(c) == -1) {
                allPresent = false;
                break;
            }
        }
        
        if (allPresent) {
            System.out.println("All characters in the first string are present in the second string.");
        } else {
            System.out.println("Not all characters in the first string are present in the second string.");
        }
    }
}
