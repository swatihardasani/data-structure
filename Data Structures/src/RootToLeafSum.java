/**
 * Created by sunny on 4/26/19.
 */
import java.util.ArrayList;
import java.util.List;
public class RootToLeafSum {



    public boolean printPath(Node1 root, int sum, List<Node1> path){
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){  //check leaf node
            if(root.val == sum){
                path.add(root);
                return true;
            }
            else{
                return false;

            }
        }

        if(printPath(root.left, sum-root.val, path) || printPath(root.right, sum-root.val, path)){
            path.add(root);
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        BinaryTree1 tree = new BinaryTree1();


        tree.root = new Node1(10);
        tree.root.left = new Node1(16);
        tree.root.left.right = new Node1(-3);
        tree.root.right = new Node1(5);
        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(11);

        RootToLeafSum rt = new RootToLeafSum();

        List<Node1> result = new ArrayList<>();

        boolean r = rt.printPath(tree.root, 26, result);

        if(r){
            result.forEach(node1 -> System.out.print(node1.val + " "));

        }
        else{
            System.out.println("No path for sum   " + 26);
        }
    }
}
