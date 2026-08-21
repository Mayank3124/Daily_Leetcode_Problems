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
    public List<String> Helper(TreeNode root, List list, String str){
        

        if(root.left == null && root.right == null){
            list.add(str);
            return list;
        }
        

        if(root.left != null){
            Helper(root.left, list, str + "->" + root.left.val);
        }
        if(root.right != null){
            Helper(root.right, list, str + "->" + root.right.val);
        }

        return list;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String str = "" + root.val;
        

        return Helper(root, list, str);
    }
}