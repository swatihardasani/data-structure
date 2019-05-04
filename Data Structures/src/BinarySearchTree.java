/**
 * Created by swati on 4/23/19.
 */

class Node2{
    int val;
    Node2 left, right;

   public Node2(int data){
       val = data;
       left = right = null;
   }
}
public class BinarySearchTree {
     static Node2 root;

    BinarySearchTree(){
        root = null;
    }

    Node2 Search(Node2 root, int key){
        if(root == null){
            return null;
        }

        if(root.val == key){
            return root;
        }

        else if(root.val < key){
            return Search(root.right, key);
        }
        else{
            return Search(root.left, key);
        }
    }

    Node2 Insert(Node2 root, int data){
        Node2 node = new Node2(data);

        if(root == null){
            return node;
        }

        Node2 parent = null;
        Node2 current = root;

        while(current != null){
            parent = current;
            if(current.val <= data){
                current = current.right;

            }
            else{
                current = current.left;
            }
        }

        if(parent.val <= data){
            parent.right = node;

        }
        else{
            parent.left = node;
        }

        return root;

    }




    void printInOrder(Node2 node){
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


    public static void main(String[] args){
        BinarySearchTree BST = new BinarySearchTree();

        BST.root = new Node2(10);
        BST.root.left = new Node2(-5);
        BST.root.right = new Node2(25);
        BST.root.left.left = new Node2(-10);
        BST.root.left.right = new Node2(5);
        BST.root.right.right = new Node2(36);

        System.out.println("Found Key " + BST.Search(root, 25));

        BST.Insert(root, 6);

        System.out.println("Inorder traversal of binary tree is  ");
        BST.printInOrder();

    }

}
