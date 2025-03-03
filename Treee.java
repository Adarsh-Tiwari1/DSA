// DFS (Depth First Search) me backtracking hoti hai, lekin BFS (Breadth First Search) me nahi hoti hai.

// a tree is a non-linear data structure that consists of nodes connected by edge .
// It is widely used in various applications like searching, sorting, and organizing data efficiently .
// Node : Each element in a tree.
// Root : The topmost node of the tree .
// Leaf Node: A node that has no children .
// Parent Node: A node that has child nodes .
// Child Node: A node that has a parent node .
// Edge: The connection between two nodes .
// sibling : same parent node .
// Degree : the total number of child of a node is called as degree .
// internal Node : the node which has at least one child .
// Height of a Tree: The longest path from the root to a leaf .


// Types of Trees : 
// 1 >  Binary Tree: Each node has at most two children (left and right) .
// 2 > Binary Search Tree (BST): A binary tree where the left child is smaller, and the right child is larger than the parent .
// 3 > Balanced Trees : Trees like AVL and Red-Black trees, which maintain balance to optimize search time .
// 4 > Heap: A tree used for priority-based operations (Min Heap, Max Heap).
// 5 > Trie (Prefix Tree): A tree used for storing strings efficiently.

/*
class Tree {
    public int data;
    Tree left; // left: Points to the left child.
    Tree right;

    public Tree(int data) { // Constructor (Tree(int data))
        this.data = data;
        left = null;
        right = null;
    }
    // Preorder Traversal: Root → Left → Right
    public static void preOrder(Tree root) {
        if (root == null) {
            return;
        }
        System.out.println("====> " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    // Postorder Traversal: Left → Right → Root
    public static void postOrder(Tree root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println("====> " + root.data);
    }
    public static void main(String[] args) {
        Tree t1 = new Tree(10);
        Tree t2 = new Tree(20);
        t1.left = t2;
        Tree t3 = new Tree(30);
        t1.right = t3;
        Tree t4 = new Tree(40);
        t1.left.left = t4;
        Tree t5 = new Tree(50);
        t1.left.right = t5;
        Tree t6 = new Tree(60);
        t1.right.left = t6;
        Tree t7 = new Tree(70);
        t1.right.right = t7;

        System.out.println("Printing tree data using Preorder traversal:");
        preOrder(t1);

        System.out.println("Printing tree data using Postorder traversal:");
        postOrder(t1);
    }
}
*/



// if (root == null) { return; } recursion ka base case hai, jo binary tree traversal me errors hone se bachata hai.


// Type of Tree .
// 
// 1 : General Tree : A Tree can have any numbre of children .. 
// 2 : Binary Tree 3 : Binary Search Tree 4 : Complete Binary Tree 5 : Full Binary Tree :
// 6 Perfect Binary Tree  7 : Left Skewed Tree  8 : Right Skewed Tree  9 : Balanced Binary [AVL Tree, Red Black Tree]  
// 10 : B-Tree  11 : Heap(Max Heap, Min Heap) 

/*
class Treee {
    public int data;
    Treee left;
    Treee right;

    public Treee(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public static void preOrder(Treee root) {
        if (root == null) {
            return;
        }
        System.out.println("==>" + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Treee root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println("===>" + root.data);
        inOrder(root.right);
    }
    public static void postOrder(Treee root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println("===>" + root.data);
    }
    public static Treee insert(Treee root, int data) {
        if (root == null) {
            return new Treee(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void main(String[] args) {
        Treee t1 = new Treee(100);
        Treee t2 = new Treee(20);
        t1.left = t2;
        Treee t3 = new Treee(500);
        t1.right = t3;
        Treee t4 = new Treee(10);
        t1.left.left = t4;
        Treee t5 = new Treee(30);
        t1.left.right = t5;

        t1 = insert(t1, 40);
        t1 = insert(t1, 5);
        t1 = insert(t1, 200);
        t1 = insert(t1, 600);

        System.out.println("\nPrint Data of Tree Using In-order Traversal:");
        inOrder(t1);
    }
}
*/

/*
class Treee {
    public int data;
    Treee left;
    Treee right;

    public Treee(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public static void preOrder(Treee root) {
        if (root == null) {
            return;
        }
        System.out.println("==> " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Treee root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println("==> " + root.data);
        inOrder(root.right);
    }
    public static void postOrder(Treee root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println("==> " + root.data);
    }
    public static Treee insert(Treee root, int data) {
        if (root == null) {
            return new Treee(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static Treee findMin(Treee root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static Treee delete(Treee root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            // Case 1 & 2: Node with one or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Node with two children (Find inorder successor)
            Treee minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = delete(root.right, minNode.data);
        }
        return root;
    }
    public static void main(String[] args) {
        Treee t1 = new Treee(100);
        t1 = insert(t1, 20);
        t1 = insert(t1, 500);
        t1 = insert(t1, 10);
        t1 = insert(t1, 30);
        t1 = insert(t1, 40);
        t1 = insert(t1, 5);

        System.out.println("\nBefore Deletion - Inorder Traversal:");
        inOrder(t1);

        t1 = delete(t1, 5);
        t1 = delete(t1, 30);

        System.out.println("\nAfter Deletion - Inorder Traversal:");
        inOrder(t1);
    }
}
*/

/*
class Treee {
    public int data;
    Treee left;
    Treee right;

    public Treee(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void preOrder(Treee root) {
        if (root == null) {
            return;
        }
        System.out.println("==> " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Treee root = new Treee(100);
        root.left = new Treee(50);
        root.right = new Treee(200);
        root.left.left = new Treee(30);
        root.left.right = new Treee(70);

        System.out.println("Preorder Traversal:");
        preOrder(root);
    }
}
*/

/*
class Tree {
    public int data;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void preOrder(Tree root) {
        if (root == null) {
            return;
        }
        System.out.println("==> " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Tree t1 = new Tree(100);
        Tree t2 = new Tree(20);
        t1.left = t2;
        Tree t3 = new Tree(500);
        t1.right = t3;
        Tree t4 = new Tree(10);
        t1.left.left = t4;
        Tree t5 = new Tree(30);
        t1.left.right = t5;

        System.out.println("Preorder Traversal:");
        preOrder(t1); 
    }
}
*/

/*
class Treee{
    public int data;
    Treee left;
    Treee right;
    public Treee(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void inOrder(Treee root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Treee t1 = new Treee(10);
        Treee t2 = new Treee(20);
        t1.left = t2;
        Treee t3 = new Treee(30);
        t1.right = t3;
        Treee t4 = new Treee(40);
        t1.left.left = t4;
        Treee t5 = new Treee(50);
        t1.left.right = t5;
        inOrder(t1);
    }
}
*/

/*
class Treee{
    public int data;
    Treee left;
    Treee right;
    public Treee(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void preOrder(Treee root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Treee t1 = new Treee(10);
        Treee t2 = new Treee(20);
        t1.left = t2;
        Treee t3 = new Treee(30);
        t1.right = t3;
        Treee t4 = new Treee(40);
        t1.left.left = t4;
        Treee t5 = new Treee(50);
        t1.left.right = t5;
        Treee t6 = new Treee(60);
        t1.right.left = t6;
        Treee t7 = new Treee(70);
        preOrder(t1);
    }
}
*/

/*
class Treee{
    public int data;
    Treee left;
    Treee right;
    public Treee(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void postOrder(Treee root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Treee t1 = new Treee(10);
        Treee t2 = new Treee(20);
        t1.left = t2;
        Treee t3 = new Treee(30);
        t1.right = t3;
        Treee t4 = new Treee(40);
        t1.left.left = t4;
        Treee t5 = new Treee(50);
        t1.left.right = t5;
        Treee t6 = new Treee(60);
        t1.right.left = t6;
        Treee t7 = new Treee(70);
        postOrder(t1);
    }
}
*/

/*
class Treee {
    public int data;
    Treee left;
    Treee right;

    public Treee(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    // Insert function for BST
    public static Treee insert(Treee root, int data) {
        if (root == null) {
            return new Treee(data);  // Create a new node if root is null
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;  // After inserting, we return the updated tree root, ensuring the structure remains intact.
    }
    // InOrder Traversal (Left -> Root -> Right)
    public static void inOrder(Treee root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Treee t1 = new Treee(100);
        t1 = insert(t1, 20);
        t1 = insert(t1, 500);
        t1 = insert(t1, 10);
        t1 = insert(t1, 30);
        t1 = insert(t1, 40);
        t1 = insert(t1, 5);
        t1 = insert(t1, 5);  // Duplicate value (No effect in BST)

        System.out.println("InOrder Traversal of BST:");
        inOrder(t1);
    }
}
*/

/*
class Tree {
    public int data;
    public Tree left, right;

    public Tree(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public static void inOrder(Tree root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " "); // Print in a single line
        inOrder(root.right);
    }
    public static Tree insert(Tree root, int data) {
        if (root == null) {
            return new Tree(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void main(String[] args) {
        Tree root = new Tree(100);
        insert(root, 70);
        insert(root, 60);
        insert(root, 65);
        insert(root, 90);
        insert(root, 150);
        insert(root, 120);
        insert(root, 190);
        // Call inOrder traversal to print the BST
        System.out.print("In-order Traversal: ");
        inOrder(root);
    }
}
*/

/*
class Treee {
    public int data;
    public Treee left, right;

    public Treee(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public static void inOrder(Treee root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static Treee insert(Treee root, int data) {
        if (root == null) {
            return new Treee(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public boolean bst(Treee root, int search) {
        if (root == null) {
            return false;
        }
        if (root.data == search) {
            return true;
        }
        if (search < root.data) {
            return bst(root.left, search);
        }
        return bst(root.right, search);
    }
    public static void main(String[] args) {
        Treee root = new Treee(100);
        insert(root, 70);
        insert(root, 60);
        insert(root, 65);
        insert(root, 90);
        insert(root, 150);
        insert(root, 120);
        insert(root, 190);
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println(); 
        // Searching for elements
        System.out.println("Is 90 in the tree? " + root.bst(root, 90));
        System.out.println("Is 191 in the tree? " + root.bst(root, 191));
    }
}
*/



