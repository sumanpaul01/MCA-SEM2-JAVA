import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text or sentence:");
        String text = scanner.nextLine();
        
        int wordCount = countWords(text);
        System.out.println("Number of words: " + wordCount);
    }
    
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
