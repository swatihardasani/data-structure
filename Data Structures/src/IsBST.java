/**
 * Created by swati on 4/27/19.
 */
public class IsBST {

    public boolean isBST(Node1 root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node1 root, int min, int max){
        if(root == null){
            return true;
        }

        if(root.val <= min || root.val > max){
            return false;
        }

        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

    public static void main(String args[]){
        BinaryTree1 tree = new BinaryTree1();

        Node1 root = null;

        tree.root = new Node1(10);
        tree.root.left = new Node1(10);
        tree.root.left.left = new Node1(-5);
        tree.root.right = new Node1(19);
        tree.root.right.left = new Node1(17);
        tree.root.right.right = new Node1(21);

        IsBST bst = new IsBST();
        System.out.println(bst.isBST(tree.root));
    }
}
