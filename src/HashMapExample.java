import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();

        map1.put(1, 1);
        map1.put(3, 7);
        map1.put(2, 4);

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Check if key exists in map
        System.out.println("Key 1 exists: " + map1.containsKey(1));

        // Check if value exists in map
        System.out.println("Value 7 exists: " + map1.containsValue(7));

        // Get value for key
        System.out.println("Value for key 2: " + map1.get(2));

        // Remove key 1
        map1.remove(1);

        // print the map
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Create a map from Array
        Map<Integer, Integer> map2 = Map.of(1, 1, 3, 7, 2, 4);

        // print the map

        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Increment an occurrence of a key
        int key = 2;
        map1.put(key, map1.getOrDefault(key, 0) + 1);
        System.out.println(" New Value for key 2: " + map1.get(2));

        // Remove the element from the map if the value is 0
        map1.remove(key, 0);

        // print the map

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Map of Integer to List

        Map<Integer, List<Integer>> map3 = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map3.computeIfAbsent(i, k -> new ArrayList<>()).add(i);
        }

        // print the map

        for (Map.Entry<Integer, List<Integer>> entry : map3.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Create an Empty Map
        Map map4 = Collections.EMPTY_MAP;
    }
}
