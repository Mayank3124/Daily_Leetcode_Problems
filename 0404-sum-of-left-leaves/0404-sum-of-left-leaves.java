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
    public int sum(TreeNode root, int s){
        if(root == null) return s;
        
        if(root.left != null && root.left.left == null && root.left.right == null) s += root.left.val;
        return sum(root.left, s) + sum(root.right, 0);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, 0);
        
    }
}