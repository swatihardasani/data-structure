/**
 * Created by sunny on 5/2/19.
 */
import java.util.Deque;
import java.util.LinkedList;
public class IterativePostOrder {

    void iterativePostorder(Node1 root){
        if(root == null){
            return;
        }

       Deque<Node1> stack1 = new LinkedList<Node1>();
        Deque<Node1> stack2 = new LinkedList<Node1>();

        stack1.push(root);

        while(!stack1.isEmpty()){
            root = stack1.pop();
            stack2.push(root);

            if(root.left != null){
                stack1.push(root.left);
            }

            if(root.right != null){
                stack1.push(root.right);
            }
        }

        while(!stack2.isEmpty()){
            root = stack2.pop();
            System.out.println(root.val);
        }

    }

    public static void main(String args[]){
        BinaryTree1 tree = new BinaryTree1();

        Node1 root = null;

        tree.root = new Node1(1);
        tree.root.left = new Node1(-10);
        tree.root.right = new Node1(11);
        tree.root.left.right = new Node1(5);
        tree.root.left.right.right = new Node1(3);
        tree.root.right.left = new Node1(13);
        tree.root.right.right = new Node1(16);

        IterativePostOrder ipo = new IterativePostOrder();
        ipo.iterativePostorder(tree.root);

    }
}
