import java.util.Scanner;

public class WordGroupCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the word or group of words to count:");
        String wordGroup = scanner.nextLine();
        
        int count = countWordGroupOccurrences(input, wordGroup);
        System.out.println("Number of occurrences of the word/group: " + count);
    }
    
    public static int countWordGroupOccurrences(String input, String wordGroup) {
        int count = 0;
        int index = input.indexOf(wordGroup);
        while (index != -1) {
            count++;
            index = input.indexOf(wordGroup, index + 1);
        }
        return count;
    }
}
