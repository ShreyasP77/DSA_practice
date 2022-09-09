package BinaryTrees;

public class Recursive_Traversals {
    public static void preorder(BTree root){
        if(root==null) return ;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(BTree root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(BTree root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

}
