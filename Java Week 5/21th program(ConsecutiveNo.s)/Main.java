/*Write program, which finds the sum of numbers formed by consecutive digits. Input : 2415 output : 24+41+15=80.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Convert the number to a string
        String numberString = Integer.toString(number);
        // Variable to store the sum
        int sum = 0;
        // Iterate through the digits of the number
        for (int i = 0; i < numberString.length() - 1; i++) {
            // Extract consecutive digit pairs and convert them to integers
            int digit1 = Character.getNumericValue(numberString.charAt(i));
            int digit2 = Character.getNumericValue(numberString.charAt(i + 1));
            // Form the number from consecutive digits and add it to the sum
            int consecutiveNumber = Integer.parseInt("" + digit1 + digit2);
            sum += consecutiveNumber;
            // Print the consecutive number
            System.out.print(consecutiveNumber);
            // Add "+" if it's not the last pair
            if (i < numberString.length() - 2) {
                System.out.print("+");
            }
        }
        // Print the result
        System.out.println("=" + sum);
    }
}