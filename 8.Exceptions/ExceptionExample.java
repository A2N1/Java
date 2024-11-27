/**
 * Demonstrates exception handling in Java.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}