class Solution {
    public void helper(List res, List list, int i, int n, int k ){
        if( n < 0 ){
            return;
        }
        if(k==0 && 0 == n){
            res.add(new ArrayList<>(list));
            return ;
        }
        if(k == 0){
            return;
        }
        for(int j = i; j <= 9; j++){
            list.add(j);
            helper(res,list,j + 1,n - j,k-1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        helper(res,new ArrayList<>(), 1, n, k);

        return res;
    }
}