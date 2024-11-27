/**
 * Demonstrates loops: for, while, and do-while.
 */
public class LoopExamples {
    public static void main(String[] args) {
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // While Loop
        int i = 0;
        while (i < 5) {
            System.out.println("While Loop Iteration: " + i);
            i++;
        }

        // Do-While Loop
        int j = 0;
        do {
            System.out.println("Do-While Loop Iteration: " + j);
            j++;
        } while (j < 5);
    }
}