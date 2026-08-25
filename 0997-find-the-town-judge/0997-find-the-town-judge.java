class Solution {
    public int findJudge(int n, int[][] trust) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list1.add(new ArrayList<>());
            list2.add(new ArrayList<>());
        }

        for(int[] arr : trust){
            list1.get(arr[0]-1).add(arr[1]);
            list2.get(arr[1]-1).add(arr[0]);
        }

        for(int i = 0; i < n; i++){
            if(list1.get(i).size() == 0 && list2.get(i).size() == n-1) return i+1;
        }
        return -1;
    }
}