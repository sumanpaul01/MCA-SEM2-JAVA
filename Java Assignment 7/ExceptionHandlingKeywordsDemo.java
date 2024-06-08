//Write a Java program to show the use of all keywords for exception handling.

public class ExceptionHandlingKeywordsDemo {
    public static void main(String[] args) {
        try {
            // throw keyword: Throws a specific exception
            throw new Exception("This is a custom exception message.");
        } catch (Exception e) {
            // catch keyword: Catches an exception
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            // finally keyword: Executes code regardless of whether an exception occurred or not
            System.out.println("Inside finally block.");
        }

        try {
            int[] arr = new int[5];
            // IndexOutOfBoundsException
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Specific exception catch block
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            // Generic exception catch block
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            String str = null;
            // NullPointerException
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        try {
            int result = 10 / 0;
            // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            // Try-with-resources: Automatically closes resources after try block execution
            tryWithResources();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            // Custom exception handling
            customExceptionHandling(5);
            customExceptionHandling(10);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }

        try {
            // Throwing exceptions
            methodThrowingException(20);
            methodThrowingException(50); // This will throw an exception
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static void tryWithResources() throws Exception {
        try (Resource resource = new Resource()) {
            resource.doSomething();
        }
    }

    static void customExceptionHandling(int value) throws CustomException {
        if (value < 10) {
            throw new CustomException("Value should be greater than or equal to 10.");
        }
    }

    static void methodThrowingException(int value) throws Exception {
        if (value > 30) {
            throw new Exception("Value exceeds threshold.");
        }
    }
}

class Resource implements AutoCloseable {
    public void doSomething() throws Exception {
        System.out.println("Inside doSomething method.");
        throw new Exception("Exception inside doSomething method.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Inside close method.");
        throw new Exception("Exception inside close method.");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
