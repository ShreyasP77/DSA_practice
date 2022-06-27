/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
       
        inorderFetch(root,inorder);
        return inorder;
            
    }
    public static void inorderFetch(TreeNode root, List<Integer> inorder){
         if(root == null) return ;
        inorderFetch(root.left,inorder);
        inorder.add(root.val);
        inorderFetch(root.right,inorder);
        
    }
    
}
