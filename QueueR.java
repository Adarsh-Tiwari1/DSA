// linear | FIFO || 
// Enqueue : Adds an element to the end of the queue.
// Dequeue: Removes an element from the front of the queue.
// Type || Simple Queue, Circular Queue, Priority Queue, Deque (Double-Ended Queue) 

/*
class QueueR {
    static int arr[] = new int[5];
    static int front = -1;
    static int rear = -1;
    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }
    public static boolean isFull() {
        return rear == arr.length - 1;
    }
    public static void enq(int data){
        if(isFull()){
            System.out.println("this over flow condition ");
        }else if(isEmpty()){
            front++;
            rear++;
            arr[rear] = data;
            System.out.println("First element isert into quese");
        }else{
            rear++;
            arr[rear] = data;
            System.out.println("Data insert after first element " + front + " " + rear  );
        }
    }
       public static void main(String[] args) {
       enq(10);
       enq(10);
       enq(10);
       enq(10);
       enq(10);
       enq(10);
       enq(10);
    }
}
*/



//  Dequeue
/*
class QueueR {
    static int arr[] = new int[5];
    static int front = -1;
    static int rear = -1;
    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }
    public static boolean isFull() {
        return rear == arr.length - 1;
    }
    public static void enq(int data){
        if(isFull()){
            System.out.println("this over flow condition ");
        }else if(isEmpty()){
            front = rear = 0;
            arr[rear] = data;
            System.out.println("First element isert into quese");
        }else{
            rear++;
            arr[rear] = data;
            System.out.println("Data insert after first element " + front + " " + rear  );
        }
    }

    public static int deq(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else if(front == rear){ // only one element left
            int val = arr[front];
            front = -1;
            rear = -1;
            System.out.println(val);
            return val;
        }
        else{
            int val = arr[front];
            front++;
            System.out.println(val);
            return val;
        }
    }
       public static void main(String[] args) {
       enq(10);
       enq(10);
       enq(10);
       enq(10);
       enq(10);
       enq(10);
       enq(10);
    }
}
*/

/*
class QueueR {
    static int arr[] = new int[5];
    static int front = -1;
    static int rear = -1;
    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }
    public static boolean isFull() {
        return rear == arr.length - 1;
    }
    public static void enq(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + data);
        } else if (isEmpty()) {
            front = rear = 0;
            arr[rear] = data;
            System.out.println("First element inserted: " + data);
        } else {
            rear++;
            arr[rear] = data;
            System.out.println("Element inserted: " + data);
        }
    }
    public static int deq() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else if (front == rear) { // Only one element left
            int val = arr[front]; 
            front = rear = -1; // Reset queue
            System.out.println("Last element dequeued: " + val);
            return val;
        } else {
            int val = arr[front]; 
            front++; // Move front forward
            System.out.println("Dequeued: " + val);
            return val;
        }
    }
    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        enq(10);
        enq(20);
        enq(30);
        enq(40);
        enq(50);
        enq(60); // This will print "Queue is full"

        display(); // Show queue before deletion

        deq(); // Remove first element (10)
        deq(); // Remove second element (20)
        
        display(); // Show remaining elements
    }
}
*/

