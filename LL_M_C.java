/*
import java.util.LinkedList;
class LL_M_C {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add(100); // index based
        ll.add("Ram");
        ll.add('c');
        ll.add((100));
        ll.add(null);
        ll.add(null);
        System.out.println(ll);
    }   
}
*/

// add, addAll, remove, removeAll,contains, containsAll return type boolean and clear return type void .


import java.util.LinkedList;
class LL_M_C {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add(100); // index based
        ll.add("Ram");
        ll.add('c');
        ll.add((100));
        ll.add(null);
        ll.add(null);
        System.out.println(ll);

        ll.addFirst("aaa");
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.getFirst();
        System.out.println(ll);
        ll.getLast();
        System.out.println(ll);
    }   
}
