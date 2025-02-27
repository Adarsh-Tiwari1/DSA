// constructor - 1
/*
import java.util.ArrayList;
class Array_List{
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); // default capacity 10
    }
}
*/

/*
import java.util.ArrayList;
class Array_List{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println(al);
        al.add(100);
        al.add("Ram");
        al.add(100.05);
        al.add('A');
        System.out.println(al);
    }
}
*/

// constructor - 2
/*
import java.util.ArrayList;
class Array_List{
    public static void main(String[] args) {
        ArrayList al = new ArrayList(6); // initial capacity 6
    }
}
*/
// constructor - 3
/*
import java.util.ArrayList;
class Array_List{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        ArrayList al2 = new ArrayList(al);
    }
}
*/

/*
import java.util.ArrayList;
class Array_List{
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2);
        System.out.println(al.size());
        al.add(100);
        al.add(100);
        al.add(100);
        al.add(200);
        al.add(100);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.remove(3));
        System.out.println(al);
    }
}
*/

// ArrayList Method
/*
import java.util.ArrayList;
class Array_List{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10); // index based 
        al.add(20);
        al.add(30);
        System.out.println(al.contains(10));
        System.out.println(al.size());
        System.out.println(al.get(1));
        
        System.out.println(al);
        al.remove(1); // index based
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;
class Array_List{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10); // index based 
        al.add(20);
        al.add(30);
        
        // al.set(2, 100);
        // System.out.println(al);

        System.out.println(al.indexOf(100)); // This will print -1 because 100 is not in the list unless the set operation above is uncommented .

        System.out.println(al.indexOf(10));
    }
}
*/

/*
import java.util.ArrayList;
class Array_List {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(400));
        al.remove(4);
        System.out.println(al);
        System.out.println(al.get(3));
    }
}
*/

/*
import java.util.ArrayList;
class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        System.out.println(al);
        System.out.println(al.get(1));
        al.add(2,300);
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;
class Array_List {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(500);
        al.add(300);
        al.add(800);
        al.add(500);
        
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
*/

/*
import java.util.ArrayList;
import java.util.Collections;
class Array_List {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(800);
        al.add(500);
        al.add(200);
        al.add(50);
        al.add(100);

        Collections.sort(al);
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;

class Array_List {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(null);
        al.add(null);
        al.add(null);
        al.add(null);
        al.add(null);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
*/