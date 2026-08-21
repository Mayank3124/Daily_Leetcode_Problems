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
        s = s*10 + root.val;
        if(root.left == null && root.right == null){
            return s;
        }
        int Left = 0;
        int Right = 0;
        if(root.left != null){
            Left = sum(root.left,s);
        }
        if(root.right != null){
            Right = sum(root.right,s);
        }
        return Left + Right;

    }
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
}