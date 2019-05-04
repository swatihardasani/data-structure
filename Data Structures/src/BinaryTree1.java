/**
 * Created by sunny on 4/18/19.
 */
class Node1{
    int val;
    Node1 left, right;

    public Node1(int data){
        val = data;
        left = right = null;
    }


}

public class BinaryTree1 {

    Node1 root;

    BinaryTree1(){
        root = null;
    }

    /* Given a binary tree, print its nodes "bottom-up" postorder traversal */

     void printPostOrder(Node1 node){
        if(node == null){
            return;
        }

        //first recur on left subtree
        printPostOrder(node.left);

        //then recur on right subtree
        printPostOrder(node.right);

        //now deal with the node
        System.out.println(node.val + " ");
    }

    public void printPostOrder(){
        printPostOrder(root);
    }

     void printInOrder(Node1 node){
        if(node == null){
            return;
        }

        //first recur on left subtree
        printInOrder(node.left);

        /* then print the data of node */
        System.out.println(node.val + " ");

        //now recur on right subtree
        printInOrder(node.right);
    }

    public void printInOrder(){
        printInOrder(root);
    }


    void printPreOrder(Node1 node){
        if(node == null){
            return;
        }

        //first print data of node
        System.out.println(node.val + " ");

        //then recur on left subtree
        printPreOrder(node.left);

        //now recur on right subtree
        printPreOrder(node.right);
    }

    public void printPreOrder(){
        printPreOrder(root);
    }

    /* computes number of nodes in tree */
    int size(Node1 node){
        if(node == null){
            return 0;
        }
        else{

            return 1 + size(node.left) + size(node.right);
        }
    }

    public int size(){

        return size(root);
    }


    int maxDepth(Node1 node){
        if(node == null){
            return 0;
        }

        else{
            //compute the depth of each subtree

            System.out.println(node.val + " ");

            int lDepth = maxDepth(node.left);

            System.out.println(lDepth + " ");

            int rDepth = maxDepth(node.right);

            System.out.println(rDepth + " ");

            if(lDepth > rDepth)
                return(lDepth + 1);

            else
                return(rDepth + 1);

        }


    }

    public int maxDepth(){
        return maxDepth(root);
    }


    public static void main(String args[]){
        BinaryTree1 tree = new BinaryTree1();

        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        System.out.println("Postorder traversal of binary tree is    ");
        tree.printPostOrder();

        System.out.println("Inorder traversal of binary tree is  ");
        tree.printInOrder();

        System.out.println("Preorder traversal of binary tree is  ");
        tree.printPreOrder();

        System.out.println("The size of binary tree is: " + tree.size());

        System.out.println("The height of binary tree is  " + tree.maxDepth());

    }


}
