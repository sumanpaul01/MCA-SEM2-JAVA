//Create a user-defined exception named CheckArgument to check the number of arguments passed through the command line. If the number of argument is less than 5....

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class ArgumentAdder {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments provided");
            }

            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            
            System.out.println("Sum of all arguments: " + sum);
        } catch (CheckArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-integer argument provided");
        }
    }
}
