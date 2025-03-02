
import java.util.TreeSet;
class Tree {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        // ts.add(40);
        // ts.add(60); // not follow insertion order
        // ts.add(20);
        // ts.add(30); // TreeSet follow the sorting order
        // ts.add(10);
        // System.out.println(ts);


        // ts.add("Ram");
        // ts.add("Sita");
        // ts.add("Radha");
        // ts.add("Krishna");
        // System.out.println(ts);

        // ts.add(null); // NullPointerException
        // System.out.println(ts);

        // ts.clear();
        // System.out.println(ts);

        ts.remove(10);
        System.out.println(ts);
    }    
}
