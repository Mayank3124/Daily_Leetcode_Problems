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
    public boolean helper(TreeNode root, int target){
        target -= root.val;
        if(root.left == null && root.right == null){
            return target == 0; 
        }
        boolean Left = false;
        boolean Right = false;

        if(root.left != null){
            Left = helper(root.left,target);
        }
        if(root.right != null){
            Right = helper(root.right,target);
        }

        return Left || Right;

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return helper(root,targetSum);
        
    }
}