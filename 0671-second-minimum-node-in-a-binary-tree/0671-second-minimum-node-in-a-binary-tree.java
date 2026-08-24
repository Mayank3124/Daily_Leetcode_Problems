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
    public int findSecondMinimumValue(TreeNode root) {
        long min1 = (long)Integer.MAX_VALUE + 1;
        long min2 = (long)Integer.MAX_VALUE + 1;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        while(!Q.isEmpty()){
            int size = Q.size();
            while(size-- > 0){
                TreeNode curr = Q.remove();
                if(curr.val < min1){
                    min2 = min1; 
                    min1 = curr.val;
                    
                }else if(curr.val < min2 && curr.val != min1){
                    min2 = curr.val;
                }
                if(curr.left != null) Q.add(curr.left);
                if(curr.right != null) Q.add(curr.right);
            }
        }
        if(min2 == (long)Integer.MAX_VALUE + 1) return -1;
        return (int)min2;


    }
}