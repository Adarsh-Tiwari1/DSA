

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class HastSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(10);
        s.add(30);
        s.add(100);
        System.out.println(s);
        s.add(100); // no dublicate value allow 
        System.out.println(s);
        s.add(null);
        System.out.println(s);
        s.add(null); // no dublicate value
        System.out.println(s);

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
