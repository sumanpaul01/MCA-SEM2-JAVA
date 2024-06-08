//Write a Java program using try and catch to generate NegativeArrayIndex Exception and Arithmetic Exception. 

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Generating NegativeArrayIndexException
            int[] arr = {1, 2, 3};
            System.out.println("Value at index -1: " + arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // Generating ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
