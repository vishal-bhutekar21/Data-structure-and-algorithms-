import java.util.HashMap;

public class HashMapRetrieval {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Insert elements into the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // Retrieve elements using keys
        System.out.println("Value for key 1: " + map.get(1)); // Output: Apple
        System.out.println("Value for key 2: " + map.get(2)); // Output: Banana

        // Check if a key exists before retrieving
        if (map.containsKey(3)) {
            System.out.println("Value for key 3: " + map.get(3)); // Output: Orange
        } else {
            System.out.println("Key 3 not found");
        }
    }
}
