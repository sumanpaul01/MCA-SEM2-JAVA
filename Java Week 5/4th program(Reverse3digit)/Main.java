/*Write a program to define a class having one 3-digit number, num as data member. Initialize and display reverse of that number. */
import java.util.*;
class ThreeDigitNumber {
    private int num;
    // Constructor
    public ThreeDigitNumber(int num) {
        if (num >= 100 && num <= 999) {
            this.num = num;
        } else {
            System.out.println("Invalid input. Please provide a 3-digit number.");
        }
    }
    // Method to calculate reverse of the number
    public int reverseNumber() {
        int reversed = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an instance of ThreeDigitNumber
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThreeDigitNumber number = new ThreeDigitNumber(n);
        // Display the reverse of the number
        System.out.println("Reversed Number: " + number.reverseNumber());
    }
}