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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> preorder = new ArrayList<Integer>();
      
        preorderFetch(root,preorder);
        return preorder;
            
    }
    public static void preorderFetch(TreeNode root, List<Integer> preorder){
         if(root == null) return ;
        
        preorder.add(root.val);
        preorderFetch(root.left,preorder);
        
        preorderFetch(root.right,preorder);
        
    }
    
}
