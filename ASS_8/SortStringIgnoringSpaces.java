import java.util.Arrays;
import java.util.Scanner;

public class SortStringIgnoringSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        input = input.replaceAll("\\s", "");
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        
        StringBuilder result = new StringBuilder();
        result.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                result.append(chars[i]);
            }
        }
        
        System.out.println("Sorted string ignoring whitespaces and repeating characters once:");
        System.out.println(result.toString());
    }
}
