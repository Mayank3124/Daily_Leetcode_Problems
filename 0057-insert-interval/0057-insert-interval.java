class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        int idx = 0;
        

        while(idx < n && intervals[idx][1] < newInterval[0]){
            list.add(new int[]{intervals[idx][0],intervals[idx][1]});
            idx++;
        }
        if(idx == n){
            list.add(newInterval);
            return list.toArray(new int[list.size()][]);
        }
        if(newInterval[1] < intervals[idx][0]){
            list.add(newInterval);
            for(int i = idx; i < n; i++ ){
                list.add(new int[]{intervals[i][0],intervals[i][1]});
                
            }
            return list.toArray(new int[list.size()][]);
        }
        
        System.out.print(idx);
        int start = Math.min(intervals[idx][0],newInterval[0]);
        int end = Math.max(intervals[idx][1],newInterval[1]);

        for(int i = idx+1; i < n; i++){
            if(intervals[i][0] <= end){
                end = Math.max(intervals[i][1],end);
            }else{
                list.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}