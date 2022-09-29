// Question
//  TREE                              SUBTREE
//         4
//        / \
//       5   1                          5
//      / \   \                        / \
//     3   4   4                      3   4





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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true; //definitely a subtree of tree
        if(root == null) return false; //i.e tree doesn't exist and subtree exists that's not possible 
        if(root.val == subRoot.val)
                if(isSameTree(root,subRoot))
                        return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
                return true;
        }
        if(p==null || q==null){
                return false;
        }
        return p.val==q.val && isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
        
    }
}
