// because the TreeMap does not store elements in a list-like structure where the index can be used directly .
// implements the NavigableMap interface and stores key-value pairs in sorted order based on the keys .

/*
import java.util.TreeMap;
class TreeMap1 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(109, "Ram");
        map.put(102, "Rama");
        map.put(107, "Shyam");
        map.put(108, "Radha");
        // System.out.println(map); 
        for(int i=0;i<map.size();i++){  // TreeMap not index based
            System.out.println(map.get(i));
        }
    }
}
*/

/*
import java.util.TreeMap;
class TreeMap1 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put("Ram", 109);
        map.put("Rama", 102);
        map.put("Shyam", 107);
        map.put("Radha", 108);
        System.out.println(map); 
        map.clear();
        System.out.println(map); 
    }
}
*/

/*
import java.util.TreeMap;
class TreeMap1 {
    public static void main(String[] args) {
        // Declare TreeMap with proper generics
        TreeMap<String, Integer> tm = new TreeMap<>();      
        // Add an entry to the TreeMap
        tm.put("Ram", 100);       
        // Print the TreeMap
        System.out.println(tm);
    }
}
*/

/*
import java.util.TreeMap;
class TreeMap1 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put(100, "Ram");
        tm.put(102, "Radha");
        tm.put(103, "Krishna");
        tm.put(104, "Sita");
        tm.put(105, "Mahadev");
        System.out.println(tm);
        System.out.println(tm.put(6, "O My God"));
        tm.get(103);
        System.out.println(tm);
        tm.remove(105);
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.size());
    }
}
*/

/*
import java.util.TreeMap;
import java.util.Map;

class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Ram", 102);
        tm.put("ram", 110);
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
*/

/*
import java.util.*;
class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tr = new TreeMap<>();
        tr.put(100, 101);
        tr.put(102, 101);
        for(Map.Entry<Integer, Integer> entry : tr.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
*/

/*
import java.util.TreeMap;
class TreeMap1 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put("Ram", 109);
        map.put("Rama", 102);
        map.put("Shyam", 107);
        map.put("Radha", 108);
        System.out.println(map);
        System.out.println(map.containsKey(102));
        System.out.println(map.firstEntry()); // return proper value
        System.out.println(map.floorEntry(102)); // lower then and equal to valup print
        System.out.println(map.get(108)); // if value not find so return null value
        System.out.println(map.headMap(102));
        System.out.println(map.higherEntry(107));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.pollFirstEntry());
        System.out.println(map);
        map.remove(107);
        System.out.println(map);
        map.replace(108, "Ramesh");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.subMap(102, 109));
    }
}
*/