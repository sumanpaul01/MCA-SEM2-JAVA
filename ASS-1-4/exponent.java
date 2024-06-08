//2.13
import java.util.*;

public class exponent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculate(base, exponent);

        System.out.println("Exponential of " + base + " raised to the power " + exponent + " is: " + result);

        
    }

    public static double calculate(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }
}
