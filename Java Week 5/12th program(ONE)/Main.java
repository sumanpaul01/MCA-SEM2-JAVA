/*Write a program which will accept an integer from the user and pass the value to a method called PrintNumberInWord that will print "ONE", "TWO",... , "NINE", "ZERO" if the integer variable "number" is 1, 2,... , 9, or 0, respectively. */
import java.util.Scanner;
public class Main {
    // Method to print number in word
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("Number out of range!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept an integer from the user
        System.out.print("Enter an integer between 0 and 9: ");
        int number = scanner.nextInt();
        // Call the method to print the number in word
        printNumberInWord(number);
        scanner.close();
    }
}