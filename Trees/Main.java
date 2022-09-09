package BinaryTrees;

import static BinaryTrees.HtDiamSum.*;
import static BinaryTrees.LevelOrderTraversal.levelOrder;
import static BinaryTrees.Recursive_Traversals.*;

public class Main {
    public static void main(String[] args){
        int[] nodes = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Create_BT tree = new Create_BT();
        BTree root = tree.buildTree(nodes);
        System.out.println(root.data);
//        System.out.println("\npreorder\n");
//        preorder(root);
//        System.out.println("\ninorder\n");
//        inorder(root);
//        System.out.println("\npostorder\n");
//        postorder(root);
//        levelOrder(root);
        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));

    }
}
