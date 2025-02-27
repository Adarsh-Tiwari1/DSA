/*
import java.util.HashSet;
class HashSet1 {
   public static void main(String[] args) {
    HashSet hs = new HashSet();
    hs.add(10);
    hs.add("Ram");
    hs.add(100.55);
    System.out.println(hs); // HashSet does not follow the insertion order .
    hs.add("Ram");
    System.out.println(hs);// Hashset does not store the dublicate value .
   } 
}
*/

/* 
import java.util.HashSet;
import java.util.Iterator;
class HashSet1 {
   public static void main(String[] args) {
    HashSet hs = new HashSet();
    hs.add(30);
    hs.add(10);
    hs.add(20);
    hs.add(40);
    //System.out.println(hs); // HS does not follow sorting order .

    Iterator itr = hs.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
   }
}
*/

/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
class HashSet1 {
   public static void main(String[] args) {

    ArrayList al = new ArrayList();
    al.add("Adarsh");
    al.add("Kumar");
    al.add("Tiwari");

    HashSet hs = new HashSet(al);
    hs.add(30);
    hs.add(10);
    hs.add(20);
    hs.add(40);

    System.out.println(hs); 

    Iterator itr = hs.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
   }
}
*/

/*
import java.util.ArrayList;
import java.util.HashSet;
class HashSet1 {
   public static void main(String[] args) {

    ArrayList al = new ArrayList();
    al.add("Adarsh");
    al.add("Kumar");
    al.add("Tiwari");

    HashSet hs = new HashSet<>();
    hs.addAll(al);
    hs.add(30);
    hs.add(10);
    hs.add(20);
    hs.add(40);

    System.out.println(hs); 
   }
}
*/

/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
class HashSet1 {
   public static void main(String[] args) {

    ArrayList al = new ArrayList();
    al.add("Adarsh");
    al.add("Kumar");
    al.add("Tiwari");

    HashSet hs = new HashSet();
    hs.addAll(al);
    hs.add(10);
    hs.add(20);
    hs.add(40);

   //  System.out.println(hs); 
    Iterator itr = hs.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
   }
}
*/

/*
import java.util.ArrayList;
import java.util.HashSet;
class HashSet1 {
   public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add("Adarsh");
    al.add("Kumar");
    al.add("Tiwari");

    HashSet hs = new HashSet();
    hs.add(10);
    hs.add(20);
    hs.addAll(al);
    hs.add(40);
    
    System.out.println(hs); 
   }
}
*/

/*
import java.util.ArrayList;
import java.util.HashSet;
class HashSet1 {
   public static void main(String[] args) {

    ArrayList al = new ArrayList();
    al.add("Adarsh");
    al.add("Kumar");
    al.add("Tiwari");

    HashSet hs = new HashSet();
    hs.addAll(al);
    hs.add(10);
    hs.add(20);
    hs.add(40);

    System.out.println(hs); 

    System.out.println(hs.contains("Adarsh"));
    System.out.println(hs.size());
   }
}
*/