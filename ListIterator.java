
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class ListIterator {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("Ram");
        l.add("Raja");
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


