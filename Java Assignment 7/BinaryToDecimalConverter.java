//binary to decimal

class WrongNumberFormatException extends Exception {
    public WrongNumberFormatException(String message) {
        super(message);
    }
}

public class BinaryToDecimalConverter {
    public static int binaryToDecimal(String binary) throws WrongNumberFormatException {
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new WrongNumberFormatException("Invalid binary number format: " + binary);
            }
        }
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No number provided.");
            return;
        }

        String number = args[0];
        try {
            int decimal = binaryToDecimal(number);
            System.out.println("Decimal equivalent of binary number " + number + ": " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (WrongNumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
