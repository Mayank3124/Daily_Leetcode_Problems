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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode curr = new TreeNode(val);
            curr.left = root;
            return curr;
        } 
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        

        while(!q.isEmpty() && depth-- > 2){
            int size = q.size();
            while(size-- > 0){
                TreeNode curr = q.remove();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);

            }

        }
        if(q.isEmpty()) return root;

        while(!q.isEmpty()){
            TreeNode Root = q.remove();

            TreeNode curr = Root.left;
            Root.left = new TreeNode(val);
            Root.left.left = curr;

            curr = Root.right;
            Root.right = new TreeNode(val);
            Root.right.right = curr;
        }

        return root;
    }
}