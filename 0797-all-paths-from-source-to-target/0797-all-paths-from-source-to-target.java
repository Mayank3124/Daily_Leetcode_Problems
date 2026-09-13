class Solution {
    public void helper(List res, List list, int idx, int[][] graph){
        if(idx == graph.length-1) {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int num : graph[idx]){
            list.add(num);
            helper(res,list,num,graph);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        helper(res,list,0,graph);
        return res;
    }
}