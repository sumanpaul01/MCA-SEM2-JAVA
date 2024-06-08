//Write a program that takes a value at the command line for which factorial is to be computed. The program must convert the string to its integer equivalent.....

public class FactorialCalculator {
    public static long computeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        if (n == 0) {
            throw new IllegalArgumentException("Value cannot be zero");
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No argument provided");
            }

            int value = Integer.parseInt(args[0]);

            if (value == (int) value) { // Checking if the value is an integer
                long result = computeFactorial(value);
                System.out.println("Factorial of " + value + " is: " + result);
            } else {
                throw new NumberFormatException("Non-integer value provided");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
