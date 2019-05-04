/**
 * Created by swati on 4/24/19.
 */


public class SameTree {

     static Node1 root1, root2;

    public boolean sameTree(Node1 root1, Node1 root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }

        return root1.val == root2.val &&
                sameTree(root1.left, root2.left) &&
                sameTree(root1.right, root2.right);
    }

    public static void main(String[] args){
        SameTree st = new SameTree();

        st.root1 = new Node1(11);
        st.root1.left = new Node1(16);
        st.root1.right = new Node1(15);
        st.root1.right.left = new Node1(18);


        st.root2 = new Node1(10);
        st.root2.left = new Node1(16);
        st.root2.right = new Node1(15);
        st.root2.right.left = new Node1(21);

        System.out.println("Result:  " +st.sameTree(root1, root2));





    }
}
