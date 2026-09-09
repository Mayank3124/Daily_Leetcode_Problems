class Solution {
    public void combinations(List result, List list, int n, int k, int idx){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        while(idx++ < n){
            list.add(idx);
            combinations(result,list,n,k,idx);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        combinations(result,new ArrayList<>(),n,k,0);
        return result;
    }
}