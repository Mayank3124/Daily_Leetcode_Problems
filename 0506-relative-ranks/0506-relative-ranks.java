class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] arr = new String[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> b[0] - a[0]
        );

        for(int i = 0; i < n; i++){
            pq.offer(new int[]{score[i],i});
        }

        for(int i = 1; i <= n; i++){
            String s = "";
            if(i==1){
                s = "Gold Medal";
            }else if(i==2){
                s = "Silver Medal";
            }else if(i==3){
                s = "Bronze Medal";
            }else{
                s = "" + i;
            }
            arr[pq.poll()[1]] = s;
        }
        return arr;

    }
}