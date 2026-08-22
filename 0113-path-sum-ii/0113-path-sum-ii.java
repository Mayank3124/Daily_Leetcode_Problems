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
    public void Helper(TreeNode root, List list, List path, int target){
        target -= root.val;
        path.add(root.val);
        if(root.left == null && root.right == null){
            if(target == 0)  list.add(new ArrayList<>(path));;
            path.remove(path.size()-1);
            return ;
        }
        if(root.left != null) {
            Helper(root.left,list,path,target);
        }
        if(root.right != null) {
            Helper(root.right,list,path,target);
        }

        path.remove(path.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
    if(root== null) return list;
        Helper(root,list,path,targetSum);

        return list;
    }
}