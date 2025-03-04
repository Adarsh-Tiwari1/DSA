/*
import java.util.HashMap;
import java.util.Map;
class Map1 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(101,"Ram");
        m.put(102,"Shyam");
        m.put(103,"Radha");
        m.put(104,"Krishna");
        System.out.println(m);
        m.clear();
        System.out.println(m.containsKey(102)); // return boolean value
        System.out.println(m.containsValue("shyam"));  // return boolean value .
        System.out.println(m.get(102));
        System.out.println(m.replace(102, "Raja"));
        System.out.println(m.size());
    }
}
*/

/*
import java.util.HashMap;
import java.util.Map;
class Map1 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(101,"Ram");
        m.put(102,"Shyam");
        m.put(103,"Radha");
        m.put(104,"Krishna");

        m.put(102, "Computer"); // do not store dublicate key , if you are insert  new value update
        m.put(null, null);
        
        System.out.println(m);

    }
}
*/

/*
import java.util.HashMap;
import java.util.Map;
class Map1{
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<>();
        m.put(101, "India");
        m.put(102, 'A');
        m.put("Ram", 105);
        for(Map.Entry<Object, Object> entry : m.entrySet()){
            System.out.println("key : " + entry.getKey() + " value -> " + entry.getValue());
        }
    }
}
*/