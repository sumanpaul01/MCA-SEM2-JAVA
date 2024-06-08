//2.16
import java.util.*;

public class binary_dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert binary to decimal
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = binary_decimal(binary);
        System.out.println("Decimal equivalent: " + decimal);

        // Convert decimal to binary
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();
        String binaryEquivalent = decimal_binary(number);
        System.out.println("Binary equivalent: " + binaryEquivalent);

        scanner.close();
    }

    public static int binary_decimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static String decimal_binary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }
}
