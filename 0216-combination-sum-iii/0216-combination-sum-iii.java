class Solution {
    public void helper(List res, List list, int i, int sum, int n, int k ){
        if(sum > n ){
            return;
        }
        if(k==0 && sum == n){
            res.add(new ArrayList<>(list));
            return ;
        }
        if(k == 0){
            return;
        }
        for(int j = i; j <= 9; j++){
            list.add(j);
            helper(res,list,j + 1,sum + j,n,k-1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        helper(res,new ArrayList<>(), 1, 0, n, k);

        return res;
    }
}