import java.util.*;
import java.util.LinkedList;

/**
 * Created by sunny on 5/3/19.
 */

public class IterativeInOrder {

    void iterativeInorder(Node1 root){
        if(root == null){
            return;
        }

        Deque<Node1> stack  = new LinkedList<Node1>();


        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            }

            else{
                if(stack.isEmpty()) {
                    break;
                }
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;

            }

        }
    }

    public static void main(String args[]){
        BinaryTree1 tree = new BinaryTree1();

        Node1 root = null;

        tree.root = new Node1(10);
        tree.root.left = new Node1(11);
        tree.root.right = new Node1(16);
        tree.root.left.right = new Node1(-1);
        tree.root.left.left = new Node1(2);
        tree.root.right.left = new Node1(10);
        tree.root.right.right = new Node1(11);
        tree.root.right.left = new Node1(9);

        IterativeInOrder iio = new IterativeInOrder();
        iio.iterativeInorder(tree.root);
    }
}
