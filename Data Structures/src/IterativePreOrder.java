import java.util.*;
import java.util.LinkedList;

/**
 * Created by sunny on 5/3/19.
 */
public class IterativePreOrder {

    void iterativePreorder(Node1 root){
        if(root == null) return;

        Deque<Node1> stack = new LinkedList<Node1>();

        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            System.out.println(root.val);

            if(root.right != null){
                stack.push(root.right);
            }

            if(root.left != null){
                stack.push(root.left);
            }
        }


    }

    public static void main(String args[]){
        BinaryTree1 tree = new BinaryTree1();

        Node1 root = null;

        tree.root = new Node1(10);
        tree.root.left = new Node1(5);
        tree.root.right = new Node1(19);
        tree.root.left.left = new Node1(2);
        tree.root.left.right = new Node1(11);
        tree.root.left.left.right = new Node1(8);
        tree.root.right.left = new Node1(-2);
        tree.root.right.right = new Node1(6);


        IterativePreOrder ipt = new IterativePreOrder();
        ipt.iterativePreorder(tree.root);
    }
}
