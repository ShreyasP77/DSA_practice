package BinaryTrees;

public class HtDiamSum {
    public static int countNodes(BTree root){
        if (root == null) {
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes+rightNodes+ 1;
    }
    public static int sumOfNodes(BTree root){
        if (root == null) {
            return 0;
        }
        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);
        return leftNodes+rightNodes+ root.data;
    }

    public static int height(BTree root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+ 1;
    }

    public static int diameter(BTree root){
        int ans = 0;
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(ans,1+lh+rh);
        return ans;
    }
}
