
// interface, lagacy interface, 

import java.util.Vector;
import java.util.Enumeration;

class Enumeratio {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add("Ram");
        v.add(15.2);
        
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}


