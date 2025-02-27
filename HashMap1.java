/*
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class HashMap1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap(); // default load factor of HashMap = .75
        hm.put(101, "Ram");
        hm.put(102, "Rama");
        hm.put(103, "Raja");
        hm.put(104, "Raj");
        System.out.println(hm);

        Set set = hm.entrySet();
        System.out.println(set);

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());
            Map.Entry entry = (Map.Entry) itr.next(); // type casting Map.Entry
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
*/


/*
import java.util.HashMap;
import java.util.Map;
class HashMap1 {
    public static void main(String[] args) {
        HashMap <Integer, String> hm = new HashMap<>(); // < Integer, String > are generic Key { <> diamond operator }
        hm.put(101, "Ram");
        hm.put(102, "Rama");  // default load factor of HashMap = .75
        hm.put(103, "Raja");
        hm.put(104, "Raj");
        System.out.println(hm);

        for(Map.Entry<Integer, String> me : hm.entrySet()) {
            System.out.println(me.getKey() + " -> " + me.getValue());
        }
    }
}
*/

/*
import java.util.HashMap;
import java.util.Map;
class HashMap1 {
    public static void main(String[] args) {
        HashMap <Integer, String> hm = new HashMap<>(); // < Integer, String > are generic Key { <> diamond operator }
        hm.put(101, "Ram");
        hm.put(102, "Rama");  // default load factor of HashMap = .75
        hm.put(103, "Raja");
        hm.put(104, "Raj");
        hm.put(null, null);
        hm.put(101, "101");
        hm.remove(101);
        System.out.println(hm);
    }
}
*/

