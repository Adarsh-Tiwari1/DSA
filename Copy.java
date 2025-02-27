
/*
class Copy {
    String name;
    int rollNo;
    Copy(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public static void main(String[] args) {
        Copy c1 = new Copy("Ram", 101);
        Copy c2 = new Copy("Sita", 201);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
*/


/*
class Copy {
    String name;
    int rollNo;
    Copy(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {  // Overriding toString() method
        return "Name: " + name + ", Roll No: " + rollNo;
    }
    public static void main(String[] args) {
        Copy c1 = new Copy("Ram", 101);
        System.out.println(c1); // This will call the toString() method automatically
    }
}
*/


/*
class Copy{
    int i;
    Copy(int i){
        this.i = i;
    }
    public String toString(){
        return Integer.toString(i);
    }
    public static void main(String[] args) {
        Copy c = new Copy(100);
        System.out.println(c);
    }
}
*/

/*
class Copy{
    int i;
    Copy(int i){
        this.i = i;
    }
    public String toString(){
        return i + "";
    }
    public static void main(String[] args) {
        Copy c = new Copy(10);
        System.out.println(c);
    }
}
*/

/*
class Copy{
    String name;
    String naam;
    Copy(String name, String naam){
        this.name = name;
        this.naam = naam;
    }
    public static void main(String[] args) {
        Copy c = new Copy("Ram", "Sita");
        Copy c2 = c;
        System.out.println(c.equals(c2));
    }
}
*/

