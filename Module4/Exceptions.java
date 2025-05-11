// Custom checked exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Exceptions {

    // Method that may throw built-in and custom exceptions
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // throw built-in
        }
        return a / b;
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be 18 or older."); // throw custom
        }
        System.out.println("Age OK: Access granted");
    }

    public static void main(String[] args) {
        try {
            // Built-in exception handling
            int result = divide(10, 0);  // Triggers ArithmeticException
            System.out.println("Result: " + result);

            // Custom exception handling
            checkAge(16);  // Triggers AgeException

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (AgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());

        } finally {
            System.out.println("Finally block: Always runs.");
        }

        System.out.println("Program continues after exception handling...");
    }
}
