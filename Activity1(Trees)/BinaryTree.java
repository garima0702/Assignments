
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

//-----------------Task1--------------------------------------------
//---------Creation of Binary Search Tree ---------------------

class BinaryTree {

    Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

//-----------------Task2--------------------------------------------
//-----------------Traversals of Binary Search Tree-----------------

//-----------------Inorder Traversal-----------------
    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

//-----------------Preorder Traversal-----------------
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }

//-----------------Postorder Traversal-----------------

    void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


//-----------------Task3--------------------------------------------
//-----------------Search in the Binary Search Tree-----------------

    boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }  
    
    public void printTree(Node root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.data + " ");
            printTree(root.right);
        }
    }





    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


//------------Insertion of elements in the Binary Search Tree----------------

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);

        System.out.println("Tree Structure:");
        tree.printTree(tree.root);
        System.out.println();
        
        
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);



        System.out.println();
        int searchValue1 = 40;  
        System.out.println("Searching for " + searchValue1 + ": " + tree.search(tree.root, searchValue1));

        int searchValue2 = 100;  
        System.out.println("Searching for " + searchValue2 + ": " + tree.search(tree.root, searchValue2));
    }
}

