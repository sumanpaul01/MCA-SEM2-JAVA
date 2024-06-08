/*Write a test program that prompts the user to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%), and print a table that displays future value for the years from 1 to 30, as shown below:
The amount invested: 1000
Annual interest rate: 9%
Years Future Value
1 1093.8
2 1196.41
...
29 13467.25
30 14730.57 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the investment amount
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();
        // Prompt the user to enter the annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        // Convert annual interest rate from percentage to decimal
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        // Display table header
        System.out.println("\nYears\tFuture Value");
        System.out.println("---------------------");
        // Calculate and display future value for each year from 1 to 30
        for (int years = 1; years <= 30; years++) {
            double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
            System.out.printf("%d\t%.2f\n", years, futureValue);
        }
    }
}