package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrder(BTree root){
        if (root == null) {
            return;
        }
        Queue<BTree> q = new LinkedList<BTree>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            BTree curNode = q.poll();
            if (curNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curNode.data+" ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }
}
