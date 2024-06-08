/*Write a program that reads ten numbers, computes their average, and finds out how many numbers are above the average. [Use this keyword] */
import java.util.Scanner;
public class Main {
    private int[] numbers;
    private double average;
    public Main() {
        numbers = new int[10];
    }
    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }
    public void calculateAverage() {
        int sum = 0;
        for (int num : this.numbers) {
            sum += num;
        }
        this.average = (double) sum / numbers.length;
    }
    public int countAboveAverage() {
        int count = 0;
        for (int num : this.numbers) {
            if (num > this.average) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.readNumbers();
        main.calculateAverage();
        int aboveAverageCount = main.countAboveAverage();
        System.out.println("Average: " + main.average);
        System.out.println("Number of numbers above average: " + aboveAverageCount);
    }
}