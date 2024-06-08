/*Write a program that reads ten integers and displays them in the reverse of the order in which they were read.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array to store the ten integers
        int[] numbers = new int[10];
        // Read ten integers
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Display the integers in reverse order
        System.out.println("Integers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}