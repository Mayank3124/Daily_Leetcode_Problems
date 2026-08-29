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
    public boolean isCheck(TreeNode root, TreeNode sub){
        if(root == null && sub == null) return true;
        if(root == null || sub == null ) return false;
        if(root.val == sub.val) return isCheck(root.left,sub.left) && isCheck(root.right,sub.right);
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root ==  null ){
            return false;
        }
        if(root.val != subRoot.val){
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
        return isCheck(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }
}