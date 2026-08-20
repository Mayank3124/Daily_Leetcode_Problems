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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null) return list;

        Queue<TreeNode> Q = new LinkedList<>();

        Q.add(root);

        while(!Q.isEmpty()){

            List<Integer> level = new ArrayList<>();
            int size = Q.size();

            for(int i = 0; i < size; i++){
                TreeNode curr = Q.remove();
                level.add(curr.val);

                if(curr.left != null) Q.add(curr.left);
                if(curr.right != null) Q.add(curr.right);
            }

            list.add(0,level);
        }
        return list;

    }
}