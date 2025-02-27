// enumeration is a class type . : it is used to perform read element of clollection object(Legacy class only) .
// Legacy Classes : Vector, Stack, Hashtable, Dictionary (abstract class), Properties .

// Iterator is an interface , that allows us to traverse , through a collection like ArrayList, HashSet, etc.) one element at a time . It works with all collection classes. It allows removal of elements safely while iterating.

// Iterator : it is used to perform read and remove operations of any collection object (Legacy or Non Legacy) .
// Method : boolean hasNext() , Object next() , remove() : remove the last element .
// Inerator : it is universal cursor .


// ListIterator : ListIterator is an enhanced version of Iterator , that allows bidirectional (forward & backward) traversal of a list .  It is available only for List types (like ArrayList, LinkedList). : list implement class me use hoti hai. ArrayList , LinkedList, Vector, Stack
// Method : boolean hasNext(), Object next(), hasPrevious(), Object previous(), add(), set(), remove(), previousIndex()

/*
import java.util.ArrayList;
class Coll {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add("Hello");
        al.add('A');
        al.add(1845.75f);
        System.out.println("Print ArrayList : " + al);
        System.out.println("Print using for loop");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i) + ", ");
        }
        System.out.println("Print Dada Using for each");
        for(Object ob : al){
            System.out.print(ob + ", ");
        }
    }
}
*/

/*
import java.util.ArrayList;
import java.util.Iterator;
class Coll {
    public static void main(String[] args) {
        // Create an ArrayList with mixed data types
        ArrayList<Object> al = new ArrayList<>();
        al.add(10);
        al.add("Hello");
        al.add('A');
        al.add(1845.75f);
        // Print the ArrayList directly
        System.out.println("Print ArrayList: " + al);
        // Print using Iterator
        System.out.println("Print Data Using ArrayList Iterator:");
        Iterator<Object> itr = al.iterator(); // Get Iterator from ArrayList
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Print each element
        }
    }
}
*/

/*
import java.util.ArrayList;
import java.util.Iterator;

class Coll {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(100);
        al.add("al");
        al.add(4785.52f);
        al.add(10);
        Iterator<Object> itr = al.iterator(); // Iterator is an interface and cannot be instantiated directly.
        while (itr.hasNext()) {
            Object value = itr.next(); // Retrieve the next element
            if (value.equals(100)) {
                itr.remove();
            } else {
                System.out.println(value); // Print remaining elements
            }
        }
    }
}
*/

/*
import java.util.ArrayList;
import java.util.Iterator;
class Coll{
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(10);
        al.add("Ram");
        al.add(500);
        Iterator<Object> itr = al.iterator();
        while(itr.hasNext()){
            Object value = itr.next();
            if(value.equals("Ram")){
                itr.remove();;
            }else{
                System.out.println(value);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Iterator;
class Coll{
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(10);
        al.add("Ram");
        al.add(500);
        Iterator<Object> itr = al.Iterator();
        while(itr.hasNext()){
            Object value = itr.next();
            if(value.equals("Ram")){
                itr.remove();;
            }else{
                System.out.println(value);
            }
        }
    }
}
*/

/*
import java.util.ArrayList;
import java.util.ListIterator;
class Al{
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(10);
        al.add("Ram");
        al.add(123.21f);
        al.add(125.12);
        ListIterator itr = al.listIterator();
        while(itr.hasNext()){
            Object value = itr.next();
            if(value.equals(123.21f)){
                itr.remove();
            }else{
                System.out.print(value + ", ");
            }
        }
    }
}
*/

