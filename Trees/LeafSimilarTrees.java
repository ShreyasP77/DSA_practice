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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        collectLeafNodes(root1,leaves1);
        collectLeafNodes(root2,leaves2);
        if(leaves1.size()!=leaves2.size())
                return false;
        int i=0, j=0;
        while(i<leaves1.size() && j<leaves2.size()){
                if(leaves1.get(i++) != leaves2.get(j++)){
                        return false;}
                
        }
        return true;

    }
    public void collectLeafNodes(TreeNode root, List<Integer> leaves) {
        if(root==null) return;
        if(root.left==null && root.right==null)
            leaves.add(root.val);
        
        collectLeafNodes(root.left,leaves);
        collectLeafNodes(root.right,leaves);
            

    }
}
