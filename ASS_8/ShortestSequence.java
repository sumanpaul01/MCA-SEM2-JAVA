import java.util.Scanner;

public class ShortestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = i + j;
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        int i = str1.length();
        int j = str2.length();
        StringBuilder sequence = new StringBuilder();
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                i--;
                j--;
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                sequence.append("Delete ").append(str1.charAt(i - 1)).append(", ");
                i--;
            } else {
                sequence.append("Insert ").append(str2.charAt(j - 1)).append(", ");
                j--;
            }
        }
        while (i > 0) {
            sequence.append("Delete ").append(str1.charAt(i - 1)).append(", ");
            i--;
        }
        while (j > 0) {
            sequence.append("Insert ").append(str2.charAt(j - 1)).append(", ");
            j--;
        }

        if (sequence.length() > 0) {
            System.out.println("Shortest sequence of insertions and deletions:");
            System.out.println(sequence.substring(0, sequence.length() - 2)); // Remove trailing comma and space
        } else {
            System.out.println("No sequence of insertions and deletions needed.");
        }
    }
}
