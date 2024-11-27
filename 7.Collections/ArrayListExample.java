import java.util.ArrayList;

/**
 * Demonstrates the use of ArrayList.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        /**
         * Iterating through the ArrayList.
         */
        for (String item : list) {
            System.out.println(item);
        }
    }
}