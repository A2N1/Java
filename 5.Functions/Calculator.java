/**
 * Demonstrates defining and using methods in Java.
 */
public class Calculator {
    /**
     * Adds two integers.
     *
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Result: " + result);
    }
}