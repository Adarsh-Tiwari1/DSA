// Map : A Map in Java is a part of the java.util package and represents a collection that stores key-value pairs.
// It does not allow duplicate keys, but values can be duplicated.
// Each key in the map is unique and maps to a specific value.


// 1 > HashMap (Unordered, allows one null key and multiple null values).

/*
import java.util.HashMap;
import java.util.Map;
class Mmap{
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(101, "Ram");
        hm.put(10, "Sita");
        hm.put(201, "Radha");
        hm.put(null, "Mata"); // Allows one null key
        hm.put(401, null);  // Allows null values
        hm.remove(201);
        System.out.println("Iterator Using The Map");
        for(Map.Entry<Integer, String> value : hm.entrySet()){
            System.out.println("Key : " + value.getKey() + " " + "Value : " + value.getValue());
        }
    }
}
*/

//  2 >  LinkedHashMap (Maintains insertion order)  |  Allows one null key and multiple null values.

/*
import java.util.Map;
import java.util.LinkedHashMap;
class Mmap{
    public static void main(String[] args) {
        Map<Integer, String> hm = new LinkedHashMap<>();
        hm.put(101, "null");
        hm.put(210, "Radha");
        hm.put(10, "Sita");
        System.out.println("Print value usng Map.Entry Iterator");
        for(Map.Entry<Integer, String> value : hm.entrySet()){
            System.out.println("Key : " + value.getKey() + " value : " + value.getValue());
        }
    }
}
*/

// 3>  TreeMap (Sorted order based on keys)  | Sorted in ascending order of keys | Does not allow null keys but allows null values.

// 4 > Hashtable (Thread-safe, does not allow null keys or values) || Thread-safe (synchronized). || Does not allow null keys or null values.

// 5 > ConcurrentHashMap (Thread-safe, high-performance alternative to Hashtable)
// Thread-safe but better performance than Hashtable (allows concurrent reads). || Does not allow null keys or null values.

// Use HashMap if you need fast access and don't care about ordering.
// Use LinkedHashMap if you need to maintain insertion order.
// Use TreeMap if you need sorted order based on keys.
// Use Hashtable if you need a thread-safe collection but don’t need null values.
// Use ConcurrentHashMap for better performance in multi-threaded applications.
/*
import java.util.HashMap;
class Map {
    public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("A", 19);
    hm.put("B", 18);
    hm.put("C", 14);
    hm.put("D", 51);
    hm.put("E", 21);
    System.out.println(hm);
    System.out.println(hm.keySet()); // Print only the keys
    for(String key : hm.keySet()){ // Use loop to print one by one
        System.out.println(key);
    }
    System.out.println(hm.values()); // Print Only Values
    for(Integer value : hm.values()){
        System.out.println(value); // Using loop 
    }
    }
}
*/

/*
import java.util.HashMap;
import java.util.Map;

class MapExample {
    public static void main(String[] args) {
        HashMap<Object, Object> hm = new HashMap<>();
        hm.put(1, "Ram");
        hm.put(2, "Ram");
        hm.put("Ram", 5);
        
        System.out.println(hm);
        // Iterating over HashMap entries
        for (Map.Entry<Object, Object> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
*/

