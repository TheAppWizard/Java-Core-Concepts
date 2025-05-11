// Debugging and logging are essential for identifying issues in code, and java.util.
// logging is a built-in library for handling logging in Java.

import java.util.logging.*;

public class Logging {
    // Create a Logger
    private static final Logger logger = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {
        // Setting the logging level to show all logs (INFO and above)
        logger.setLevel(Level.ALL);

        try {
            logger.info("Program started.");
            int result = divide(10, 2);
            logger.info("Division result: " + result);
            
            // Log a warning
            result = divide(10, 0);
            logger.info("Division result: " + result);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception caught: ", e);
        }
        
        logger.info("Program ended.");
    }

    // A method that divides two numbers
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            logger.warning("Attempted to divide by zero.");
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
