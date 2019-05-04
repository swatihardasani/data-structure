/**
 * Created by sunny on 4/9/19.
 */
public class BinaryTree {

    //Root node will be null for an empty tree

    private Node root;

    /*
     The binary tree is built using this nested node class.
     Each node stores one data element, and has left and right
     sub-tree pointer which may be null.
     The node is a "dumb" nested class -- we just use it for
     storage; it does not have any methods.
     */

    private static class Node{
        Node left;
        Node right;
        int data;

        Node(int newData){
            left = null;
            right = null;
            data = newData;

        }
    }

    /**
     Creates an empty binary tree -- a null root pointer.
     */

    public void BinaryTree(){
        root = null;
    }

    /**
     * Returns true if the given target is in the binary tree.
     Uses a recursive helper.
     */

    public boolean lookup(int data){
        return(lookup(root, data));
    }

    /**
     * Returns true if the given target is in the binary tree.
     Uses a recursive helper.
     */

    private boolean lookup(Node node, int data){
        if(node == null){
            return(false);
        }

        else if(data == node.data){
            return(true);
        }

        else if(data < node.data){
            return(lookup(node.left, data));
        }

        else{
            return(lookup(node.right, data));
        }
    }

    /**
     * Inserts the given data into the binary tree.
     Uses a recursive helper.
     */

    public void insert(int data){
        root = insert(root, data);
    }

    /**
     *Recursive insert -- given a node pointer, recur down and
     insert the given data into the tree. Returns the new
     node pointer (the standard way to communicate
     a changed pointer back to the caller).
     */

    private Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
        }

        else {
            if(data <= node.data){
                node.left = insert(node.left, data);
            }

            else{
                node.right = insert(node.right, data);
            }
        }

        return(node); // in any case, return the new pointer to the caller

    }
    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }

    public static void main(String args[]){
        BinaryTree b = new BinaryTree();

        b.insert(3);
        b.insert(8); b.insert(1);
        b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
        b.insert(20);b.insert(25);b.insert(15);b.insert(16);

        System.out.println("Original Tree : ");
        b.display(b.root);
        System.out.println("");
        System.out.println("Check whether Node with value 4 exists : " + b.lookup(4));

         b.build123c();
        b.display(b.root);

        System.out.println("Size of the binary tree: " +b.size());
    }


    /**
     *Build 123 using three pointer variables
     */

    public void build123a(){
        root = new Node(2);
        Node lChild = new Node(1);
        Node rChild = new Node(3);

        root.left = lChild;
        root.right = rChild;
    }

    /**
     * Build 123 using one pointer variable
     */

    public void build123b(){
        root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
    }

    /**
     * Build 123 by calling insert three times
     */

    public void build123c(){
        root = null;
        root = insert(root, 2);
        root = insert(root, 1);
        root = insert(root, 3);

    }


    /**
     * Returns the number of nodes in the tree
     * Uses a recursive helper that recurs
     * down the tree and count the nodes
     */

    public int size(){
        return(size(root));
    }

    private int size(Node node){
        if(node == null){
            return(0);
        }

        else{
            return(size(node.left) + 1 + size(node.right));
        }
    }


    /**
     * Returns the max root-to-leaf depth of the tree.
     * Uses a recursive helper that recurs down to find the max depth
     */

    public int maxDepth(){
        return (maxDepth(root));
    }

    private int maxDepth(Node node){
        if(node == null){
            return(0);
        }

        else{
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            //use the larger + 1

            return(Math.max(lDepth, rDepth) + 1);
        }
    }
}
