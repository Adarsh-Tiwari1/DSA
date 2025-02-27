/*
import java.util.ArrayList;
class Collection {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100); // not int its object
        al.add("Ram");
        al.add('c');
        System.out.println(al);
        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        System.out.println(al2);

        al.add(al2);
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;
class Collection {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100); // not int its object
        al.add("Ram");
        al.add('c');
        System.out.println(al);
        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;
class Collection{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Ram");
        al.add('A');
        System.out.println(al);
        System.out.println(al.add("aaa"));
        System.out.println(al);

        System.out.println(al.contains(100)); // contains means al ke under 100 hai ke nahi .
        System.out.println(al.contains(500));

        System.out.println(al.isEmpty());
        System.out.println(al.size());
        al.remove(0); // put index value
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;
class Collection {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(null);
        al.add(null);
        al.add(null);
        al.add(null);
        al.add(null);
        for(int i=0;i<al.size();i++){
            if(al==null){
                System.out.println("Data is Found");
            }
        }
    }
}
*/

/*
import java.util.ArrayList;
class Collection{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Ram");
        al.add('A');
        
        ArrayList al2 = new ArrayList();
        al2.add(100);
        al2.add("RAM");
        al2.add('a');

        al.removeAll(al2);  // remove same element al and al2
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;
class Collection {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add("Ram");
        al.add("radha");

        ArrayList al2 = new ArrayList<>();
        al2.add(100);
        al.add("ram");
        al.add("Radha");

        al.removeAll(al2); // remove same element
        System.out.println(al);
    }
}
*/

/*
import java.util.ArrayList;
class Collection{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Ram");
        al.add('A');
       al.clear(); // al data clear // clear method return void  { means kuch ve nahi }
       System.out.println(al);
    }
}
*/