// Adarsh@46Stack*   | 629796
// linear | LIFO | POP() : top element is remove and return | Peek() : Return top element | 
// implementation of stack : Array, Linked List, Queue

// 1. TO Check Stack is Full or not : 2. Increase Top Variable By 1 : 3. Assing data into Stack[top]
// Stack Method : Push(element):o(1), pop():o(1), peak():o(1), isEmpty():o(1), search((element) 1st-based index):o(n), isFull():o(1)
// Real life application of stack : Undo/Redo(Text Editor, PhotoShop) , Back/Forword navigation(Web browser), 
// Slower because it extends Vector (which is synchronized)
// time complexity Bigo(n)

/*
class StackR {
    static int stac[] = new int[5];  // Stack with fixed size
    static int top = -1;  // Initially stack is empty
    public static boolean isEmpty() {  // Check if stack is empty
        return top == -1;
    }
    // Check if stack is full
    public static boolean isFull() {
        return top == stac.length - 1;
    }
    // Push operation (insert element)
    public static void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Can't push " + data);
        } else {
            top++;
            stac[top] = data;
            System.out.println(data + " inserted into stack successfully.");
        }
    }
    // Pop operation (remove element)
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Can't pop.");
            return -1;  // Return -1 to indicate failure
        } else {
            int poppedElement = stac[top];  // Get the top element
            top--;  // Remove the element by moving top pointer
            return poppedElement;
        }
    }
    // Display elements of stack
    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println("==> " + stac[i]);
            }
        }
    }
    public static void main(String[] args) {
        // Checking stack operations
        System.out.println("Is stack empty? " + isEmpty());
        // Pushing elements
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);  // This should print "Stack Overflow"
        // Display stack
        display();
        // Popping elements
        System.out.println("Popped element: " + pop());
        System.out.println("Popped element: " + pop());
        // Display after popping
        display();
    }
}
*/

/*
class StackR{
    static int stac[] = new int[5];
    static int top = -1;
    public static boolean isEmpty(){
        return top == -1;
    }
    public static boolean isFull(){
        return top == stac.length-1;
    }
    public static void push(int data){
        if(isFull()){
            System.out.println("Stack overflow can't push " + data);
        }else{
            top++;
            stac[top] =data;
            System.out.println(data + " inserted success");
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
    }
}
*/

/*
class Stack{
    static int str[] = new int[5];
    static int top = -1;
    public static boolean isEmpty(){
        return top == -1;
    }
    public static boolean isFull(){
        return top == str.length-1;
    }
    public static void push(int data){
        if(isFull()){
            System.out.println("Stack data overflow can't push");
        }else{
            top++;
            str[top] = data;
            System.out.println("data inserted " + data);
        }
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("data underflow");
            return -1;
        }else{
            int popEle = str[top];
            top--;
            return popEle;
        }
    }
}
*/

/*
class StackR{
    static int arr[] = new int[5];
    static int top = -1;
    public static boolean isEmpty(){
        return top == -1;
    }
    public static void main(String[] args) {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("stack is not empty");
        }
    }
}
*/

/*
class StackR{
    static int arr[] = new int[5];
    static int top = -1;
    public static boolean isEmpty(){
        return top == -1;
    }
    public static boolean isFull(){
        return top == arr.length-1;
    }
    public static void push(int data){
        if(isFull()){
            System.out.println("Data is Full " + data);
        }else{
            top++;
            arr[top] = data;
            System.out.println("Data inserted " + data);
        }
    }
    public static void display(){
        if(isEmpty()){
            System.out.println("Data is empty");
        }else{
            for(int i = top; i >= 0; i--){
                System.out.println("Data Printed " + arr[i]);
            }
        }
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Data is underflow can't pop");
            return -1;
        }else{
            int popValue = arr[top];
            top--;
            System.out.println(popValue);
            return popValue;
        }
    }
    public static int peak(){
        if(!isEmpty()){
            return arr[top];
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        display();
        pop();
        peak();
        System.out.println(peak());
    }
}
*/


/*
class StackR{
    static int arr[] = new int[5];
    static int top = -1;
    public static boolean isEmpty(){
        return top == -1;
    }
    public static boolean isFull(){
        return top == arr.length-1;
    }
    public static void push(int data){
        if(isFull()){
            System.out.println("Data is Full " + data);
        }else{
            top++;
            arr[top] = data;
            System.out.println("Data inserted " + data);
        }
    }
    public static void display(){
        if(isEmpty()){
            System.out.println("Data is empty");
        }else{
            for(int i = top; i >= 0; i--){
                System.out.println("Data Printed " + arr[i]);
            }
        }
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Data is underflow can't pop");
            return -1;
        }else{
            int popValue = arr[top];
            top--;
            System.out.println(popValue);
            return popValue;
        }
    }
    public static void peek(){
        if(!isEmpty()){
            System.out.println("Top element (peek): " + arr[top]);
        } else {
            System.out.println("Stack is empty, no top element.");
        }
    }    
    public static void main(String[] args) {
        push(10);
        push(20);
        display();
        pop();
    }
}
*/

/*
class StackR{
    public static int arr[] = new int[5];
    public static int top = -1;
    public static boolean isEmpty(){
        return top == -1;
    }
    public static boolean isFull(){
        return top == arr.length-1;
    }
    public static void push(int data){
        if(isFull()){
            System.out.println("Stack is full " + data );
        }else{
            top++;
            arr[top] = data;
            System.out.println(data + " insertion success");
        }
    }
    public static void display(){
        if(isEmpty()){
            System.out.println("Data is Empty ");
        }else{
            System.out.println("Your data");
            for(int i = top; i >= 0; i--){
                System.out.println(arr[i]);
            }
        }
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            int topPop = arr[top];
            top--;
            return topPop;
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        display();
        System.out.println(pop());
    }
}
*/