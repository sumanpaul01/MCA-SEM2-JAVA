/*Write a program to accept value of apple sales for each day of the week (using array of type float) and then, calculate the average sale of the week.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array to store apple sales for each day of the week
        float[] sales = new float[7];
        // Prompt the user to enter sales for each day of the week
        System.out.println("Enter apple sales for each day of the week:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            sales[i] = scanner.nextFloat();
        }
        // Calculate the total sales for the week
        float totalSales = 0;
        for (float sale : sales) {
            totalSales += sale;
        }
        // Calculate the average sale for the week
        float averageSale = totalSales / 7;
        // Display the average sale for the week
        System.out.println("Average sale for the week: " + averageSale);
    }
}