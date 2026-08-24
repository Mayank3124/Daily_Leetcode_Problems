/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        int i = 0;

        if(root == null) return i;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            i++;
            int size = q.size();
            while(size-- > 0){
                Node curr = q.remove();
                for(int j = 0; j < curr.children.size();j++){
                    q.add(curr.children.get(j));
                }
            }
        }

        return i;
    }
}