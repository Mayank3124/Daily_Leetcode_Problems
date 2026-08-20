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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root == null)
        {
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int val = 0;
            int x=q.size();
            for(int i=0;i<x;i++){
                TreeNode curr = q.remove();
                val = curr.val;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
                
            }
            ans.add(val);
        }
        return ans;
    }
}