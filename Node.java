// linear | Singly Linked List | The last node points to NULL | Traversal is possible only in one direction | Each node has two parts: data and a pointer to the next node .
// Doubly Linked List | Each node has three parts | data, a pointer to the next node, and a pointer to the previous node.
// Circular Linked List | The last node points back to the first node instead of NULL
// Data - Stores the actual value | Next - A reference to the next node .
// Efficient Insertions/Deletions: Adding or removing nodes is easier compared to arrays (no shifting needed).
// new node banane ke liye node class ka object bna dete hai .

/*
class Node {
    int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null; 
            System.out.println("Node created Success");
        }
        public void display(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.println("-->"+temp.data);
                temp=temp.next;
            }
        }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        System.out.println("Print Data of Singly Linked List");
        System.out.println(".."+first.data+".."+second.data+".."+third.data+".."+first.data);
        System.out.println("Print data of singly linked list using head");
        System.out.println(head.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println("Print data od singly lingked list using method");
        head.display(head); 
    }
}
*/

/*
class Node {
    int data;   // Stores the data of the node
    Node next;  // Reference to the next node in the list

    public Node(int data) {  // Constructor
        this.data = data;    // Assigns data to the node
        next = null;         // Initially, the next pointer is null
        System.out.println("Node Created Success");
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node head = first; // head is a reference to the first node.
        first.next = second;
        second.next = third;
        third.next = forth;
        System.out.println("Print Data of Singly Linked List");
        System.out.println(".."+first.data+".."+second.data+".."+third.data+".."+first.data);
    }
}
*/

/*
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
        System.out.println("Node creation Success");
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(30);
        Node head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println(first.data + second.data + third.data + fourth.data);
    }
}
*/

/*
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        // Linking nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Traversing the linked list
        Node head = first;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
*/


/*
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        next = null;
        System.out.println("Node Create Success: " + data);
    }
    // Display the linked list
    public void display() {
        Node temp = this; // Start from the current node
        while (temp != null) {
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
        System.out.println(); // Move to the next line
    }
    public static void main(String[] args) {
        Node first = new Node(0);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        // Linking nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Display the linked list
        first.display();
    }
}
*/


/*
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
    public void display(){
        Node temp = this;
        while(temp != null){
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(10);
        Node third = new Node(10);
        Node fourth = new Node(10);

        Node head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        first.display();
    }
}
*/

// insert new node in singly linked list at the starting .

/*
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
        System.out.println("Node Created Success");
    }
    public void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
    }
    public Node addNodeAtStart(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node seconde = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node head = first;
        first.next = seconde;
        seconde.next = third;
        third.next = fourth;
        fourth.next = fifth;
        System.out.println("Print Data of Singly Linked List Using Method");
        head.display(head);
        head = head.addNodeAtStart(head, 100);
        head.display(head);
    }
}
*/

/*
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
        System.out.println("Node Created: " + data);
    }
}
class LinkedList {
    Node head;
    // Insert a new node at the beginning
    public void addNodeAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to the old head
        head = newNode; // Head now becomes the new node
    }
    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Creating nodes and linking them
        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        System.out.println("Singly Linked List:");
        list.display();
        // Insert a node at the beginning
        list.addNodeAtStart(100);
        System.out.println("After inserting 100 at the start:");
        list.display();
    }
}
*/

// insert new Node at end of the Singly Linked List .

/*
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
        System.out.println("Node Created Success");
    }
    public void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println("-->" + temp.data);
            temp = temp.next;
        }
    }
    public void addNewNodeAtEnd(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head; // Traverse the list
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode; // Setting the last node next pointer to the new node
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node head = first;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        head.display(head);
        System.out.println("Print data at last Node");
        head.addNewNodeAtEnd(head, 100);
        head.display(head);
    }
}
*/


// delete first node of singly linked list

/*
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
        System.out.println("Node Created");
    }
    public void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println("-->" + temp.data);
            temp = temp.next;
        }
    }
    public deleteFirstNode(Node head){
    }
}
*/


/*
class Node{
    Node prev;
    int data;
    Node next;
    public Node(int data){
        prev = null;
        this.data = data;
        next = null;
        System.out.println("Node Created in doubly Linded list");
    }
    public void printForwardDirection(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println("--->" + temp.data);
            temp = temp.next;
        }
    }
    public void printBackwardDirection(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.println("--->" + temp.data);
            temp = temp.prev;
        }
    }
    public static void main(String[] args) {
        Node f1 = new Node(10);
        Node f2 = new Node(20);
        Node f3 = new Node(30);
        Node f4 = new Node(40);
        f1.next = f2;
        f2.prev = f1;

        f2.next = f3;
        f3.prev = f2;

        f3.next = f4;
        f4.prev = f3;

        Node head = f1;
        Node tail = f4;
        System.out.println("Print Data of Doubly Linked in foward direction");
        head.printForwardDirection(head);
        System.out.println("\nPrint data of doubly lined lin backword diection");
        head.printBackwardDirection(tail);
    }
}
*/


class Node{
    public Node prev;
    public int data;
    public Node next;
    public Node(int data){
        prev = null;
        this.data = data;
        next = null;
        System.out.println("Node Creation Success");
    }
    public void printForward(Node head){
        Node temp = head;
        do{
            System.out.println("-->" + temp.data);
            temp = temp.next;
        }while(temp != head);
    }
    public void printBackward(Node head){
        Node temp = head;
        do{
            System.out.println("-->" + temp.data);
            temp = temp.prev;
        }while(temp != head);
    }
    public static void main(String[] args) {
        Node f1 = new Node(10);
        Node f2 = new Node(10);
        Node f3 = new Node(10);

        f1.next = f2;
        f2.prev = f1;
        f2.next = f3;
        f3.prev = f2;
        f3.next = f1;
        f1.prev = f3;
        Node tail = f3;
        System.out.println("Print Data of Singly Linked List forward Direction");
        //head.printForward(f1);
        System.out.println("");
    }
}