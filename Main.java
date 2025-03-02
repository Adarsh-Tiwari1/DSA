/*
import java.util.Comparator;
import java.util.TreeSet;

public class Student implements Comparator<Student>{
    private String name;
    private float per;
    public Student() {
    }
    public Student(String name, float per) {
    this.name = name;
    this.per = per;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public float getPer() {
    return per;
    }
    public void setPer(float per) {
    this.per = per;
    }
    public String toString() {
        return "Student{" + "name=" + name +  "per=" + per + '}';
        }
        
        public static void main(String[] args) {
        Student s1=new Student("Akash", 66.56f);
        Student s2=new Student("Deepak", 56.56f);
        Student s3=new Student("kartik", 46.56f);
        Student s4=new Student("Harshit", 96.56f);
        TreeSet<Student> ts=new TreeSet<Student>(new Student());
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for(Student x:ts){
            System.out.println(x.getPer()+"  " +x.getName());
}
}
@Override
public int compare(Student o1, Student o2) {
if(o1.per>o2.per){
return 1;
}else if(o1.per<o2.per){
return -1;
}else{
return 0;
}
}
}
*/



/*
import java.util.Comparator;
import java.util.TreeSet;

class Student {
    private String name;
    private float per;

    public Student(String name, float per) {
        this.name = name;
        this.per = per;
    }

    public String getName() {
        return name;
    }

    public float getPer() {
        return per;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', per=" + per + "}";
    }
}

// Comparator to sort students based on percentage
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getPer(), o2.getPer()); // Sort by percentage
    }
}

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new StudentComparator());

        ts.add(new Student("Akash", 66.56f));
        ts.add(new Student("Deepak", 56.56f));
        ts.add(new Student("Kartik", 46.56f));
        ts.add(new Student("Harshit", 96.56f));

        for (Student x : ts) {
            System.out.println(x.getPer() + "  " + x.getName());
        }
    }
}
*/