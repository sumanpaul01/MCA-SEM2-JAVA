//Write a java program to create an custom Exception that would handle at least 2 kind of Arithmetic Exceptions while calculating a given equation (e.g. X+Y*(P/Q)Z-I) 

class InvalidEquationException extends Exception {
    public InvalidEquationException(String message) {
        super(message);
    }
}

public class EquationCalculator {
    public static double calculateEquation(double X, double Y, double P, double Q, double Z, double I) throws InvalidEquationException {
        try {
            double result = X + Y * (P / Q) * Z - I;
            return result;
        } catch (ArithmeticException e) {
            throw new InvalidEquationException("Arithmetic Exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            double X = 10, Y = 5, P = 20, Q = 0, Z = 3, I = 2;
            double result = calculateEquation(X, Y, P, Q, Z, I);
            System.out.println("Result of the equation: " + result);
        } catch (InvalidEquationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
