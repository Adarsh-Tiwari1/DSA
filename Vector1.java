// if the current capacity is 10 and an 11th element is added, the capacity will increase to 20 .

/*
import java.util.Vector;
class Vector1 {
   public static void main(String[] args) {
    Vector v = new Vector(); // initial capacity 10
    v.add("Ram");
    v.add("Rama");
    v.add(120.5);
    v.add('a');
    v.add("Ram");
    System.out.println(v);
    System.out.println(v.removeElement('a'));
    System.out.println(v);

    v.removeElement("Rama");
    System.out.println(v);
    System.out.println(v.capacity());
   } 
}
*/

/*
import java.util.Vector;
class Vector1 {
   public static void main(String[] args) {
      Vector v = new Vector<>();
      v.add(100);
      v.add("Ram");
      v.add(100.5);
      for(int i=0;i<v.size();i++){
         System.out.println(v.get(i));
      }
   }
}
*/


/*
import java.util.Vector;
class Vector1 {
   public static void main(String[] args) {
      Vector v = new Vector<>();
      v.add(100);
      v.add("Ram");
      v.add(100.5);
      for(int i=0;i<v.size();i++){
         System.out.println(v.get(i));
      }
   }
}
*/

/*
import java.util.Vector;
import java.util.Iterator;
class Vector1 {
   public static void main(String[] args) {
      Vector v = new Vector<>();
      v.add(100);
      v.add("Ram");
      v.add(100.5);
      
      Iterator itr = v.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
}
*/

/*
import java.util.Vector;
class Vector1 {
   public static void main(String[] args) {
      Vector v = new Vector<>();
      v.add(100);
      v.add(200);
      v.add("Ram");
      System.out.println(v.firstElement());
      System.out.println(v.lastElement());
      System.out.println(v.size());
      System.out.println(v.capacity());
   }
}
*/