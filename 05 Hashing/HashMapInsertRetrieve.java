import java.util.HashMap;

public class HashMapInsertRetrieve {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert elements into the HashMap
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        // Retrieve all elements using a loop
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
