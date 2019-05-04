/**
 * Created by swati on 4/29/19.
 */
import java.util.Queue;
import java.util.LinkedList;
public class LevelOrderTraversal {

    public void levelOrder(Node1 root){
        if(root == null){
            return;
        }

        Queue<Node1> queue = new LinkedList<Node1>();
        queue.offer(root);

        System.out.println();

        while(queue.size() > 0){
            root = queue.poll();

            System.out.println(root.val + " ");

            if(root.left != null){
                queue.add(root.left);
            }

            if(root.right != null){
                queue.add(root.right);
            }
        }
    }

    public static void main(String args[]){
        BinaryTree1 tree = new BinaryTree1();

        tree.root = new Node1(10);
        tree.root.left = new Node1(21);
        tree.root.right = new Node1(19);
        tree.root.left.right = new Node1(15);
        tree.root.left.right.left = new Node1(18);
        tree.root.right.left = new Node1(-6);
        tree.root.right.right = new Node1(0);
        tree.root.right.left.right = new Node1(17);
        tree.root.right.right.right = new Node1(12);

        LevelOrderTraversal lot = new LevelOrderTraversal();
        lot.levelOrder(tree.root);
    }
}
